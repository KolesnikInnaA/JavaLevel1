package Lesson6.HomeWork6;

public class Animal {  //class
    String name;
    int runMax;
    int swimMax;

    public void run(int length) {  // method
        if (length < 0) {
            System.out.println("Impossible");
        } else {
            if (length < runMax) {
                System.out.println(name + "run " + length + " metres");
            } else {
                System.out.println(name + "Impossible");
            }
        }
    }

    public void swim(int length) {
        if (length < 0) {
            System.out.println("Impossible");
        } else {
            if (length < swimMax) {
                System.out.println(name + "swim " + length + " metres");
            } else {
                System.out.println("Impossible");
            }
        }
    }
}


