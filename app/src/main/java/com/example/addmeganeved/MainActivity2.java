package com.example.addmeganeved;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private Button btnVissza;
    private TextView textNev;
    SharedPreferences sharedPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();


        btnVissza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Vissza = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(Vissza);
                finish();
            }
        });
        String nev = sharedPref.getString("neved", "");
        textNev.setText("Üdvözöllek" + nev);
    }


    private void init() {
        btnVissza = findViewById(R.id.btn_vissza);
        textNev = findViewById(R.id.edittext);
        sharedPref = getSharedPreferences("adatok", Context.MODE_PRIVATE);

    }


}