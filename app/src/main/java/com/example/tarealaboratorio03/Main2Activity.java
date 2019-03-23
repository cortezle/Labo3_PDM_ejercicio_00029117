package com.example.tarealaboratorio03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.tarealaboratorio03.utils.AppConstant;

public class Main2Activity extends AppCompatActivity {


    private TextView texto1,texto2,texto3,texto4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent mIntent = getIntent();
        texto1 = findViewById(R.id.textview_user);
        texto2 = findViewById(R.id.textview_pass);
        texto3 = findViewById(R.id.textview_email);
        texto4 = findViewById(R.id.textview_genero);
        Bundle bolsaR = getIntent().getExtras();

        if (mIntent != null){
            texto1.setText(bolsaR.getString(AppConstant.TEXT_KEY));
            texto2.setText(bolsaR.getString(AppConstant.TEXT_KEY2));
            texto3.setText(bolsaR.getString(AppConstant.TEXT_KEY3));
            texto4.setText(bolsaR.getString(AppConstant.TEXT_KEY4));
        }
    }
}
