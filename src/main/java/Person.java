import java.util.ArrayList;
import java.util.List;

public class Person {
    private final String name; // Final niet in de NOVI-uitwerkingen. Alleen een setter.
    private String middleName; // Deze kan waarschijnlijk niet op final omdat deze niet in de eerste constructor staat als parameter
    private final String lastName;
    private int age;
    private char sex;
    private Person mother;
    private Person father;
    private List<Person> siblings; // Niet doen: = new ArrayList<>();! Maar in de method.
    private List<Person> children;
    private List<Pet> pets;
    // List<Pet> pets = new ArrayList<>(); Geeft een dubbele pet: waarom? getPets(): [Pet@4eec7777, Pet@4eec7777, Pet@3b07d329]

    public Person(String name, String lastName, int age, char sex) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public Person(String name, String middleName, String lastName, int age, char sex) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    // Getters & Setters
    // Geen print/sout in getters/setters, maar een return!
    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public List<Person> getChildren() {
        return children;
    }

    public List<Pet> getPets() { // Geeft: [Pet@3b07d329, Pet@41629346], tenzij je toString @Override in Pet.java
        return pets;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void setSiblings(List<Person> siblings) {
        this.siblings = siblings;
    }

    // ja
    public void setChildren(List<Person> children) {
        this.children = children;
    }

    // ja
    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    // Methods

    // Met alleen een father en mother parameter, zie je niet wie het kind is.
    // addChild() bestaat niet, omdat het niet aangeeft wie de vader is.
    public void addParents(Person father, Person mother, Person child) {
        child.setMother(mother);
        child.setFather(father);
        // ?
        mother.addChildToChildren(mother, child);
        father.addChildToChildren(father, child);
    }

    // Hoe deze method opvatten?!
    public void addChildToChildren(Person parent, Person child) {
        List<Person> kids = new ArrayList<>();
        if (parent.getChildren() != null) {
            kids.addAll(parent.getChildren());
        }
        kids.add(child);
        parent.setChildren(kids);
    }

    // Steeds een null of niet gelijk aan null check
    // https://youtu.be/lm72_HCd17s?si=KF6wkEMwfPGUCEqc (Coding with John, Null Pointer Exceptions In Java - What EXACTLY They Are and How to Fix Them)
    public void addPet(Person person, Pet pet) { // Herschrijven met een Optional?
        List<Pet> pets = new ArrayList<>(); // Waarom hier en niet als attribuut? Als field/attribuut geeft het dubbele pet terug. 2x Pablo.
        if (person.getPets() != null) { // null = De persoon heeft geen huisdieren. Null geeft Exception error: Cannot invoke iterator
            pets.addAll(person.getPets()); // Alleen als een persoon een huisdier of huisdieren heeft, voeg deze dan toe aan de lijst
        }
        pets.add(pet); // Voeg een huisdier toe aan de lijst pets
        person.setPets(pets); // Ken de lijst toe aan een persoon als de eigenaar
    }

    public void addSibling(Person person, Person sibling) {
        List<Person> family = new ArrayList<>();
        if (person.getSiblings() != null) {
            for (Person people : person.getSiblings()) {
                family.add(people);
            }
        }
        family.add(sibling);
        person.setSiblings(family);
    }

    public List<Person> getGrandChildren(Person person) {
        List<Person> grandChildren = new ArrayList<>();
        if (person.getChildren() != null) {
            for (Person children : person.getChildren()) {
                if (children.getChildren() != null) {
                    for (Person grandKid : children.getChildren()) {
                        grandChildren.add(grandKid);
                    }
                }
            }
        }
        return grandChildren;
    }
}

//    public void printPets() {
//        System.out.println(this.name + " has the following pets:");
//        for (Pet pet : pets) {
//            System.out.println("- " + pet.getName());
//        }
//    }