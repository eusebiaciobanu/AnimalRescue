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

   public void eat(){
        System.out.println("The cat eats");
    }
   public void sleep(){
        System.out.println("The cat sleeps");
    }
   public void speak(){
        System.out.println("The cat speaks");
    }
   public void run(){
        System.out.println("The cat runs");
    }
    public abstract void purr();

    public void setAge(int age) {
        this.age = age;
    }
}