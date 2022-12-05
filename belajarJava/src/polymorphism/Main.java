package polymorphism;

import java.util.ArrayList;
import java.util.List;

import polymorphism.animal.Animal;
import polymorphism.animal.bird.Eagle;

public class Main {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();

		Animal animal = new Animal();
		Animal bird = new Eagle();

		animals.add(animal);
		animals.add(bird);
		listAnimals(animals);
	}

	public static void listAnimals(List<Animal> animals) {
		for (Animal animal : animals) {
			System.out.println(animal.showInfo());
		}
	}

}
