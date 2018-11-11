import model.*;


public class AnimalNoise {
	//add your animal class to the model package
	//only push this file and the animal class you created

	public static void main(String[] args) {
		Cat fluffy = new Cat();
		System.out.println(fluffy.speak());
		RedPanda thief = new RedPanda();
		System.out.println(thief.speak());
		Eagle bucky = new Eagle("Bald Eagle", 6.6, 12);
		System.out.println(bucky.speak());
		Mouse sneaky = new Mouse();
		System.out.println(sneaky.speak());
		Wolverine victor = new Wolverine("Victor", "Blue&Maze", "Michigan");
		System.out.println(victor.speak());
		Rat stan = new Rat("Stan", 7.2, 3);
		System.out.println(stan.speak());
		Snake slitherySnake = new Snake();
		System.out.println(slitherySnake.speak());
		Wolf wolfy = new Wolf();
		System.out.println(wolfy.speak());
		Dog roger = new Dog("Roger", "Great Dane", 6);
		System.out.println(roger.speak());
		
		// Jonah Zirkle
		Cow bovine = new Cow(1500, "brown", "dairy");
		System.out.println(bovine.speak());
	}

}
