package Chapter7;

public class Simulator {
	public void playSound(Animal animal) {
		System.out.print(animal.getAnimalName()+"的叫声是: ");
		animal.cry();
	}

}
