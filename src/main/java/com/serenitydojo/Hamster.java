package com.serenitydojo;

public class Hamster extends Pet {
    private String favoriteGame;
    private int age;
    public Hamster(String name, String favoriteGame, int age) {
        super(name);
        this.favoriteGame = favoriteGame;
        this.age = age;
    }

    public String getFavoriteGame() {
        return favoriteGame;
    }

    public void setFavoriteGame(String favoriteGame) {
        this.favoriteGame = favoriteGame;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
