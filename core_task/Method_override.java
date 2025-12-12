
package core_task;

class Pet {
    String name = "pet";   // better to keep distinct value
    public void sound() {
        System.out.println("pet makes sound");
    }
}

class Cow extends Pet {
    @Override
    public void sound() {
        super.sound();
        System.out.println("cow mooo");
    }

    void printInfo() {
        System.out.println("parent name:" + super.name);
        System.out.println("child name:" + name); // refers to inherited field
        sound();
    }
}

public class Method_override {
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.sound();
        cow.printInfo();
    }
}