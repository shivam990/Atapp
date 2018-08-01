package com.rcpl.atapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class SignUp extends AppCompatActivity {

    private EditText registered_name,faculty_no,enroll_no,mobile,username,password;

    private Button buttonSubmit;
//    private AwesomeValidation awesomeValidation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
  //      awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);
        registered_name = (EditText)findViewById(R.id.registered_name);
        faculty_no = (EditText)findViewById(R.id.faculty_no);
        enroll_no = (EditText)findViewById(R.id.enroll_no);
        mobile = (EditText)findViewById(R.id.mobile);
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        buttonSubmit = (Button) findViewById(R.id.buttonSubmit);


    //    awesomeValidation.addValidation(this, R.id.registered_name, "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$", R.string.nameerror);
      //  awesomeValidation.addValidation(this, R.id.mobile, Range.closed(13, 60), R.string.mobileerror);
    }
    public void signup(View v){
        final String pass = password.getText().toString();
        final String name = registered_name.getText().toString();
        final String faculty = faculty_no.getText().toString();
        final String enroll = enroll_no.getText().toString();
        final String user = username.getText().toString();
        final String mob = mobile.getText().toString();
        if(!isValidName(name)){
            registered_name.setError("Enter Name");
        }
        if (!isValidFaculty(faculty)) {
            faculty_no.setError("Invalid Faculty Number");
        }
        if (!isValidEnroll(enroll)) {
            enroll_no.setError("Invalid Enrollment Number");
        }
        if (!isValidMobile(mob)) {
            mobile.setError("Invalid mobile number");
        }
        if (!isValidUser(user)) {
            username.setError("Invalid Username");
        }
        if (!isValidPassword(pass)) {
            password.setError("Invalid Password");
        }

    }
    private boolean isValidName(String name){
        int l = name.length();
        if(l==0)
            return false;
        else
            return true;
    }
    private boolean isValidFaculty(String faculty){
        int l = faculty.length();
        if(l>=8)
            return true;
        else
            return false;
    }
    private boolean isValidEnroll(String enroll){
        int l = enroll.length();
        if(l==6)
            return true;
        else
            return false;
    }
    private boolean isValidMobile(String mob){
        int l = mob.length();
        if(l==10)
            return true;
        else
            return false;
    }
    private boolean isValidUser(String user){
        int l = user.length();
        if(l>=6)
            return true;
        else
            return false;
    }
    private boolean isValidPassword(String pass) {
        if (pass != null && pass.length() > 6) {
            return true;
        }
        return false;
    }

}
