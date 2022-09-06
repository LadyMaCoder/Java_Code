package chapter4;

public class Demo7 {
	public static void main(String[] args) {
		int age=nianling(5);
		System.out.println("第五个"+age+"岁");	
	}
	static int nianling(int a) {
		if((a==1))
			return 10;
		else
			return nianling(a-1)+2;
	}

}
