package chapter01;

public class PeopleDemo {
	public static void main(String[] args) {
		People yPeople=new People(165,"李莉","女");
		yPeople.rwjj();
	}
}
class People{
	double sg;
	String xm,xb;
	People(double sg,String xm,String xb){
		this.sg=sg;
		this.xm=xm;
		this.xb=xb;
	}
	void rwjj() {
		System.out.println(this.xm+","+this.xb+",身高"+this.sg+"cm。");
	}

}

