package chapter01;

public class Test4 {
	public static void main(String args[]) {
		for(int d=100;d<=999;d++) {
			int a=d/100;
			int b=d/10%10;
			int c=d%10;
			if(a*a*a+b*b*b+c*c*c==d) {
				System.out.println("水仙花数: "+d);
			}
		}
				
	}

}
