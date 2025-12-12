
package core_task;

public class Method_2 {

    String name2() {
        String fname = "divya";
        String lname = "subi";
        return fname + lname;
    }

    public static void main(String[] args) {

        Method_2 j = new Method_2();

        String f = j.name2();

        System.out.println("with return type no parameter");
        System.out.println(f);
        System.out.println(j.name2());
    }
}
