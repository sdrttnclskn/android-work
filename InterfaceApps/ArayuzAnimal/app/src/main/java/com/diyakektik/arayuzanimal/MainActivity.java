package com.diyakektik.arayuzanimal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Cat c = new Cat();
        c.getSpeak();

        Log.i("cat",""+c.getSpeak());

        Dog d = new Dog();
        d.getSpeak();
        Log.i("dog",""+d.getSpeak());

        Ass a = new Ass();
        a.getSpeak();
        Log.i("ass",""+a.getSpeak());

        Bird b = new Bird();
        b.getSpeak();
        Log.i("bird",""+b.getSpeak());

        Button btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Toast.makeText(getApplicationContext(),"selam:(",Toast.LENGTH_SHORT).show();
    }
}
