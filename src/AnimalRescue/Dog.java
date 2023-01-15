package AnimalRescue;

public class Dog extends Animal {

    private double weight;

    public void setWeight(double weight){
        this.weight = weight;
    }
    @Override
    public double getWeight(){
        return weight;
    }
    @Override
    public void eat(){
        System.out.println("Eating yum yum..");
    }
    @Override
    public void sleep(){
        System.out.println("Snorringggg ZZzzZzZzz");
    }
    @Override
    public void speak(){
        System.out.println("Woof woof miau!");
    }
    @Override
    public void run(){
        System.out.println("running...");
    }
    public void tailWagging(){
        System.out.println("Wagging the tail");
    }

}
