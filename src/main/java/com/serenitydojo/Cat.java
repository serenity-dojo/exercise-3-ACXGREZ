package com.serenitydojo;

public class Cat extends Pet {
//    private String name;
    private String favroriteFood;
    private int age;

    public Cat(String name,String favroriteFood,int age) {
        super(name);
//        this.name = name;
        this.favroriteFood = favroriteFood;
        this.age = age;
    }
//    public String getName() {
//        return name;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getFavroriteFood() {
        return favroriteFood;
    }

    public void setFavroriteFood(String favroriteFood) {
        this.favroriteFood = favroriteFood;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
