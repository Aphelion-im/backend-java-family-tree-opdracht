import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PetTest {

    @Test
    @DisplayName("Get Name test")
    void getName() {
        // Arrange
        Pet cat = new Pet("Jopie", 18, "Cat");
        // Act
        String output = cat.getName();
        // Assert
        assertEquals("Jopie", output);
    }

    @Test
    @DisplayName("Get Age test")
    void getAge() {
        // Arrange
        Pet cat = new Pet("Jopie", 18, "Cat");
        // Act
        int output = cat.getAge();
        // Assert
        assertEquals(18, output);
    }

    @Test
    @DisplayName("Get Species test")
    void getSpecies() {
        // Arrange
        Pet cat = new Pet("Jopie", 18, "Cat");
        // Act
        String output = cat.getSpecies();
        // Assert
        assertEquals("Cat", output);
    }

    @Test
    @DisplayName("Get Owner test")
    void getOwner() {
        // Arrange
        Pet jopie = new Pet("Jopie", 18, "Cat");
        Person chris = new Person("Chris", "de Groot", 76, 'm');
        jopie.setOwner(chris);
        // Act
        Person output = jopie.getOwner();
        // Assert
        assertEquals(chris, output);
    }

    @Test
    @DisplayName("Set Owner test")
    void setOwner() {
        // Arrange
        Pet jopie = new Pet("Jopie", 18, "Cat");
        Person chris = new Person("Chris", "de Groot", 76, 'm');
        // Act
        jopie.setOwner(chris);
        String output = jopie.getOwner().getName();
        // Assert
        assertEquals("Chris", output);
    }


}