import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    @DisplayName("Get name test constructor 1 - Name should not change during creation")
    void getNameConstructor1() {
        // Arrange
        Person person = new Person("André", "de Groot", 49, 'm');
        // Act
        String output = person.getName();
        // Assert
        assertEquals("André", output);
    }

    @Test
    @DisplayName("Get middle name test - Constructor 2")
    void getMiddleName() {
        // Arrange
        Person person = new Person("André", "Marcel", "de Groot", 49, 'm');
        // Act
        String output = person.getMiddleName();
        // Assert
        assertEquals("Marcel", output);
    }

    @Test
    @DisplayName("Get last name test")
    void getLastName() {
        // Arrange
        Person person = new Person("André", "de Groot", 49, 'm');
        // Act
        String output = person.getLastName();
        // Assert
        assertEquals("de Groot", output);
    }

    @Test
    @DisplayName("Get sex test")
    void getSex() {
        // Arrange
        Person person = new Person("André", "de Groot", 49, 'm');
        // Act
        char output = person.getSex();
        // Assert
        assertEquals('m', output);
    }

    @Test
    @DisplayName("Get age test")
    void getAge() {
        // Arrange
        Person person = new Person("André", "de Groot", 49, 'm');
        // Act
        int output = person.getAge();
        // Assert
        assertEquals(49, output);
    }

    @Test
    @DisplayName("Get mother test")
    void getMother() {
        // Arrange
        Person andre = new Person("André", "de Groot", 49, 'm');
        Person grace = new Person("Grace", "de Groot", 71, 'f');
        andre.setMother(grace);
        // Act
        String output = andre.getMother().getName();
        // Assert
        assertEquals("Grace", output);
    }

    @Test
    @DisplayName("Get father test - Should show a father")
    void getFather() {
        // Arrange
        Person andre = new Person("André", "de Groot", 49, 'm');
        Person chris = new Person("Chris", "de Groot", 76, 'm');
        andre.setFather(chris);
        // Act
        String output = andre.getFather().getName();
        // Assert
        assertEquals("Chris", output);
    }

    @Test
    @DisplayName("Get siblings test - Siblings should be added to list")
    void getSiblings() {
        // Arrange
        Person andre = new Person("André", "de Groot", 49, 'm');
        Person jennifer = new Person("Jennifer", "de Groot", 40, 'f');
        Person jennifer2 = new Person("Jennifer2", "de Groot", 40, 'f');
        andre.addSibling(andre, jennifer);
        andre.addSibling(andre, jennifer2);
        // Act
        List<Person> output = andre.getSiblings();

        List<Person> expectedOutput = new ArrayList<>();
        expectedOutput.add(jennifer);
        expectedOutput.add(jennifer2);
        // Assert
        assertArrayEquals(expectedOutput.toArray(), output.toArray());
    }

    @Test
    @DisplayName("Get children test")
    void getChildren() {
        // Arrange
        Person andre = new Person("André", "de Groot", 49, 'm');
        Person lonneke = new Person("Lonneke", "de Groot", 44, 'f');
        Person michael = new Person("Michael", "de Groot", 8, 'm');
        Person alyssa = new Person("Alyssa", "de Groot", 6, 'f');

        List<Person> kids = new ArrayList<>();
        kids.add(michael);
        kids.add(alyssa);
        andre.setChildren(kids);
        // Act
        List<Person> children = andre.getChildren();
        // Assert
        assertEquals(kids, children);
    }

    @Test
    @DisplayName("Get pets test")
    void getPets() {
        // Arrange
        Person andre = new Person("André", "de Groot", 49, 'm');
        Pet jopie = new Pet("Jopie", 18, "Cat");
        Pet pablo = new Pet("Pablo", 18, "Dog");
        List<Pet> pets = new ArrayList<>();
        pets.add(jopie);
        pets.add(pablo);
        andre.setPets(pets);
        // Act
        List<Pet> petsList = andre.getPets();
        // Assert
        assertEquals(pets, petsList);
    }

    @Test
    @DisplayName("Set age test")
    void setAge() {
        // Arrange
        Person andre = new Person("André", "de Groot", 49, 'm');
        // Act
        andre.setAge(50);
        int output = andre.getAge();
        // Assert
        assertEquals(50, output);
    }

    @Test
    @DisplayName("Set sex test")
    void setSex() {
        // Arrange
        Person andre = new Person("André", "de Groot", 49, 'm');
        // Act
        andre.setSex('f');
        char newGender = andre.getSex();
        // Assert
        assertEquals('f', newGender);
    }

    @Test
    @DisplayName("Add parents test")
    void addParents() {
        // Arrange
        Person andre = new Person("André", "de Groot", 49, 'm');
        Person chris = new Person("Chris", "de Groot", 76, 'm');
        Person grace = new Person("Grace", "de Groot", 71, 'm');
        // Act
        andre.addParents(chris, grace, andre);
        Person mother = andre.getMother();
        Person father = andre.getFather();
        // Assert
        assertEquals(grace, mother);
        assertEquals(chris, father);
    }

    @Test
    @DisplayName("Add children to children test")
    void addChildToChildren() {
        // Arrange
        Person person1 = new Person("Piet", "Pietersen", 34, 'm');
        Person person2 = new Person("Jan", "Pietersen", 64, 'm');
        List<Person> children = new ArrayList<>();
        children.add(person1);
        // Act
        person2.addChildToChildren(person2, person1);
        List<Person> kids = person2.getChildren();
        // Assert
        assertEquals(children, kids);
    }

    @Test
    @DisplayName("Add pet test")
    void addPet() {
        // Arrange
        Person andre = new Person("André", "de Groot", 49, 'm');
        Pet pablo = new Pet("Pablo", 18, "Dog");
        Pet tim = new Pet("Tim", 18, "Dog");
        List<Pet> pets = new ArrayList<>();
        // Act
        pets.add(pablo);
        pets.add(tim);
        andre.addPet(andre, pablo);
        andre.addPet(andre, tim);
        // Assert
        assertEquals(pets, andre.getPets());
    }

    @Test
    @DisplayName("Add sibling test")
    void addSibling() {
        // Arrange
        Person andre = new Person("André", "de Groot", 49, 'm');
        Person jennifer = new Person("Jennifer", "de Groot", 40, 'f');
        List<Person> siblings = new ArrayList<>();
        // Act
        siblings.add(jennifer);
        andre.addSibling(andre, jennifer);
        // Assert
        assertEquals(siblings, andre.getSiblings());
    }

    @Test
    @DisplayName("Get grand children test")
    void getGrandChildren() {
        // Arrange
        List<Person> grandChildren = new ArrayList<>();
        Person person1 = new Person("Jay Jay", "Pietersen", 3, 'f');
        Person person2 = new Person("James", "Pietersen", 22, 'm');
        Person person3 = new Person("Jan", "Pietersen", 64, 'm');
        grandChildren.add(person1);
        // Act
        person2.addChildToChildren(person2, person1);
        person3.addChildToChildren(person3, person2);
        List<Person> list = person3.getGrandChildren(person3);
        // Assert
        assertEquals(grandChildren, list);
    }
}