package com.serenitydojo;

public class Dog extends Pet {
    private String favoriteToy;
    private int age;
    private boolean isFed;

public Dog(String name, String favoriteToy, int age) {
    super(name);
    this.favoriteToy = favoriteToy;
    this.age = age;
}

static String DOG_NOISE = "Woof";
public static String makeNoise() {
    return DOG_NOISE;
}

public void feed() {
    isFed = true;
}

public String getFavoriteToy() {
    return favoriteToy;
}

public int getAge() {
    return age;
}

}
