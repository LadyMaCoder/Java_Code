package Chapter007;

public class AmericanPeople extends People{
	public void speckHello(){
		System.out.println("How do you do");
	}
	public void averageHeight(){
		height=176;
		System.out.println("American's average height:"+height+"cm");
	}
	public void averggeWeight(){
		weight=75;
		System.out.println("American's average weight:"+weight+"kg");
	}
	public void americanBoxing(){
		System.out.println("直拳，勾拳，组合拳！");
	}
}

