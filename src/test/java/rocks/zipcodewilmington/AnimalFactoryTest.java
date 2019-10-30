package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;


/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    private MainApplication mainApplication;

    @Before
    public void setUp() { mainApplication = new MainApplication();}

    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest(){
        String expectedName = "";
        Date date = new Date();
        Dog dog = AnimalFactory.createDog(expectedName, date);
        String actualName = dog.getName();
        Date birthDate = dog.getBirthDate();
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(date, birthDate);
    }
    @Test
    public void creatCatTest(){
        String expectedName = "";
        Date date = new Date();
        Cat cat = AnimalFactory.createCat(expectedName, date);
        String actualName = cat.getName();
        Date birthDate = cat.getBirthDate();
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(date, birthDate);
    }



    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
}
