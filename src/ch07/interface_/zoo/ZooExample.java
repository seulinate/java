package ch07.interface_.zoo;

public class ZooExample {

	public static void main(String[] args) {
		
		Tiger tiger = new Tiger();
		tiger.eat();
		tiger.sleep();
		tiger.makeSound();
		
		Cat cat = new Cat();
		cat.eat();
		cat.sleep();
		cat.makeSound();
		
		Dog dog = new Dog();
		dog.eat();
		dog.sleep();
		
		Fish fish = new Fish();
		fish.eat();
		fish.sleep();

		GoldFish goldfish = new GoldFish();
		goldfish.eat();
		goldfish.sleep();
		
		Shark shark = new Shark();
		shark.eat();
		shark.sleep();
		
		PetCat petcat = new PetCat();
		petcat.eat();
		petcat.sleep();
		petcat.makeSound();
		petcat.play();
		
		PetDog petdog = new PetDog();
		petdog.eat();
		petdog.sleep();
//		petdog.makeSound();
		petdog.play();	
	}

}


interface Animal{
	void eat();
	void sleep();
}

abstract class Feline implements Animal{
	abstract void makeSound();
}

class Tiger extends Feline{
	
	@Override
	public void eat() {
		System.out.println("tiger is eating");
	}
	@Override
	public void sleep() {
		System.out.println("tiger is sleeping");
	}
	@Override
	void makeSound() {
		System.out.println("tiger is toaring");
	}
}

class Cat extends Feline{
	
	@Override
	public void eat() {
		System.out.println("tiger is eating");
	}
	@Override
	public void sleep() {
		System.out.println("tiger is sleeping");
	}
	@Override
	void makeSound() {
		System.out.println("tiger is toaring");
	}
}

class Dog implements Animal{
	
	@Override
	public void eat() {
		System.out.println("tiger is eating");
	}
	@Override
	public void sleep() {
		System.out.println("tiger is sleeping");
	}
}


class Fish implements Animal{
	
	@Override
	public void eat() {
		System.out.println("tiger is eating");
	}
	@Override
	public void sleep() {
		System.out.println("tiger is sleeping");
	}
	
}

class GoldFish extends Fish{
	
}

class Shark extends Fish{
	
}

interface Pet{
	void play();
}

class PetCat extends Cat implements Pet{
	
	@Override
	public void play() {
		System.out.println("PetCat is playing with its owner...");
	}
}


class PetDog extends Dog implements Pet{
	@Override
	public void play() {
		System.out.println("PetDog is playing with its owner...");
	}
}
