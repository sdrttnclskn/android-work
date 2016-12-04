package com.example.hafta_sonu.texttospeech;



public class Human implements Konusturan {
    String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String getAnnonuce() {

        return "Benim adım" + name + ".";

    }
}
