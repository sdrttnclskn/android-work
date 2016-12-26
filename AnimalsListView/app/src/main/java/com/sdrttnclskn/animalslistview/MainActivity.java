package com.sdrttnclskn.animalslistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final String[] data = {"Maymun","Zürafa","Fil"};

        ListView lvAnimals = (ListView)findViewById(R.id.lvAnimals);

        ArrayAdapter<String>adapterView = new ArrayAdapter<String>(getApplication(),android.R.layout.simple_list_item_1,android.R.id.text1,data);

        lvAnimals.setAdapter(adapterView);

        lvAnimals.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String tiklanan = data[position];

                Intent intent = new Intent(MainActivity.this,AnimalsActivity.class);
                intent.putExtra("ANİMAL NAME",data[position]);

                startActivity(intent);
            }
        });
    }
}
