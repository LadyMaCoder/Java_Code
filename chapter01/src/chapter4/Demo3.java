package chapter4;
import java.util.Arrays;
import java.util.Scanner;
public class Demo3 {
	public static void main(String[] args) {
		int i;
		int array[]= {1,7,10,18,45};
		int[] array1=new int[array.length+1];
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入插入的数值:");
		int n=sc.nextInt();
		int weizhi=array1.length-1;
		for(i=0;i<array.length;i++) {
			array1[i]=array[i];
		}
		for(i=0;i<array1.length-1;i++) {
			if(array1[i]>n) {
				weizhi=i;break;
			}
		}
		for(i=array1.length-1;i>weizhi;i--) {
			array1[i]=array1[i-1];
		}
		array1[weizhi]=n;
		System.out.println(Arrays.toString(array1));
	}

}
