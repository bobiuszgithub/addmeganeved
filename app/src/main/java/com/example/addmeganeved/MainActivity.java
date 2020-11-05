package com.example.addmeganeved;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnKuldes;
    private EditText edittNev;
    SharedPreferences sharedPref;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btnKuldes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nev = edittNev.getText().toString();
                editor.putString("neved", nev);
                editor.commit();;
                Intent masikActivityre = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(masikActivityre);
                finish();
            }
        });
    }


    private void init() {
        btnKuldes = findViewById(R.id.btn_kuldes);
        edittNev = findViewById(R.id.edittext);
        sharedPref = getSharedPreferences("adatok", Context.MODE_PRIVATE);
        editor = sharedPref.edit();
    }

}