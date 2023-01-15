package AnimalRescue;

public class Duck extends Animal {
    public void tailWagging() {
        System.out.println("Wagging the tail");
    }

    @Override
    public void eat() {System.out.println("the duck runs");

    }

    @Override
    public void sleep() {System.out.println("the duck sleeps");

    }

    @Override
    public void speak() {
        System.out.println("macmac");
    }

    @Override
    public void run() {System.out.println("the duck runs");

    }
}