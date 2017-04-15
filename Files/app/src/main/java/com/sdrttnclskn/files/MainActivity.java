package com.sdrttnclskn.files;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            FileOutputStream fos = openFileOutput("file", MODE_PRIVATE);
            String mesaj = "hello new a file created";
            fos.write(mesaj.getBytes());
            fos.close();
        }catch (Exception e){

            e.printStackTrace();
        }
        try {
            FileInputStream fis = openFileInput("file");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            TextView tv = (TextView)findViewById(R.id.tvMetin);
            tv.setText(br.readLine());
            fis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        Resources r = getResources();
        InputStream is = r.openRawResource(R.raw.manifesto);
        Scanner sc = new Scanner(is);
        TextView tv = (TextView)findViewById(R.id.tvMetin2);
        String str = "";
        while (sc.hasNext()){
            str += " " + sc.next();
        }
        tv.setText(str);



    }
}
