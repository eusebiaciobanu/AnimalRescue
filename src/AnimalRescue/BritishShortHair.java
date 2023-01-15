package AnimalRescue;

public class BritishShortHair extends Cat{

    public void eat(){
        System.out.println("Eats only dry food");
    }
    @Override
    public void sleep() {System.out.println("BritishShortHair sleeps");
    }
    @Override
    public void run() {System.out.println("BritishShortHair runs");
    }

    @Override
    public void speak() {System.out.println("BritishShortHair speaks");

    }

    @Override
    public void purr() {
        System.out.println("Purrrrr");
    }


}