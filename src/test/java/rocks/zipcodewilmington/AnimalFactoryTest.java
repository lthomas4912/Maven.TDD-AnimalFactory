package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void creatDogTest(String name, Date birthDate){
        Dog dog = new Dog(name,birthDate,0);
        //Given
        String expectedName = "";
        Date expectedBirthDate = new Date();


        //When
        AnimalFactory.createDog(expectedName,expectedBirthDate);
        String actualName = dog.getName();
        Date actualBirthDate = dog.getBirthDate();

        //Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthDate, actualBirthDate);


    }



}


