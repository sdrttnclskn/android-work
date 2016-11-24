package com.sdrttnclskn.animals;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Animals> listAnimals;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listAnimals= new ArrayList<>();

    }

    public void saveAnimal(View view) {

        EditText name = (EditText)findViewById(R.id.etName);

        String hayvanIsmi = name.getText().toString();

        Animals yeniAnimal = new Animals(hayvanIsmi);

        if (yeniAnimal.equals("")){

            Toast.makeText(getApplication(),"Lütfen bir hayvan ismi giriniz.",Toast.LENGTH_SHORT).show();

        } else {

            listAnimals.add(yeniAnimal);

        }
    }


    public void listAnimal(View view) {

        String kayitListesi = "";


        for (Animals item : listAnimals){


            kayitListesi = kayitListesi + item.name + "\n";
        }

        TextView list = (TextView)findViewById(R.id.tvList);
        list.setText(kayitListesi);
        getSupportActionBar().setTitle("Animals List");
    }
}
