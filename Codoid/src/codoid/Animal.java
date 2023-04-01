package codoid;

class Animal {
	  public void makeSound() {
	    System.out.println("The animal makes a sound");
	  }
	  
	  public static void main(String[] args) {
		  Animal animal = new Animal();
		    animal.makeSound(); // The animal makes a sound

		    Cat cat = new Cat();
		    cat.makeSound(); // Meow

		    Dog dog = new Dog();
		    dog.makeSound(); // Bhow !!
	}
	}
