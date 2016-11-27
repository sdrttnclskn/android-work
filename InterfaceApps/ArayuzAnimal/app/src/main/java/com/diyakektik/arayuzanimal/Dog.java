package com.diyakektik.arayuzanimal;

/**
 * Created by Hafta_Sonu on 27.11.2016.
 */

public class Dog implements SpeakListener{
    String d = "hav";
    @Override
    public String getSpeak() {
        return d;
    }
}
