package Chapter007;

abstract class Animal2 {//定义抽象类Animal
	public abstract void cry();
	public abstract String getAnimalName();
}

class Dog2 extends Animal2 {//定义子类Dog,继承Animal2
	public void cry(){
		System.out.println("汪...汪汪····");
	}
	public String getAnimalName(){
		return "狗狗";
	}
}
class Cat2 extends Animal2{//定义子类Cat,继承Animal2
	public void cry(){
		System.out.println("喵...喵喵···我们一起喵喵··");
	}
	public String getAnimalName(){
		return "喵星人";
	}
}

class Simulator {
	public void playSound(Animal2 animal2){
		System.out.print("播放"+animal2.getAnimalName()+"类声音:");
		animal2.cry();
	}
}

public class Test1 {
	public static void main(String[] args) {
		Simulator simulator=new Simulator();
		simulator.playSound(new Dog2());
		simulator.playSound(new Cat2());	
	}
}

