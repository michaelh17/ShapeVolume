package com.mobile.example.aplikasipenghitungbentuk;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button pilihan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinnerLanguages=findViewById(R.id.spinner);

        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this, R.array.spinner , android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerLanguages.setAdapter(adapter);

        String selection = spinnerLanguages.getSelectedItem().toString();
        pilihan = findViewById(R.id.pilihan);
        pilihan.setOnClickListener(view ->{

            if (selection.equals("Kubus")){
                Intent intent = new Intent(this,KubusPage.class);
                startActivity(intent);
                finish();
            }

            else{

            }
        });
    }
}