package com.example.se2_9.restorankappl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    public static final String KEY_SEND2="com.example.se2_9.restorankappl.pr1.send.y";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public static final String KEY_SEND="com.example.se2_9.restorankappl.pr1.send.x";



    public void sendMethod (View v){
        Intent bakasha2=new Intent(this,LastActivity.class);
        bakasha2.putExtra(KEY_SEND2,((EditText)findViewById(R.id.editText2)).getText().toString());
        bakasha2.putExtra(KEY_SEND,getIntent().getStringExtra(FirstActivity.KEY_SEND1));
        startActivity(bakasha2);
    }
}
