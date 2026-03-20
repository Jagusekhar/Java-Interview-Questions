package Java;

public class MethodoveridingAnimal {


	    void Sound() {
	        System.out.println("Animal makes sound");
	    }

	    public static void main(String[] args) {

	        MethodoveridingAnimal m = new Dog();
	        m.Sound();
	    }
	}

	class Dog extends MethodoveridingAnimal {

	    @Override
	    void Sound() {
	        System.out.println("Dog barks");
	    }
	}