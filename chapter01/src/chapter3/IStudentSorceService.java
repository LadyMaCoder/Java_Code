package chapter3;

import java.util.Set;





/**
 * 
 * @author mahzuxin
 *
 */
public interface IStudentSorceService
{
	/**
	 * 去重，合并操作，合并stuSet1，stuSet2
	 * @param stuSet1
	 * @param stuSet2
	 * @return
	 */
	Set<StudentInfoBean> union(Set<StudentInfoBean> stuSet1, Set<StudentInfoBean> stuSet2);
	
	
	/**
	 * 获取至有一门不及格的学生列表.
	 * @param stuSet1  班级学生名单
	 * @return  含至少一门不及格的学生列表
	 */
	Set<StudentInfoBean> getFailedStudentList(Set<StudentInfoBean> stuSet1);
	
	
	/**
	 * 冒泡：按总分降序排序.
	 * @param stuSet1
	 * @param stuSet2
	 * @return
	 */
	Set<StudentInfoBean> getSorcesBubbleSortList(Set<StudentInfoBean> stuSet);
	
//	/**
//	 * 希尔：按总分降序排序.
//	 * @param stuSet1
//	 * @param stuSet2
//	 * @return
//	 */
//	Set<StudentInfoBean> getSorcesShellSortList(Set<StudentInfoBean> stuSet);
	
	/**
	 * 顺序查找：根据名字查找学生信息.
	 * @param stuSet1
	 * @param stuSet2
	 * @return
	 */
	Set<StudentInfoBean> getStudentInfoByName(Set<StudentInfoBean> stuSet,String name);
	
	/**
	 * 顺序查找：根据名字查找学生信息.
	 * @param stuSet1
	 * @param stuSet2
	 * @return
	 */
	StudentInfoBean getStudentInfoById(Set<StudentInfoBean> stuSet,Integer id);
	
//	/**
//	 * 二分查找：根据名字查找学生信息.
//	 * @param stuSet1
//	 * @param stuSet2
//	 * @return
//	 */
//	Set<StudentInfoBean> getBinaryStudentInfoByName(Set<StudentInfoBean> stuSet);
}