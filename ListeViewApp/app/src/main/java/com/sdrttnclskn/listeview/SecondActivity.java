package com.sdrttnclskn.listeview;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private String[] Ulkeler= {"Türkiye", "İran" , "Suriye", "Rusya",
            "Libya", "Afganistan", "Irak", "Mısır", "Yemen", "Zimbawbe",
            "Uganda", "Rwanda", "Kongo", "Kenya", "Nijerya", "Papua Yeni Gine",
            "Jamaika", "Yeni Zelanda", "Avustralya", "Hindistan", "Pakistan",
            "Norveç", "İsveç", "Güney Kore", "Finlandinya"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ListView lvUlkeler = (ListView)findViewById(R.id.lvUlkeler);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,android.R.id.text1,Ulkeler);

        lvUlkeler.setAdapter(adapter);

        lvUlkeler.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                AlertDialog.Builder myPopup =  new AlertDialog.Builder(SecondActivity.this);
                myPopup.setMessage(Ulkeler[position])
                        .setCancelable(false)
                        .setIcon(R.mipmap.ic_launcher)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "Tıklandı" + position, Toast.LENGTH_SHORT).show();
                                dialog.dismiss();
                            }
                        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Hayıra bastınız" + position, Toast.LENGTH_SHORT).show();
                        dialog.dismiss();

                    }
                });



            }
        });

    }
}
