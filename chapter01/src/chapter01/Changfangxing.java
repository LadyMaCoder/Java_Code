package chapter01;
import java.util.Scanner;
	class Tuxing{
		int length,width,perimeter,area;
		int getperimeter(int length,int width) {
			return (length+width)*2;
		}
		int getarea(int length,int width) {
			return length*width;
		}
	}

public class Changfangxing {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int perimeter=0,area=0;
		Tuxing tx = new Tuxing();
		System.out.print("请输入矩形的长: ");
		int length=sc.nextInt();
		System.out.print("请输入矩形的宽: ");
		int width=sc.nextInt();
		System.out.println("矩形的周长为："+tx.getperimeter(length,width));
		System.out.println("矩形的面积为: "+tx.getarea(length,width));
	}  
}
