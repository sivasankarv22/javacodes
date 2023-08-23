class Dog {
	String color;
	int cost;
	String breed;
	String name;

	void eats() {
		System.out.println("Dog eats");
	}

	void barks() {
		System.out.println("Dog barks");
	}

	void bites() {
		System.out.println("Dog bites");
	}

	void sleep() {
		System.out.println("Dog sleeps");
	}
}

class DogLaunch {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eats();
		d.barks();
		d.bites();
		d.sleep();
	}
}
