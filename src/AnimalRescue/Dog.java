package AnimalRescue;

public class Dog {

    private String name;
    private int age;
    String breed;
    String color;
    private double weight;
    String gender;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }

    public void eat(){
        System.out.println("Eating yum yum..");
    }
    public void sleep(){
        System.out.println("Snorringggg ZZzzZzZzz");
    }
    public void speak(){
        System.out.println("Woof woof miau!");
    }
    public void run(){
        System.out.println("running...");
    }
    public void tailWagging(){
        System.out.println("Wagging the tail");
    }

}
