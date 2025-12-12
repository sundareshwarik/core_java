package core_task;
interface Vehicle{
	void start();
	abstract void new1();
	default void normal() {
		System.out.println("default");
	}
	static void n3() {
		System.out.println("static method");
	}
}
class Car implements Vehicle{
	public void start() {
		System.out.println("car is starting");
	}
	public void new1() {
		System.out.println("new1");
}
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Vehicle v=new Car();
      v.start();
      Car c=new Car();
      c.start();
      v.normal();
	}

}
