import org.junit.jupiter.api.Disabled;

public class Pet {
    private final String name;
    private final int age;
    private final String species; // Final: only a getter
    private Person owner; // Can change owner. Can get and set.

    public Pet(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    //    Getters & Setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    // Anders print .getPets() geheugen adressen
    @Override
    public String toString() {
        return name;
    }
}
