package com.diyalektik.studentregistration;

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
        String kayitListesi =  i.getStringExtra("Öğrenci");

        TextView Liste = (TextView)findViewById(R.id.tvKayitListesi);
        Liste.setText(kayitListesi);
        getSupportActionBar().setTitle("Öğrenci Kayit Listesi");
    }

    public void listExit(View view) {
        finish();
    }
}
