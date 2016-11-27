package com.sdrttnclskn.activityhayatdongusu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("ActiviyLifecyle","onCreate");
        Toast.makeText(getApplicationContext(),"geldim.",Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onStart() {
        Log.i("ActiviyLifecyle", "onStart");

        super.onStart();
    }

    @Override
    protected void onResume() {

        Log.i("ActiviyLifecyle", "onResume");

        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i("ActiviyLifecyle", "onPause");

        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i("ActiviyLifecyle", "onStop");

        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i("ActiviyLifecyle","onDestroy");
        Toast.makeText(getApplicationContext(),"gittim.",Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}
