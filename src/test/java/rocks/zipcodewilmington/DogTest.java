package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
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

    @Test
    public void dogSpeakTest(){
        //Given

        Dog dog = new Dog (null, null, 0);
        String expected = "bark!";

        //when
        String actual = dog.speak();

        //Then

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDateTest(){

        //Given
        Dog dog = new Dog (null, null, 0);
        Date expectedDate = new Date();

        //When
        dog.setBirthDate(expectedDate);

        //Then
        Date actualDate = dog.getBirthDate();
        Assert.assertEquals(expectedDate,actualDate);



    }



}

