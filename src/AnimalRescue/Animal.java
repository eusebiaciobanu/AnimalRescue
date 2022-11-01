package AnimalRescue;

public class Animal {
    private String name;

    private int age;

    private int healthLevel;

    private int hungryFeeling;

    private int stateOfMind;

    private AnimalFood favoriteFood;

    private RecreationActivity favoriteRecreationActivity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHungryFeeling() {
        return hungryFeeling;
    }

    public void setHungryFeeling(int hungryFeeling) {
        this.hungryFeeling = hungryFeeling;
    }

    public int getStateOfMind() {
        return stateOfMind;
    }

    public void setStateOfMind(int stateOfMind) {
        this.stateOfMind = stateOfMind;
    }

    public AnimalFood getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(AnimalFood favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public RecreationActivity getFavoriteRecreationActivity() {
        return favoriteRecreationActivity;
    }

    public void setFavoriteRecreationActivity(RecreationActivity favoriteRecreationActivity) {
        this.favoriteRecreationActivity = favoriteRecreationActivity;
    }
}
