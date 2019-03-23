package com.example.tarealaboratorio03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.tarealaboratorio03.utils.AppConstant;

public class Main2Activity extends AppCompatActivity {


    private TextView texto1,texto2,texto3,texto4;
    private Button btn_share;
    private String datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent mIntent = getIntent();
        texto1 = findViewById(R.id.textview_user);
        texto2 = findViewById(R.id.textview_pass);
        texto3 = findViewById(R.id.textview_email);
        texto4 = findViewById(R.id.textview_genero);
        btn_share = findViewById(R.id.btn_share);
        Bundle bolsaR = getIntent().getExtras();

        if (mIntent != null){
            texto1.setText("User:  "+bolsaR.getString(AppConstant.TEXT_KEY));
            texto2.setText("Password:  "+bolsaR.getString(AppConstant.TEXT_KEY2));
            texto3.setText("Email:  "+bolsaR.getString(AppConstant.TEXT_KEY3));
            texto4.setText("Gender:  "+bolsaR.getString(AppConstant.TEXT_KEY4));
        }

        Intent mIntento = getIntent();
        Bundle extras = mIntento.getExtras();
        datos = extras.getString(AppConstant.TEXT_KEY) + "," + extras.getString(AppConstant.TEXT_KEY2) + "," + extras.getString(AppConstant.TEXT_KEY3) + "," + extras.getString(AppConstant.TEXT_KEY4);

        btn_share.setOnClickListener(v->{
            Intent mIntent2 = new Intent();
            mIntent2.putExtra(Intent.EXTRA_TEXT, datos);
            mIntent2.setType("text/plain");
            mIntent2.setAction(Intent.ACTION_SEND);

            startActivity(mIntent2);
        });
    }
}
