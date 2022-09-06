package com.cucn.project1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入一个算式:");
		String s=scanner.next();
		String[] str=s.split(",");
		double num1=Double.parseDouble(str[0]);
		double num2=Double.parseDouble(str[1]);
		String symbol=str[2];
		CreateOperate(num1,num2,symbol);

	}
	public static void CreateOperate(double num1,double num2,String symbol) {
		ICount count;
		switch(symbol) {
		case "+":
			count=new Add();
			System.out.println(count.getResult(num1,num2));
			break;
		case "-":
			count=new Minus();
			System.out.println(count.getResult(num1,num2));
			break;
		case "*":
			count=new Multiply();
			System.out.println(count.getResult(num1,num2));
			break;
		case "/":
			count=new Divide();
			System.out.println(count.getResult(num1,num2));
			break;
		default:
			System.out.println("输入的符号不正确！！！");
		}
	}

}
