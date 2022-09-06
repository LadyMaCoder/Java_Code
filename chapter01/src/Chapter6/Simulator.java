package Chapter6;

public class Simulator {
	public void playSound(Animal animal) {
		System.out.print("正在播放模拟" + animal.getAnimalName() +"的声音: ");
		animal.cry();
	}
}