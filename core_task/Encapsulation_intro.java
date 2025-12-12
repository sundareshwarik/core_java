package core_task;
class Student{
	private int age = 10;
	int age2 =28;
	public int getAge() {
		return age;
	}
	public void setAge(int newAge) {
		age = newAge;
	}
}
public class Encapsulation_intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student s = new Student();
     Student B = new Student();
     System.out.println(s.age2);
     s.setAge(20);
     B.setAge(200);
     System.out.println(s.getAge());
     Student s1 = new Student();
     System.out.println(B.getAge());
     System.out.println(s1.getAge());
	}

}
