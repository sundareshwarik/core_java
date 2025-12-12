package core_task;

public class Method_3 {
  void meth3 (String fname,String lname) {
	  System.out.println(fname + lname);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Method_3 obj = new Method_3();
      obj.meth3("shruthi", "selvi");
      Method_3 n = new Method_3();
      n.meth3("thasli", "sherlin");
      Method_3 g = new Method_3();
      g.meth3(null, null);
	}

}
