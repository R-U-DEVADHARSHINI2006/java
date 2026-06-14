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
-------------------------------------------------------------------------------------------------------------------------------------------------------------
}
package r;

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------
	package r;

public class Cat extends Animal{
	void eat() {
		super.eat();
		System.out.println("Cat:eat");	
	}
void sound() {
	System.out.println("Meows");
}
}
