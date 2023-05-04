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
        Assert.assertEquals("Fido",fido.getName());
        Assert.assertEquals("Bone",fido.getFavoriteToy());
        Assert.assertEquals(5,fido.getAge());
    }
    @Test
    public void creating_a_hamster() {
        Hamster chip = new Hamster("Chip","Checkers",2);

        System.out.println(chip.getName());

        Assert.assertEquals("Chip",chip.getName());
        Assert.assertEquals("Checkers",chip.getFavoriteGame());
        Assert.assertEquals(2,chip.getAge());
        }

    @Test
    public void creating_a_cat() {
        Cat garfield = new Cat("Garfield","lasagna", 44);

        System.out.println(garfield.getName());

        Assert.assertEquals("Garfield",garfield.getName());
        Assert.assertEquals("lasagna",garfield.getFavoriteFood());
        Assert.assertEquals(44,garfield.getAge());
    }

    }

