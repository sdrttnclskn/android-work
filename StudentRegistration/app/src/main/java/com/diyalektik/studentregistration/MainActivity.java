package com.diyalektik.studentregistration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String kayıtListesi ="";
    ArrayList<Student> studentList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void studentList(View view) {

        Intent i = new Intent(MainActivity.this,StudentList.class);
        i.putExtra("Öğrenci",kayıtListesi);
        startActivity(i);
    }

    public void studentSave(View view) {

        EditText etName = (EditText)findViewById(R.id.etName);
        EditText etSurname = (EditText)findViewById(R.id.etSurname);
        EditText etEmail = (EditText)findViewById(R.id.etEmail);
        EditText etDepartman = (EditText)findViewById(R.id.etDepartman);

        String name = etName.getText().toString();
        String surname = etSurname.getText().toString();
        String email = etEmail.getText().toString();
        String departman = etDepartman.getText().toString();

        if (name.isEmpty()|| surname.isEmpty()|| email.isEmpty() || departman.isEmpty()){

            Toast.makeText(getApplication(),"Lütfen eksikssiz doldurunuz.",Toast.LENGTH_SHORT).show();
        }

        studentList = new ArrayList<>();
        Student yeniOgrenci = new Student(name,surname,email,departman);
        studentList.add(yeniOgrenci);

        for (Student item : studentList){

            kayıtListesi = kayıtListesi  + item.name + " \n " + item.surname + " \n " + item.email + " \n "
                    + item.departman + " \n \n ";
        }


    }
}
