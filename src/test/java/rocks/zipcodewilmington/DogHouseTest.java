package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addDogTest() {
        Integer expectedDogNum = 2;
        DogHouse.add(new Dog("", new Date(), 12));
        Integer actualCatNum = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expectedDogNum, actualCatNum);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeIdTest() {
        Integer givenID = 12;
        Dog dog = new Dog("", new Date(), givenID);
        DogHouse.add(dog);
        DogHouse.remove(givenID);
        Assert.assertNull(DogHouse.getDogById(givenID));
    }

    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeCatTest() {
        Integer givenId = 44;
        Dog dog = new Dog("", new Date(), givenId);
        DogHouse.add(dog);
        DogHouse.remove(dog);
        Assert.assertNull(DogHouse.getDogById(givenId));
    }

    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getCatIdTest() {
        Integer givenId = 2;
        Dog expectedDog = new Dog("", new Date(), givenId);
        DogHouse.add(expectedDog);
        Dog actualDog = DogHouse.getDogById(givenId);
        Assert.assertEquals(expectedDog, actualDog);
    }

    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void testGetNumberOfDogs(){
        // Given (some
        String name = "Marty";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
