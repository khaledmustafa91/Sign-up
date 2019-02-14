package com.example.signin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Data extends AppCompatActivity {

    TextView Nameview ,Addressview , Genderview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        String [] ArrDelivier = getIntent().getStringArrayExtra("Name");
        Nameview = (TextView) findViewById(R.id.name);
        Nameview.setText(ArrDelivier[0]);

        Addressview = (TextView) findViewById(R.id.address);
        Addressview.setText(ArrDelivier[1]);

        Genderview = (TextView) findViewById(R.id.gender);
        Genderview.setText(ArrDelivier[2]);
    }
    public void action(View v)
    {
        startActivity( new Intent(Data.this , MainActivity.class));
    }
}
