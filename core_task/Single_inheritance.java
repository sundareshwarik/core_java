package core_task;
class mammals{
	void eat() {
		System.out.println("animal is eating");
	}
}
class cat extends mammals {
	void bark() {
		System.out.println("cat is meowing");
	}
}
public class Single_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       cat cat = new cat();
       cat.eat();
       cat.bark();
	}

}
