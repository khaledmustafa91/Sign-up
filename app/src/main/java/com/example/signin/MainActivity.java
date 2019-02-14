package com.example.signin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    CheckBox Gender1 , Gender2;
    Button button ;
    EditText NameEdit , AddressEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void action(View btn)
    {
        String [] Arr = new String[3];
        NameEdit = (EditText) findViewById(R.id.name);
        String sendName = NameEdit.getText().toString();
        AddressEdit = (EditText)  findViewById(R.id.address);
        String sendAddress = AddressEdit.getText().toString();

        Arr[0] = sendName;
        Arr[1] = sendAddress;

        Gender1 = (CheckBox) findViewById(R.id.male);
        Gender2 = (CheckBox) findViewById(R.id.female);

        if(Gender1.isChecked() && Gender2.isChecked() )
        {
            Toast.makeText(getApplicationContext() , "Choose one Gender please" , Toast.LENGTH_LONG).show();
        }
        else if( !Gender1.isChecked() && !Gender2.isChecked() )
        {
            Toast.makeText(getApplicationContext() , "Choose any Gender please" , Toast.LENGTH_LONG).show();
        }
        else
        {
            if(Gender1.isChecked() )
                Arr[2] = "Male";
            else
                Arr[2] = "Female";
            Intent Name = new Intent(MainActivity.this, Data.class);
            Name.putExtra("Name", Arr);
            startActivity(Name);
        }

    }
}
