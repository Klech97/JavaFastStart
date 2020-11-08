package Lsix;

public class Lesson {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.catJump(14.3);
        cat.catSwim(14);
        cat.catRun(14.5);

        dog.dogJump(14.3);
        dog.dogSwim(14);
        dog.dogRun(300);
    }

}
