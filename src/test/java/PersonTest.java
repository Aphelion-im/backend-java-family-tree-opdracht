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
    @DisplayName("Get name test")
    void getPets() {
        // Arrange

        // Act

        // Assert
    }

    @Test
    @DisplayName("Get name test")
    void setAge() {
        // Arrange

        // Act

        // Assert
    }

    @Test
    @DisplayName("Get name test")
    void setSex() {
        // Arrange

        // Act

        // Assert
    }

    @Test
    @DisplayName("Get name test")
    void setMother() {
        // Arrange

        // Act

        // Assert
    }

    @Test
    @DisplayName("Get name test")
    void setFather() {
        // Arrange

        // Act

        // Assert
    }

    @Test
    @DisplayName("Get name test")
    void setSiblings() {
        // Arrange

        // Act

        // Assert
    }

    @Test
    @DisplayName("Get name test")
    void setChildren() {
        // Arrange

        // Act

        // Assert
    }

    @Test
    @DisplayName("Get name test")
    void setPets() {
        // Arrange

        // Act

        // Assert
    }

    @Test
    @DisplayName("Get name test")
    void addParents() {
        // Arrange

        // Act

        // Assert
    }

    @Test
    @DisplayName("Get name test")
    void addChildToChildren() {
        // Arrange

        // Act

        // Assert
    }

    @Test
    @DisplayName("Get name test")
    void addPet() {
        // Arrange

        // Act

        // Assert
    }

    @Test
    @DisplayName("Get name test")
    void addSibling() {
        // Arrange

        // Act

        // Assert
    }

    @Test
    @DisplayName("Get name test")
    void getGrandChildren() {
        // Arrange

        // Act

        // Assert
    }
}