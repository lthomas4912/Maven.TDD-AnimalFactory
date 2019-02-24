package rocks.zipcodewilmington;

import javafx.beans.binding.When;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    Cat cat = new Cat("",null,0);
    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void testSetName() {
        // Given

        Cat cat = new Cat(null, null, 0);
        String expected = "Butters";



        //When
        cat.setName(expected);

        //Then
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }


        @Test
         public void speakTest() {

        //Given
        Cat cat = new Cat(null, null, 0);
        String expected = "Meow";

        //When
        cat.speak();

        //Then
        String actual = cat.speak();
        Assert.assertEquals(expected,actual);

        }


    @Test

    public void setBirthDateTest() {

        //Given
        Cat cat = new Cat(null, null, 0);
        Date expectedDate = new Date();

        //When
        cat.setBirthDate(expectedDate);

        //Then
        Date actualDate = cat.getBirthDate();
        Assert.assertEquals(expectedDate, actualDate);
    }

     @Test

        public void eatTest(){

        //Given
        Food food = new Food();
        Cat c = new Cat("",new Date(),0);


        int expected = 1;

        //When
        cat.eat(food);
        int actual = cat.getNumberOfMealsEaten();

        //Then

         Assert.assertEquals(expected, actual);


        }









    }









