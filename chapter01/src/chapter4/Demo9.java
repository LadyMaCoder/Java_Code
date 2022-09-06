package chapter4;
import java.util.Scanner;

public class Demo9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入一个n:");
		int n=sc.nextInt();
		System.out.println(n+"个Ficonacci数列:");	
		for(int i=0;i<n;i++) {
			System.out.print(Ficonacci(i));	
			System.out.print(" ");	
		}
	}
	static long Ficonacci(int n) {
		if((n==0)||(n==1))
			return 1;
		else
			return Ficonacci(n-1)+Ficonacci(n-2);
	}
}

