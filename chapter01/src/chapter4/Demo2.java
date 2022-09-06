package chapter4;

public class Demo2 {
	public static void main(String[] args) {
		int [] a = {60,70,80,90,91,100,66};
		double avg = 0;
		int sum=0;
		for(int i = 0;i<a.length;i++) {
			sum+=a[i];
			avg=sum/7.0;
		}
		System.out.println("该同学的平均成绩为: "+avg);
		}

}
