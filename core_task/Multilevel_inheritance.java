package core_task;

class Animal_a {
    void eat() {
        System.out.println("animal is eating...");
    }
}

class Goat extends Animal_a {
    void meghh() {
        System.out.println("Goat is meghhh");
    }
}

class Kid extends Goat {
    void weep() {
        System.out.println("kid is weeping....");
    }
}

public class Multilevel_inheritance {

    public static void main(String[] args) {
        Kid kid = new Kid();
        kid.eat();   
        kid.meghh(); 
        kid.weep();  
    }
}
