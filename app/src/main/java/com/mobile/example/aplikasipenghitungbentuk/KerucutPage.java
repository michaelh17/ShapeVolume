package com.mobile.example.aplikasipenghitungbentuk;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class KerucutPage extends AppCompatActivity {
    EditText  jarijari,tinggi,result;
    Button  processButton,resetButton, backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga_page);

        jarijari = findViewById(R.id.jarijari);
        tinggi = findViewById(R.id.tinggi);
        processButton = findViewById(R.id.processButton);
        result = findViewById(R.id.result);
        resetButton = findViewById(R.id.resetButton);
        backButton = findViewById(R.id.backButton);

        result.setEnabled(false);


        processButton.setOnClickListener(view-> {
            if (jarijari.length() == 0 && tinggi.length() == 0){
                Toast.makeText(getApplication(), "Jari Jari & Tinggi Belum Diisi!!" , Toast.LENGTH_LONG).show();
            }

            if (jarijari.length() == 0){
                Toast.makeText(getApplication(), "Jari Jari Belum Diisi!!" , Toast.LENGTH_LONG).show();
            }

            if (tinggi.length() == 0){
                Toast.makeText(getApplication(), "Tinggi Belum Diisi!!" , Toast.LENGTH_LONG).show();
            }

            else{
                String jarijari1 = jarijari.getText().toString();
                String tinggi1 = tinggi.getText().toString();
                Double jariKerucut = Double.parseDouble(jarijari1);
                Double tinggiKerucut = Double.parseDouble(tinggi1);
                Double hasil = VolumeKerucut(jariKerucut,tinggiKerucut);
                result.setText(String.valueOf(hasil));
            }
        });


        resetButton.setOnClickListener(view-> {
            jarijari.getText().clear();
            tinggi.getText().clear();
            result.getText().clear();
        });

        backButton.setOnClickListener(view-> {
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
            finish();
        });

    }
    private Double VolumeKerucut(Double r , Double t){
        return 0.333 * 3.14 * r * r * t;
    }
    }
