package chapter2;

public class Demo3 {
	public static void main(String[] args) {
		int j=0,k=0;
		int arr[]=new int[] {1,9,3,8,10,13};
		for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			j++;
		}
		if(arr[i]%2==1) {
			k++;
			}
		}
		System.out.println("该数组的偶数个数为"+j+" 奇数的个数为"+k);
	}

}
