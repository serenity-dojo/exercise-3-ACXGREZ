package com.serenitydojo;

public class Dog {

    private String name;
    private String favoriteToy;
    private int age;
    private boolean isFed;

public Dog(String name, String favoriteToy, int age) {
    this.name = name;
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

public String getName() { return name;}
public String getFavoriteToy() {
    return favoriteToy;
}

public int getAge() {
    return age;
}

}
