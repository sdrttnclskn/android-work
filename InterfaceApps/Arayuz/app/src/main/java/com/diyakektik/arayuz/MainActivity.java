package com.diyakektik.arayuz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Circle c = new Circle(3);
        Log.i("circle","Area :" +c.getArea());

        Rectangele r =  new Rectangele(10,2);
        Log.i("rectangle","Area :" +r.getArea());

        Triangle t = new Triangle(5,3);
        Log.i("triangle","Area :" +t.getArea());

        Button btn = (Button)findViewById(R.id.btnShowText);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"selam:(",Toast.LENGTH_SHORT).show();
            }
        });

    }


}
