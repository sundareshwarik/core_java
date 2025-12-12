package core_task;
class Animal_1{
	void eat() {
		System.out.println("animal is eating");
	}
}
class Dog_1 extends Animal_1{
	void bark() {
		System.out.println("Dog is barking...");
	}
}
class Cat_1 extends Animal_1{
	void meow() {
		System.out.println("cat is meowing...");
	}
}
public class Hierarchial_inh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Dog_1 dog = new Dog_1();
    dog.eat();
    dog.bark();
    Cat_1 cat = new Cat_1();
    cat.eat();
    cat.meow();
	}

}
