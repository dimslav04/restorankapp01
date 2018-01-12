package com.example.se2_9.restorankappl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    public static final String KEY_SEND1="com.example.se2_9.restorankappl.pr1.send.x";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void sendMethod (View v){
        String data1=((EditText)findViewById(R.id.editText1)).getText().toString();
        Intent bakasha1=new Intent(this,SecondActivity.class);
        bakasha1.putExtra(KEY_SEND1,data1);
startActivity(bakasha1);
    }
}
