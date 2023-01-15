package AnimalRescue;

public class AppMain {

    public static void main(String[] args) {
        Dog rudolph = new Dog();

        rudolph.setName("Rudolph");

        rudolph.setAge(6);

        rudolph.setWeight(30.5);

        System.out.println("The dog's name is: " + rudolph.getName());

        System.out.println("The dog's age is: " + rudolph.getAge() + " years");

        rudolph.setAge(10);

        System.out.println("The dog's age is: " + rudolph.getAge() + " years");


        System.out.println("The dog's weight is: " + rudolph.getWeight() + " kgs");

        rudolph.run();

        rudolph.eat();

        rudolph.speak();

        rudolph.sleep();


        BritishShortHair cleopatra = new BritishShortHair();
        cleopatra.run();
        cleopatra.eat();
        cleopatra.speak();
        cleopatra.sleep();

        Pug azorel = new Pug();
        azorel.run();
        azorel.eat();
        azorel.speak();
        azorel.sleep();

        Mouse jerry = new Mouse();
        jerry.run();
        jerry.eat();
        jerry.speak();
        jerry.sleep();

        Duck lila = new Duck();
        lila.run();
        lila.eat();
        lila.speak();
        lila.sleep();





        AnimalFood animalFood = new AnimalFood();
        animalFood.setName("Banana");
        animalFood.setPrice(2.5f);
        animalFood.setQuantity(5);
        animalFood.setAvailableInStock(true);

        System.out.println("--- AnimalFood ---");
        System.out.println("Name: " + animalFood.getName());
        System.out.println("Price: " + animalFood.getPrice());
        System.out.println("Quantity: " + animalFood.getQuantity());
        System.out.println("Available in stock: " + animalFood.getAvailableInStock());

        RecreationActivity recreationActivity = new RecreationActivity();
        recreationActivity.setName("Swimming");

        System.out.println("--- RecreationActivity ---");
        System.out.println("Name: " + recreationActivity.getName());

        Adapter adapter = new Adapter();
        adapter.setName("test adapter");
        adapter.setAvailableAmountOfMoney(100);

        System.out.println("--- Adapter ---");
        System.out.println("Name: " + adapter.getName());
        System.out.println("AvailableAmountOfMoney: " + adapter.getAvailableAmountOfMoney());

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.setName("George");
        veterinarian.setSpecialization("Monkeys");

        System.out.println("--- Veterinarian ---");
        System.out.println("Name: " + veterinarian.getName());
        System.out.println("Specialization: " + veterinarian.getSpecialization());
    }

}