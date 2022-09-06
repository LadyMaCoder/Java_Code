package chapter4;
import java.util.Scanner;

public class Demo6 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("请输入一个n:");
	int n=sc.nextInt();
	int sum=sum(n);
	System.out.println("1~"+n+"之间的整数和是"+sum);	
}
static int sum(int n) {
	int sum=0;
	for(int i=1;i<=n;i++) {
		sum=sum+i;
		}
	return sum;
}

}
