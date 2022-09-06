package chapter3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;




public class StudentSorceServiceImpl implements IStudentSorceService
{

	@Override
	public Set<StudentInfoBean> union(Set<StudentInfoBean> stuSet1, Set<StudentInfoBean> stuSet2)
	{
		Set<StudentInfoBean> result = new HashSet<>();
		//参数校验。
		if(null == stuSet1 && null == stuSet2)
		{
			return result;
		}
		
		if(null == stuSet1)
		{
			return stuSet2;
		}
		
		if(null == stuSet2)
		{
			return stuSet1;
		} 
		
		result.addAll(stuSet1);
//		result.addAll(stuSet2);
		for(StudentInfoBean stu:stuSet2)
		{
			result.add(stu);
		}
		for(StudentInfoBean stu:stuSet1)
		{
			result.add(stu);
		}
		return result;
	}

	@Override
	public Set<StudentInfoBean> getFailedStudentList(Set<StudentInfoBean> stuSet1)
	{
		Set<StudentInfoBean> result = new HashSet<>();
		for(StudentInfoBean stu:stuSet1)
		{
			if(stu.getChineseSorce()<60||stu.getEnglishSorce()<0||stu.getMathSorce()<60)
			{
				result.add(stu);
			}
		}
		return result;
	}

	@Override
	public Set<StudentInfoBean> getSorcesBubbleSortList(Set<StudentInfoBean> stuSet)
	{
		//step1:计算总分
		//TODO
		//降序排序
		List<StudentInfoBean> list=new ArrayList<StudentInfoBean>(stuSet);
		int length=stuSet.size();
		for(int i=0;i<length-1;i++) {
			for(int j=0;j<length-i-1;j++) {
				StudentInfoBean student1=list.get(j);
				StudentInfoBean student2=list.get(j+1);
				if(student1.getAllSorce()<student2.getAllSorce()) {
					StudentInfoBean temp=list.get(j);
					list.set(j, student2);
					list.set(j+1, temp);
				}
			}
		}
		return new LinkedHashSet<StudentInfoBean>(list);
	}


	@Override
	public Set<StudentInfoBean> getStudentInfoByName(Set<StudentInfoBean> stuSet,String name) 
	{
		/*
		 * if(null==name || null==stuSet || stuSet.isEmpty()) { throw new
		 * Exception("非法参数: name不能为空 或者stuSet为空"); }
		 */
		Set<StudentInfoBean> result = new HashSet<>();
		for(StudentInfoBean stu : stuSet){
			if(name.equals(stu.getName())) {
				result.add(stu);
			}
		}
		return result;
	}

	@Override
	public StudentInfoBean getStudentInfoById(Set<StudentInfoBean> stuSet, Integer id)
	{
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public Set<StudentInfoBean> getBinaryStudentInfoByName(Set<StudentInfoBean> stuSet)
//	{
//		//
//		//List list= new ArrayList<>();
//	    List<StudentInfoBean> list = new ArrayList<StudentInfoBean>(stuSet);
//		
//		return null;
//	}
	
}