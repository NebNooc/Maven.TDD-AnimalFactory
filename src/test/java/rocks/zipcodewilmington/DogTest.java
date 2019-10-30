package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void constructorTest() {
        String expectedString = "";
        Date date = new Date();
        Integer expectedId = 0;
        Dog dog = new Dog(expectedString, date, expectedId);
        Assert.assertEquals(expectedString, dog.getName());
        Assert.assertEquals(date, dog.getBirthDate());
        Assert.assertEquals(expectedId, dog.getId());
    }

    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        String speak = "bark!";
        Dog dog = new Dog("", new Date(), 10);
        Assert.assertEquals(speak, dog.speak());
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void birthdateTest() {
        Date date = new Date();
        Dog dog = new Dog("", null, 1);
        dog.setBirthDate(date);
        Assert.assertEquals(date, dog.getBirthDate());
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest() {
        Integer eat = 1;
        Dog dog = new Dog("", null, 24);
        dog.eat(new Food());
        Assert.assertEquals(eat, dog.getNumberOfMealsEaten());
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest() {
        Integer id = 80;
        Dog dog = new Dog("", null, id);
        Integer actualId = dog.getId();
        Assert.assertEquals(id, actualId);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInheritance() {
        Dog dog = new Dog("", null, 35);
        Assert.assertTrue(dog instanceof Animal);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInheritance() {
        Dog dog = new Dog("", null, 99);
        Assert.assertTrue(dog instanceof Mammal);
    }


    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
