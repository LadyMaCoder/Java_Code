package Chapter007;

public class Test {
	public static void main(String[] args) {
		ChinaPeople chinapeople=new ChinaPeople();
		AmericanPeople americanpeople=new AmericanPeople();
		BeijingPeople beijingpeople=new BeijingPeople();
		chinapeople.speckHello();
		americanpeople.speckHello();
		beijingpeople.speckHello();
		chinapeople.averageHeight();
		americanpeople.averageHeight();
		beijingpeople.averageHeight();
		chinapeople.averggeWeight();
		americanpeople.averggeWeight();
		beijingpeople.averggeWeight();
		chinapeople.chinaGongfu();
		americanpeople.americanBoxing();
		beijingpeople.beijingOpera();
		beijingpeople.chinaGongfu();
	}
 
}
