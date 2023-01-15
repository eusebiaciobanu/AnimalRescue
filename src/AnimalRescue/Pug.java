package AnimalRescue;

public class Pug extends Dog {
    public void snore() {
        System.out.println("snores");
    }

    @Override
    public void speak() {
        System.out.println("oink oink");
    }

    public void eat() {
        System.out.println("eats dry and wet food");
    }
    @Override
    public void run() {
        System.out.println("pug runs");
    }
    @Override
    public void sleep() {  System.out.println("pug sleeps");
    }
}