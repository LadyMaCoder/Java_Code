package chapter5;
import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Book book = new Book();
		book.list();
		book.orderItem();
		book.order();
	}
}

class Book{
	Scanner in = new Scanner(System.in);
	String bookId[]=new String[50];
	String bookName[]=new String[60];
	double price[]=new double[50];
	int storage[]=new int[50];
	String number[]=new String[50];
	int stor[]= new int[50];
	float total = 0;
	int k= 3;
	void list() {
		System.out.println("-------------------------------------------");
		bookId[0]="1";bookName[0]="Java教程";price[0]=30.6;storage[0]=30;
		bookId[1]="2";bookName[1]="JSP教程";price[1]=42.1;storage[1]=40;	
		bookId[2]="3";bookName[2]="SSH架构";price[2]=47.3;storage[2]=15;
		for(int i=0;i<k;i++) {
			System.out.println(bookId[i]+"\t"+bookName[i]+"\t\t"+price[i]+"\t"+storage[i]);	
		}	
		System.out.println("-------------------------------------------");
	}
	
	void orderItem() {
		for(int i=0;i<3;i++) {
			System.out.println("请输入图书编号选择图书：");
			number[i]=in.next();
			System.out.println("请输入购买图书数量：");
			stor[i]=in.nextInt();
			if(i==0||i==1) {
				System.out.println("请继续购买图书。");
			}
		}
	}
	void order() {
		System.out.println("\t图书订单");
		System.out.println("图书订单号:00001");
		System.out.println("图书名称        购买数量        图书单价");
		System.out.println("-------------------------------------------");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(number[i].equals(this.bookId[j])) {
					System.out.println(bookName[j]+"\t\t"+stor[i]+"\t"+price[j]);
					total+=stor[i]*price[j];
				}
			}
		}
		System.out.println("-------------------------------------------");
		System.out.println("订单总额:\t\t"+total);
	}
}