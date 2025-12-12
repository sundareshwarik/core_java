package core_task;
class Poly{
  void Display() {
	  System.out.println("simple function");
  }
  void Display(int a) {
	  System.out.println(a);
  }
  void Display(int a,int b) {
	  if(a<b) {
		  System.out.println(a);
	  }
	  else {
		  System.out.println(b);
	  }
  }
}
public class Method_overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("METHOD OVERLOADING");
     Poly obj = new Poly();
     obj.Display();
     obj.Display(5);
     obj.Display(22,8);
	}

}
