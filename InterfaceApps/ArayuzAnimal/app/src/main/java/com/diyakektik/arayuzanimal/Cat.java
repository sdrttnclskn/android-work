package com.diyakektik.arayuzanimal;

import android.util.Log;

/**
 * Created by Hafta_Sonu on 27.11.2016.
 */

public class Cat implements SpeakListener {

    String m = "miyav";

    @Override
    public String getSpeak() {
        return m;

    }
}
