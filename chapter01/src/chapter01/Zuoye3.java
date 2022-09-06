package chapter01;

public class Zuoye3 {
	public static void main(String[] args) {
		Employee e=new Employee("张三",50000,"1");
		e.read();
		Employee e2 = new Employee();
		e2.setId("2");
		e2.setName("李四");
		e2.setSalary(25000.0);
		e2.read(); 
	}

}
class Employee{
	private String name,id;
	private double salary;
	Employee(String name,double salary,String id){
		this.name=name;
		this.salary=salary;
		this.id=id;
	}
	public Employee() {
		super();
	}
	void read() {
		System.out.println("员工编号:"+this.id+",姓名:"+this.name+",年薪"+this.salary);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}	
}

