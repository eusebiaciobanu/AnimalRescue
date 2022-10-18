package AnimalRescue;

public class AppMain {

    public static void main(String[] args) {
        Dog rudolph = new Dog();

        System.out.println("The dog's name is: " + rudolph.name);

        System.out.println("The dog's age is: " + rudolph.age + " years");

        rudolph.age = 6;

        System.out.println("The dog's age is: " + rudolph.age + " years");


        System.out.println("The dog's weight is: " + rudolph.weight + " kgs");

        rudolph.run();

        rudolph.eat();

        rudolph.speak();

        rudolph.sleep();


    }
}
