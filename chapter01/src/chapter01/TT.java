package chapter01;

public class TT {
	public static void main(String[] args) {
		int a=10;//局部变量声明,必须先赋值再使用
		System.out.println(a);
		
		if(1==1) {
			int b=20;//局部变量超出作用范围之后，会立刻回收
			System.out.println(b);
		}
		//System.out.println(b);错误示范
		
		
	}

}
