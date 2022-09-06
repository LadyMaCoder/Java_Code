package Chapter11;

public class TestGetSum {
	public static void main(String[] args) {
		//求1-100之间所有数字的总和
		
		//1.循环100次的问题
		
		//2.循环的过程中进行求和
		
		int i=1;//初始部分
		int sum=0;
		while (i<=100) {//循环条件
			
			//循环操作
			sum=sum+i;
		
			i++; //迭代部分
		}
		System.out.println("程序结束...");
	}

}
