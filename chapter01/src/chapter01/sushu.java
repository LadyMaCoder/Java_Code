package chapter01;

public class sushu {
	public static void main(String args[]) {
		int sum=0;
		int j;
		for(int i=2;i<=100;i++) {
			for(j=2;j<i;j++) {
				if(i%j==0) {
					break;
				}
			}
			if(j==i) {
				sum+=i;
			}
		}
		System.out.println("1-100的素数和为: "+sum);
		
	}

}
