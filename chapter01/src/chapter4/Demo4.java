package chapter4;

import java.text.DecimalFormat;

public class Demo4 {
	public static void main(String[] args) {
		int array[][]= {{79,88,68},{66,54,76},{98,88,92},{77,87,67},{43,54,56}};
		double ave,zong=0;
		int sum=0;
		for(int j=0;j<3;j++){
			for(int i=0;i<5;i++) {
				sum=sum+array[i][j];
			}
			ave=sum/5.00;
			zong=zong+ave;
			sum=0;
			System.out.println("全组分科平均成绩："+ave);
		}
		DecimalFormat df = new DecimalFormat("#0.00");    
		System.out.println("各科总平均成绩："+df.format(zong));
	}

}
