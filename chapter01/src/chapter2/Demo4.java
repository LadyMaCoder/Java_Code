package chapter2;

public class Demo4 {
	public static void main(String[] args) {
		//统计0的个数
		int count=0;
		//定义一个静态数组
		int arr[]=new int[] {1,2,3,0,6,0,0,0,5,10,4,0};
		//遍历数组
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				count++;
			}
		}
		//定义一个新数组的下标
		int j=0;
		//定义一个新数组
		int arr2[]=new int[arr.length-count];
		for(int i=0;i<arr.length;i++) {
			//把不为0的数赋值给新数组
			if(arr[i]!=0) {
				arr2[j]=arr[i];
				j++;
			}
		}
		//foreach方法遍历数组
		for(int i:arr2)
		System.out.print(i+" ");
	}

}
