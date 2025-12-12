package core_task;

abstract class Ele {
    int a = 10;

    abstract void meth();
    abstract void meth2();

    void me() {
        System.out.println("normal");
    }
}

abstract class Animal {
    abstract void sound();

    void eat() {
        System.out.println("this animal eats food");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("dog barks");
    }
}

public class Abs {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        a.eat();
    }
}
