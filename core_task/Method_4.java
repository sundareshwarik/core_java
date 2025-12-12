package core_task;

public class Method_4 {
    public String meth (String fname , String lname) {
    	return fname+lname ;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Method_4 obj = new Method_4();
    String result = obj.meth("shruthi" , "selvi");
    System.out.println(result);
	
    Method_4 obj1 = new Method_4();
    System.out.println (obj1.meth("sherlin" , "thaslima"));
    }
}








