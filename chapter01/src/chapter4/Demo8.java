package chapter4;
import java.util.Scanner;

public class Demo8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入一个n:");
		int n=sc.nextInt();
		int num=digui(n);
		System.out.println(n+"!="+num);	
	}
	static int digui(int n) {
		if(n==1) return 1;
		else
			return n*digui(n-1);
	}

}
