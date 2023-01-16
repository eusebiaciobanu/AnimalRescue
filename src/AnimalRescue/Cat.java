package AnimalRescue;

public abstract class Cat extends Animal{



    public void tailWagging() {
        System.out.println("Wagging the tail");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void eat() {
        System.out.println("eats dry and wet food");
    }
    @Override
    public void run() {
        System.out.println("the cat runs");
    }
    @Override
    public void sleep(){
        System.out.println("the cat sleeps");
    }
    @Override
    public void speak(){
        System.out.println("meow");
    }
    public abstract void purr();

    public void setAge(int age) {
        this.age = age;
    }
}