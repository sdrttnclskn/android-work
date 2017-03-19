package com.sdrttnclskn.exerciseofdo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etSayi = (EditText)findViewById(R.id.etSayi);
        TextView tvSonuc = (TextView)findViewById(R.id.tvSonuc);
          //dizideki en küçük ve enbüyük sayi bulma.
        int[] sayi_dizi = {20,3,435,546,75,879,97,6,9};
        int enkucuk =  sayi_dizi[0],enbuyuk= sayi_dizi[0];
       
        for (int i = 0 ; i<sayi_dizi.length;i++){

          if (enbuyuk < sayi_dizi[i]){
              enbuyuk = sayi_dizi[i];
              
          } else if (enkucuk >  sayi_dizi[i]){

              enkucuk =  sayi_dizi[i];
          }
          
      }
        Log.i("dizi","en kucuk sayi :" +enkucuk);
        Log.i("dizi","en buyuk sayi :" +enbuyuk);
      
       /*
        Arrays.sort(sayi_dizi);

        int enkucuk = sayi_dizi[0];
        int enbuyuk = sayi_dizi[sayi_dizi.length-1];

        Log.i("dizi","en kucuk sayi :" +enkucuk);
        Log.i("dizi","en buyuk sayi :" +enbuyuk);
         */



        // 1 den 100 kadar olan cift sayıların toplamı

        int toplam = 0;

        for (int i = 1 ; i<=100;i++){

            if (i%2 == 0){

                toplam = toplam + i;
            }

        }
        Log.i("cift"," toplam :" +toplam);

        // 1 den 100 kadar girilen sayılardan asal sayıları ekrana yazdırmak.

        for (int i = 2; i<=10; i++){
             int sayi = 0;
            for (int j = 2 ; j <= i/2; j++){
               if (i%j==0){
                   sayi++;
               }
            }
            if (sayi == 0){
                Log.d("asal", "sayi " +i);
            }

        }

        //fibonaci algoritması
     int sa =3,f1=0,f2=1;

     /* String num = etSayi.getText().toString();
        int sa = Integer.valueOf(num);*/
        for (int i=0; i<sa;i++){
           int fyedek = f1;
            f1=f2;
            f2 = fyedek + f2;

        }
       Log.e("fibonaci","sayi :" +f1);


    }
}
