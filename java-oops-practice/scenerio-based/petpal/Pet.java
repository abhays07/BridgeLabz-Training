import java.util.Random;

public abstract class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;

    private int hunger;   // 0 = full, 100 = very hungry
    private int energy;   // 0 = tired, 100 = energetic
    private int mood;     // 0 = sad, 100 = happy

    // Constructor with random default values
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;

        Random rand = new Random();
        this.hunger = rand.nextInt(50) + 20;
        this.energy = rand.nextInt(50) + 30;
        this.mood = rand.nextInt(50) + 30;
    }

    // Constructor with user-defined internal states
    public Pet(String name, String type, int age, int hunger, int energy, int mood) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = hunger;
        this.energy = energy;
        this.mood = mood;
    }

    // Encapsulated behavior
    protected void increaseEnergy(int value) {
        energy = Math.min(100, energy + value);
    }

    protected void decreaseEnergy(int value) {
        energy = Math.max(0, energy - value);
    }

    protected void increaseMood(int value) {
        mood = Math.min(100, mood + value);
    }

    protected void decreaseHunger(int value) {
        hunger = Math.max(0, hunger - value);
    }

    protected void increaseHunger(int value) {
        hunger = Math.min(100, hunger + value);
    }

    public void showStatus() {
        System.out.println(name + " | Hunger: " + hunger +
                " | Energy: " + energy + " | Mood: " + mood);
    }

    // Polymorphism
    public abstract void makeSound();
}
