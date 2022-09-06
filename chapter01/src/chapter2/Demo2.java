package chapter2;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		int max;
		System.out.println("请输入三个数:");
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		if((a>b)&&(a>c)) {
			max=a;
		}
		if((b>a)&&(b>c)) {
			max=b;
		}else {
			max=c;
		}
		System.out.println("最大值max="+max);
	}

}
