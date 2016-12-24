package com.sdrttnclskn.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    int countA;
    int countB;

    @BindView(R.id.tvCountA) TextView tvCountA ;
    @BindView(R.id.tvCountB) TextView tvCountB ;
    @BindView(R.id.checkBox) CheckBox cbCheat ;



    @ Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    public void updateA(){

        tvCountA.setText("" +countA);
    }
    public void updateB(){
        if (cbCheat.isChecked()){
            countB = countB -1;
        }

        tvCountB.setText("" +countB);
    }

    @OnClick(R.id.btnThreeA) void ThreeA() {
        countA =countA+3;
        updateA();

    }
    @OnClick(R.id.btnThreeB) void ThreeB() {
        countB =countB+3;
        updateB();
    }
    @OnClick(R.id.btnTwoA) void TwoA() {
        countA =countA+2;
        updateA();

    }
    @OnClick(R.id.btnTwoB) void TwoB() {
        countB=countB+2;
        updateB();

    }
    @OnClick(R.id.btnOneA) void OneA() {
        countA =countA+1;
        updateA();

    }
    @OnClick(R.id.btnOneB) void OneB() {
        countB =countB+1;
        updateB();

    }
    @OnClick(R.id.btnReset) void Reset() {

        if (cbCheat.isChecked()){
            countB = 1;
        }else
        {
            countB = 0;
        }
        countA = 0;

        updateB();
        updateA();

    }
}
