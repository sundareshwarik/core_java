package core_task;
interface contract1{
	void sim1(int a, int b);
	public static void rule0 () {
		System.out.println("rule0");
	}
	public default  void rule1() {
		System.out.println("rule1");
	}
}
public class Lambda_2 {

	public static void main(String[] args) {
    contract1 Cc1 = (a,b)-> {
    System.out.println("functional interface" + (a+b));
    };
    Cc1.sim1(10,20);
    contract1.rule0();
    Cc1.rule1();
}

}
