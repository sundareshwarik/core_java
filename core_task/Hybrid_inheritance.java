package core_task;
interface A1{
	void showA();
}
interface B1 {
	void showB();
}
class C1 implements A1,B1{
	public void showA() {
		System.out.println("this is A");
	}
	public void showB() {
		System.out.println("this is B");
	}
	void showC() {
		System.out.println("this is C");
	}
}
 class D extends C1{
	 void showD() {
		 System.out.println("this is D");
		 }
	 }
public class Hybrid_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      D obj = new D();
      obj.showA();
      obj.showB();
      obj.showC();
      obj.showD();
	}

}
