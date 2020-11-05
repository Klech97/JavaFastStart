package Lsix;

public class Cat extends Animal {

    public void catRun(double power) {
        if (power > 200 || power < 0) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }

    public void catSwim(double power) {

        System.out.println(false);
    }

    public void catJump(double power) {
        if (power > 2 || power < 0) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }

}
