// Maven directory structure. https://mkyong.com/intellij/convert-a-java-project-to-maven-project-in-intellij-idea/
// https://www.jetbrains.com/help/idea/convert-a-regular-project-into-a-maven-project.html#add_maven_support
// https://stackoverflow.com/questions/26440623/package-name-does-not-correspond-to-the-file-path-intellij
// In fact if a field is marked as final but not initialised in its declaration then it must be set in all constructors. https://stackoverflow.com/questions/4189045/can-i-make-a-variable-final-after-it-has-been-declared
// A blank final instance variable must be definitely assigned at the end of every constructor of the class in which it is declared; otherwise a compile-time error occurs. https://stackoverflow.com/questions/11345061/why-must-a-final-variable-be-initialized-before-constructor-completes
// https://stackoverflow.com/questions/54196305/array-tostring-returns-a-memory-address-not-actual-values
// Waarom geen unit test voor setSiblings, setChildren, setPets, setFather, setMother, e.a.
// Bonusopdrachten overgeslagen
public class Main {

    public static void main(String[] args) {

        Person andre = new Person("André", "de Groot", 49, 'm');
        Person andre2 = new Person("André", "Marcel", "de Groot", 49, 'm');
        Person michael = new Person("Michael", "de Groot", 8, 'm');
        Person jennifer = new Person("Jennifer", "de Groot", 40, 'f');
        Person grace = new Person("Grace", "de Groot", 71, 'f');
        Person chris = new Person("Chris", "de Groot", 76, 'm');
        Pet pablo = new Pet("Pablo", 18, "Dog");
        Pet nikkie = new Pet("Nikkie", 8, "Dog");
        Pet jopie = new Pet("Jopie", 18, "Cat");

        andre.addSibling(andre, jennifer);
        andre.addParents(chris, grace, andre);
        andre.addPet(andre, pablo);
        andre.addPet(andre, nikkie);
        chris.addPet(chris, jopie);
        jopie.setOwner(chris);


        System.out.println(andre.getFather().getName());
        System.out.println(andre.getMother().getName());
        System.out.println(andre.getChildren()); // null
        System.out.println("getPets(): " + andre.getPets()); // Hoe krijg je hier normale namen? Met @Override toString (Zie in Pet.class)
        System.out.println("Jopie's owner is: " + jopie.getOwner().getName());
    }
}
