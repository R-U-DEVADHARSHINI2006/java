package r;

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
    void sound() {
    	System.out.println("Meows");
    }
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------
  package r;

public class AnimalMain {
public static void main(String[] args) {
	//Kitten k=new Kitten();
	Animal c=new Cat();
	//Dog d=new Dog();
	
	//k.Sound();
	//d.bark();
	//d.eat();
	c.eat();
	c.sound();
}

}
