package chapter01;

class Student {
	String name;
	int age;
	static String school="A大学";
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void info() {
		System.out.println("姓名: "+this.name+",年龄: "+this.age+",学校: "+school);
	}
}
public class Test5 {
	public static void main(String args[]) {
	Student stu1 = new Student("张三",18);
	Student stu2 = new Student("李四",19);
	Student stu3 = new Student("王五",20);
	stu1.school="B大学";
	stu1.info();
	stu2.info();
	stu3.info();
}
}
