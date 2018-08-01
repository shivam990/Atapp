package com.rcpl.atapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       // editText = (EditText)findViewById(R.id.editText2);
        //editText.setHintTextColor(getResources().getColor(R.color.white));
    }
    public void signup(View v){
        Intent intent = new Intent(Login.this,SignUp.class);
        startActivity(intent);
    }
}
