package core_task;
interface Greeting{
	void sayhello();
	default void display() {
		System.out.println("hello");
	}
}
public class Lambda_intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Greeting greet = () ->{
    	System.out.println("hello this is lambda");
    };
    greet.sayhello();
    greet.sayhello();
    greet.sayhello();
	}

}
