package com.example.tarealaboratorio03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import com.example.tarealaboratorio03.utils.AppConstant;

public class MainActivity extends AppCompatActivity {

    private EditText txt1,txt2,txt3,txt4;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = findViewById(R.id.user_text);
        txt2 = findViewById(R.id.pass_text);
        txt3 = findViewById(R.id.email_text);
        txt4 = findViewById(R.id.gen_text);
        btn = findViewById(R.id.btn_send);

        btn.setOnClickListener(v->{
            String texto = txt1.getText().toString();
            String texto2 = txt2.getText().toString();
            String texto3 = txt3.getText().toString();
            String texto4 = txt4.getText().toString();
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);


            Bundle bolsa = new Bundle();
            bolsa.putString(AppConstant.TEXT_KEY,texto);
            bolsa.putString(AppConstant.TEXT_KEY2,texto2);
            bolsa.putString(AppConstant.TEXT_KEY3,texto3);
            bolsa.putString(AppConstant.TEXT_KEY4,texto4);
            intent.putExtras(bolsa);
            startActivity(intent);

        });
    }
}
