package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=findViewById(R.id.button2);
        btn.setText("Register");


    }

    public void onBtnClick(View view){




        //finding the text view
       TextView textview=findViewById(R.id.textView5);

        EditText editfName =findViewById(R.id.editfirstName);
        textview.setText("First Name: " +editfName.getText().toString());

        TextView textview1=findViewById(R.id.textView3);
        EditText editlName =findViewById(R.id.editlastName);
        textview1.setText("Last Name: " +editlName.getText().toString());

        TextView textview2=findViewById(R.id.textView4);
        EditText editemail =findViewById(R.id.editEmail);
        textview2.setText("Email: " +editemail.getText().toString());


    }
}