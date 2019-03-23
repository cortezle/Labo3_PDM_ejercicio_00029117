package com.example.tarealaboratorio03;

import android.arch.core.executor.TaskExecutor;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    private TextView tv1,tv2,tv3,tv4;
    private String[] datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        tv1 = findViewById(R.id.textview_user_shared);
        tv2 = findViewById(R.id.textview_pass_shared);
        tv3 = findViewById(R.id.textview_email_shared);
        tv4 = findViewById(R.id.textview_genero_shared);

        Intent mIntent = getIntent();
        datos = mIntent.getStringExtra(Intent.EXTRA_TEXT).split(",");

        if(mIntent!=null){
            tv1.setText(tv1.getText() + "User:  "+datos[0]);
            tv2.setText(tv2.getText() + "Password:  "+datos[1]);
            tv3.setText(tv3.getText() + "Email:  "+datos[2]);
            tv4.setText(tv4.getText() + "Gender:  "+datos[3]);


        }
    }
}
