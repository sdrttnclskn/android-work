package com.example.hafta_sonu.texttospeech;

import android.os.Build;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    TextToSpeech ttsObj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          ttsObj =new TextToSpeech(getApplication(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {

                if (status == TextToSpeech.SUCCESS){

                   // ttsObj.getAnnonuce("denme",TextToSpeech.QUEUE_ADD,null);
                    ttsObj.setLanguage(new Locale("TR-tr"));// türkçe varsa türkçe döndürür.
                    Toast.makeText(getApplication(),"initializtion başarılı.",Toast.LENGTH_SHORT).show();

                }else {

                    Toast.makeText(getApplication(),"initializtion başarsız.",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    public void aliClick(View view) {
        Human ali = new Human("ALi");
        String annonuce = ali.getAnnonuce();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            ttsObj.speak("deneme",TextToSpeech.QUEUE_ADD,null,"");
        }
        else {
            ttsObj.speak("deneme", TextToSpeech.QUEUE_ADD, null);
        }
    }

    public void ayseClick(View view) {

        Human ayse = new Human("Ayşe");
        String annonuce = ayse.getAnnonuce();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            ttsObj.speak("deneme",TextToSpeech.QUEUE_ADD,null,"");
        }
        else {
            ttsObj.speak("deneme", TextToSpeech.QUEUE_ADD, null);
        }
            }

    public void kadirClick(View view) {

        Human kadir = new Human("Kadir");
        String annonuce = kadir.getAnnonuce();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            ttsObj.speak("deneme",TextToSpeech.QUEUE_ADD,null,"");
        }
        else {
            ttsObj.speak("deneme", TextToSpeech.QUEUE_ADD, null);
        }
    }
}
