package chapter3;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TestStudentSorce {
	private static IStudentSorceService service = new StudentSorceServiceImpl();
	private static Set<StudentInfoBean> stuSet;
	
	public static void main(String[] args) {
		if(null==stuSet) {
			
		}
		Random random=new Random();
		stuSet=new HashSet<StudentInfoBean>();
		for(int i=1;i<11;i++) {
			int chineseSorce=random.nextInt(100);
			int mathSorce=random.nextInt(100);
			int englishSorce=random.nextInt(100);
			stuSet.add(new StudentInfoBean("zhangsan"+i,i,chineseSorce,mathSorce,englishSorce,
					chineseSorce+mathSorce+englishSorce));
		}
		
		System.out.println("按名字查找");
		Set<StudentInfoBean> students=service.getStudentInfoByName(stuSet,"zhangsan1");
		System.out.println(students);
		
		System.out.println("排序");
		Set<StudentInfoBean> students2=service.getSorcesBubbleSortList(stuSet);
		for(StudentInfoBean item:students2) {
			System.out.println(item);
		}
		
	}
	

}
