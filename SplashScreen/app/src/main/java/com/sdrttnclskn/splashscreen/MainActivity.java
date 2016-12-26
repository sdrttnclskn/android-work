package com.sdrttnclskn.splashscreen;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String [] countries = {"Almanya","Norveç","ABD"};
        Spinner spCountries = (Spinner)findViewById(R.id.spCountry);

        ArrayAdapter<String> adaptor = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item,countries);
        spCountries.setAdapter(adaptor);

        spCountries.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Seçildi  " + countries[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(getApplicationContext(), "Seçilmedi ", Toast.LENGTH_SHORT).show();

            }
        });



        Switch swBluetoothe = (Switch)findViewById(R.id.swBluetooth);
        swBluetoothe.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    bluetooth(isChecked);

            }
        });
        BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (mBluetoothAdapter ==null){
            swBluetoothe.setEnabled(false);
        }

        final ToggleButton tgWifi = (ToggleButton)findViewById(R.id.tbWifi);
        tgWifi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                WifiManager wifiManager = (WifiManager)getApplicationContext().getSystemService(Context.WIFI_SERVICE);

               /* WifiManager wifiManager = (WifiManager)this.context.getSystemService(Context.WIFI_SERVICE);
                wifiManager.setWifiEnabled(status);*/
                if (tgWifi.isChecked()){

                    wifiManager.setWifiEnabled(true);
                }else {
                   wifiManager.setWifiEnabled(false);
                }
            }
        });


    }

   /* void kapat() {

        BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
       if (mBluetoothAdapter ==null){
           //desteklemiyor

       }else {
           if (mBluetoothAdapter.isEnabled()){
               mBluetoothAdapter.disable();
           }
       }

    }
    void ac(){

        BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (mBluetoothAdapter ==null){
            //desteklemiyor

        }else {
            if (!mBluetoothAdapter.isEnabled()){
                mBluetoothAdapter.enable();
            }
        }
    }
*/
    void bluetooth(boolean state){


        BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (mBluetoothAdapter ==null){

            Toast.makeText(getApplicationContext(), "Desteklemiyor", Toast.LENGTH_SHORT).show();
        }else {

            if(mBluetoothAdapter.isEnabled() && !state)
            {
                mBluetoothAdapter.disable();
            }
            else if(!mBluetoothAdapter.isEnabled() && state)
            {
                mBluetoothAdapter.enable();
            }
        }

    }

    public void onMaleSelected(View v) {

        Toast.makeText(getApplicationContext(), "Erkek seçildi", Toast.LENGTH_SHORT).show();

    }

    public void onFameleSelected(View v) {

        Toast.makeText(getApplicationContext(), "Kadın seçildi", Toast.LENGTH_SHORT).show();

    }
   /* public void onGender(View v){

        RadioButton rbselected = (RadioButton) v;

        switch (rbselected.getId()){

        case R.id.rbMale:
                Toast.makeText(getApplicationContext(), "Erkek seçildi", Toast.LENGTH_SHORT).show();
                break;

       case R.id.rbFemale:
         Toast.makeText(getApplicationContext(), "Kadın seçildi", Toast.LENGTH_SHORT).show();
            break;
        }
    }*/
}
