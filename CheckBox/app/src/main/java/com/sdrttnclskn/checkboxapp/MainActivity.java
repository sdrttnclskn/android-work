package com.sdrttnclskn.checkboxapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void checkBox(View v) {

        CheckBox cv = (CheckBox) v;

        if (cv.isChecked()){

            Toast.makeText(getApplicationContext(),"seçildi",Toast.LENGTH_SHORT).show();
        }else {

            Toast.makeText(getApplicationContext(),"seçilmedi",Toast.LENGTH_SHORT).show();
        }
    }
}
