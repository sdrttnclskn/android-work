package com.sdrttnclskn.student;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Student>listStudent;
    String kayitListesi = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listStudent = new ArrayList<>();
    }

    public void saveStudent(View view) {
        EditText etName = (EditText)findViewById(R.id.etName);
        EditText etSurname= (EditText)findViewById(R.id.etNumber);
        EditText etNumber = (EditText)findViewById(R.id.etNumber);

        String name = etName.getText().toString();
        String surname = etSurname.getText().toString();
        String number = etNumber.getText().toString();

        Student yeniOgrenci = new Student(name,surname,number);

        if (name.isEmpty()||surname.isEmpty()||number.isEmpty()){

            Toast.makeText(getApplicationContext(),"Lütfen Eksiksiz Doldurunuz.:)",Toast.LENGTH_SHORT).show();

        }else {

            listStudent.add(yeniOgrenci);
        }

    }

    public void listStudent(View view) {

        for (Student item : listStudent){

            kayitListesi = kayitListesi + item.name + " \n" + item.surname + "\n" + item.numberStudent + " \n";
        }
        Intent i = new Intent(MainActivity.this,StudentList.class);
        i.putExtra("öğrenci",kayitListesi);
        startActivity(i);

    }
}
