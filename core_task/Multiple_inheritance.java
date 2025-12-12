package core_task;
interface A{
	void showA();
}
interface B{
	void showB();
}
class C implements A,B {
	public void showA() {
		System.out.println("this is from A");
	}
	public void showB() {
		System.out.println("this is from B");
	}
	void showC() {
		System.out.println("this is from C");
	}
}
public class Multiple_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    C obj = new C ();
    obj.showA();
    obj.showB();
    obj.showC();
	}
}
