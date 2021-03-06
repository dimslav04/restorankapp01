package com.example.se2_9.restorankappl;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class LastActivity extends AppCompatActivity {

    MediaPlayer myPlayer;
    EditText bill;
    TextView tip, sah;
    int tips;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
        Intent i=getIntent();

        myPlayer = MediaPlayer.create(this,R.raw.cash_sound);
        bill= (EditText)findViewById(R.id.editTextBill);
        tip=(TextView)findViewById(R.id.textViewTip);
        sah=findViewById(R.id.textViewTotal);
        String  tip1 = getIntent().getStringExtra(SecondActivity.KEY_SEND);
        String  tip2 = getIntent().getStringExtra(SecondActivity.KEY_SEND2);
        tips= Integer.parseInt(tip1)+Integer.parseInt(tip2);
        String tipstr=Integer.toString(tips);
        tip.setText(tipstr);
    }

    public void hashev(View v) {
        myPlayer.start();
        String  billStr = bill.getText().toString();
        int billInt = Integer.parseInt(billStr);
        int totalInt = (int)( billInt + (billInt*(tips/100.0)));
        sah.setText(Integer.toString(totalInt));
    }
}
