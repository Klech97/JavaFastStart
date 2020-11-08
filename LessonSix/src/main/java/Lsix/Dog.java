package Lsix;

import org.w3c.dom.ls.LSOutput;

public class Dog extends Animal {

    public void dogRun(double power) {
        if (power > 500 || power < 0) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }

    public void dogSwim(double power) {
        if (power > 10 || power < 0) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }

    public void dogJump(double power) {
        if (power > 0.5 || power < 0) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}
