 package chapter01;
import java.util.Scanner;
public class Juxing {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入矩形的长: ");
		int length=sc.nextInt();
		System.out.println("请输入矩形的宽: ");
		int width=sc.nextInt();
		int perimeter=0,area=0;
		perimeter=2*(length+width);
		area=length*width;
		System.out.println("矩形的周长为："+perimeter);
		System.out.println("矩形的面积为: "+area);
		
	}

}
