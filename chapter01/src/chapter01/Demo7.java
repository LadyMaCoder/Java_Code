package chapter01;

import java.util.Scanner;

public class Demo7 {
	public static void main(String[] args) {
		System.out.println("请先输入一个月份: ");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		switch(n) {
		case 1:{
			System.out.println("n是1月");
			break;
		}
		case 2:{
			System.out.println("n是2月");
			break;
		}
		case 3:{
			System.out.println("n是3月");
			break;
		}
		case 4:{
			System.out.println("n是4月");
			break;
		}
		case 5:{
			System.out.println("n是5月");
			break;
		}
		case 6:{
			System.out.println("n是6月");
			break;
		}
		case 7:{
			System.out.println("n是7月");
			break;
		}
		case 8:{
			System.out.println("n是8月");
			break;
		}
		case 9:{
			System.out.println("n是9月");
			break;
		}
		case 10:{
			System.out.println("n是10月");
			break;
		}
		case 11:{
			System.out.println("n是11月");
			break;
		}
		default:{
			System.out.println("n是12月");
		}
		}
	}

}
