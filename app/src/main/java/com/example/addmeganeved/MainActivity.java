package com.example.addmeganeved;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnKuldes;
    private EditText edittNEv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btnKuldes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent masikActivityre = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(masikActivityre);
            }
        });
    }


    private void init() {
        btnKuldes = findViewById(R.id.btn_kuldes);
        edittNEv = findViewById(R.id.edittext);


    }

}