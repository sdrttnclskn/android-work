package com.sdrttnclskn.student;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StudentList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);
        Intent i = getIntent();
        String liste = i.getStringExtra("öğrenci");

        TextView tvList = (TextView)findViewById(R.id.tvList);
        tvList.setText(liste);
        getSupportActionBar().setTitle("Öğrenci Listesi");


    }

    public void exitStudent(View view) {
        finish();
    }
}
