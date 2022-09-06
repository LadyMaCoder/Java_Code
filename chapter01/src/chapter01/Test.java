package chapter01;
class Rect_2{
	double chang;
	double kuan;
	double zhouchang;
	double mianji;
	public void zhouchang() {
		System.out.println("矩形周长：" + (chang+kuan)*2);
	}
	public void mianji() {
		System.out.println("矩形面积：" + chang*kuan);
	}
}

public class Test {
	public static void main(String[] args) {
		Rect_2 f1 = new Rect_2();
		f1.chang = 2;
		f1.kuan = 2;
		f1.zhouchang();
		f1.mianji();
	}
}