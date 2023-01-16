package AnimalRescue;

public abstract class Animal {
    protected String name;
    protected int age;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    private String breed;

    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    private String color;
    private double weight;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private String gender;

    public void setName(String name) {
        this.name = name;
    }
    private void setName(){ this.name = name;}

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void eat() {
        System.out.println("the animal eats");
   }

    public void sleep() {
       System.out.println ("the animal sleeps");
    }

    public void speak() {
        System.out.println("the animal speaks");
    }
    public void run() {
        System.out.println("the animal runs");
    }
}