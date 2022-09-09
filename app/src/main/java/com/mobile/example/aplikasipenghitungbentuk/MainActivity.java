package com.mobile.example.aplikasipenghitungbentuk;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button pilihan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pilihan = findViewById(R.id.pilihan);
        Spinner spinnerShape=findViewById(R.id.spinner);

        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this, R.array.Shape , android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerShape.setAdapter(adapter);

        pilihan.setOnClickListener(view ->{
            String selection = spinnerShape.getSelectedItem().toString();
            if (selection.equals("Kubus")){
               Intent intent = new Intent(this,KubusPage.class);
               startActivity(intent);
               finish();
            }

            else if (selection.equals("Kerucut")){
                Intent intent = new Intent(this,KerucutPage.class);
                startActivity(intent);
                finish();
            }

            else if (selection.equals("Tabung")){
                Intent intent = new Intent(this,KerucutPage.class);
                startActivity(intent);
                finish();
            }

            else{
                Toast.makeText(getApplication(), "Mohon Pilih Salah Satu Bentuk" , Toast.LENGTH_LONG).show();
            }
        });
    }
}