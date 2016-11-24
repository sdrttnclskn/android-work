package com.diyalektik.operationtwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String sayi1,sayi2,islem;
    int a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int toplama (int a,int b){

        a =Integer.parseInt(sayi1);
        b =Integer.parseInt(sayi2);
        return a+b ;
    }
    public int cikarma (int a,int b){

        a =Integer.parseInt(sayi1);
        b =Integer.parseInt(sayi2);
        return a-b;
    }
    public int bolme (int a,int b){
        a =Integer.parseInt(sayi1);
        b =Integer.parseInt(sayi2);
        return a/b;
    }
    public int carpma (int a,int b){
        a =Integer.parseInt(sayi1);
        b =Integer.parseInt(sayi2);
        return a*b;
    }
    public int mod (int a,int b){
        a =Integer.parseInt(sayi1);
        b =Integer.parseInt(sayi2);
        return a%b;
    }

    public void show(View view) {
        EditText number1 = (EditText)findViewById(R.id.etNumber1);
        EditText number2 = (EditText)findViewById(R.id.etNumber2);
        EditText operation = (EditText)findViewById(R.id.etOperation);
        TextView tvSonuc = (TextView)findViewById(R.id.tvResult);
        islem = operation.getText().toString();
        sayi1 = number1.getText().toString();
        sayi2 = number2.getText().toString();


        try {

            if (sayi1.equals("")||sayi2.equals("")||islem.equals("")){
                Toast.makeText(getApplication(),"Eksizksiz doldurunuz.",Toast.LENGTH_SHORT).show();
            } else if (islem.equals("+")){
                tvSonuc.setText(toplama(a,b) + "");
            }
            else if (islem.equals("-")){
                tvSonuc.setText(cikarma(a,b)+ "");
            }
            else if (islem.equals("/")){
                tvSonuc.setText(bolme(a,b)+ "");
            }
            else if (islem.equals("*")){
                tvSonuc.setText(carpma(a,b)+ "");
            }
            else if (islem.equals("%")){
                tvSonuc.setText(mod(a,b)+ "");
            } else {

            }

        }catch (Exception e){
            e.printStackTrace();
            Toast.makeText(getApplication(),"Değerleri Kontrol Ediniz!",Toast.LENGTH_SHORT).show();

        }

    }
}
