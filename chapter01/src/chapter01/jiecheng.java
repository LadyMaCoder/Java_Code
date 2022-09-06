package chapter01;
import java.util.Scanner;
public class jiecheng {
	public static void main(String args[]) {
		int sum=0,j=1;
		int N=10;
		System.out.println("请输入阶乘值: ");
		Scanner sn=new Scanner(System.in);
		N=sn.nextInt();
		for(int i=1;i<=N;i++) {
			j=i*j;
			sum=sum+j;
		}
		System.out.println("阶乘和为: "+sum);
	}
}
