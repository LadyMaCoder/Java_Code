package chapter01;


public class Test1 {
	public static void main(String args[]) {
		for(int n=50;n<=100;n++) {
			for(int m=2;m<=n;m++) {
				if(n%m==0 && n!=m) {
					break;
				}
				if(m==n) {
					System.out.println("50-100之间的素数为: "+n);
				}
			}
		}
		
		}
	}
