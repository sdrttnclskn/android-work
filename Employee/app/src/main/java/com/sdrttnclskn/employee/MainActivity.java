package com.sdrttnclskn.employee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Salary s = new Salary("sedat çalışkan","güzelyurt","357463",36000);
        s.mailCheck();
        Employee e =  new Salary("sed","beylikduzu","2455466",0);
        e.mailCheck();

    }


}
