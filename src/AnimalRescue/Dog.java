package AnimalRescue;

public class Dog extends Animal {



    private double weight;

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public void tailWagging() {
        System.out.println("Wagging the tail");
    }
   public  void eat(){
        System.out.println("The dog eats");
    }
   public  void sleep(){
        System.out.println("The dog sleeps");
    }
   public void speak(){
        System.out.println("The dog speaks");
    }
   public  void run(){
        System.out.println("The dog runs");
    }

}
