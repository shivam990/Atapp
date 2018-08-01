package com.rcpl.atapp;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Thread t = new Thread()  // this is not a part of UI Thread ,this new thread can't touch other views except progressbar.
        {
            public void run()
            {
                for(int i=0;i<3;i++) {
                    try {
                        Thread.sleep(1000);  //for fraction m,n  m=mill n=nano
                    } catch (Exception e) {

                    }
                }
                Intent intent = new Intent(Welcome.this,Login.class);
                startActivity(intent);
                finish();
            }//end of run
        };  //end of line
        t.start();

    }
}
