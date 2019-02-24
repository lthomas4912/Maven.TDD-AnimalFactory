package rocks.zipcodewilmington.animals;

import rocks.zipcodewilmington.Food;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class Cat extends Mammal {

    private int numberOfMealEaten;


    public Cat(String name, Date birthDate, Integer id) {
        super(name, birthDate, id);
    }

    public String speak() {
        return "Meow";
    }





}

