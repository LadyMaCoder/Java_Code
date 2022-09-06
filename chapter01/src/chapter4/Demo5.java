package chapter4;

public class Demo5 {
	public static void main(String[] args) {
	int array[][]={{25,53,65,46,74},{40,56,76,94,64},{44,23,43,78,35},{76,21,35,59,71},{74,52,12,43,45}};
	int max = 0;
	max=array[0][0];
	int posx=0;
	int posy=0;
	for(int i=0;i<5;i++) {
		for(int j=0;j<5;j++) {
			if(max<array[i][j]){
				max=array[i][j];
				posx=i;
				posy=j;
			}
		}	
	}
	System.out.println("最大值"+max+";行列是("+posx+","+posy+")");

}

}
