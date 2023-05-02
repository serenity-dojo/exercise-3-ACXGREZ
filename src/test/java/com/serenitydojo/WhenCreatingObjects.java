package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

import static com.serenitydojo.Dog.makeNoise;

public class WhenCreatingObjects {
    @Test
    public void creating_a_dog() {
        Dog fido = new Dog("Fido", "Bone", 5);
        fido.feed();
        System.out.println(fido.getName());
        System.out.println("Fido goes " + makeNoise());
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);
    }
    @Test
    public void creating_a_hamster() {
        Hamster chip = new Hamster("Chip","Checkers",2);

        System.out.println(chip.getName());

        Assert.assertEquals(chip.getName(),"Chip");
        Assert.assertEquals(chip.getFavoriteGame(), "Checkers");
        Assert.assertEquals(chip.getAge(), 2);
        }

    @Test
    public void creating_a_cat() {
        Cat garfield = new Cat("Garfield","lasagna", 44);

        System.out.println(garfield.getName());

        Assert.assertEquals(garfield.getName(), "Garfield");
        Assert.assertEquals(garfield.getFavroriteFood(),"lasagna");
        Assert.assertEquals(garfield.getAge(),44);
    }

    }

