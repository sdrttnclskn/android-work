package com.sdrttnclskn.kalitimapp;


public class Vertabrate extends  Animal{

    String hasBones;

    public Vertabrate(String eatFood, String hasBones) {
        super(eatFood);
        this.hasBones = hasBones;

    }

    String getHasBones(){

        return getEatFood();
    }
}
