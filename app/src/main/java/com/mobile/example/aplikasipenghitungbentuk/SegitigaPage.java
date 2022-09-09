package com.mobile.example.aplikasipenghitungbentuk;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SegitigaPage extends AppCompatActivity {
    EditText  alas,tinggi,result;
    Button  processButton,resetButton, backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga_page);

        alas = findViewById(R.id.alas);
        tinggi = findViewById(R.id.tinggi);
        processButton = findViewById(R.id.processButton);
        result = findViewById(R.id.result);
        resetButton = findViewById(R.id.resetButton);
        backButton = findViewById(R.id.backButton);

        result.setEnabled(false);


        processButton.setOnClickListener(view-> {
            if (alas.length() == 0 && tinggi.length() == 0){
                Toast.makeText(getApplication(), "Alas & Tinggi Belum Diisi!!" , Toast.LENGTH_LONG).show();
            }

            if (alas.length() == 0){
                Toast.makeText(getApplication(), "Alas Belum Diisi!!" , Toast.LENGTH_LONG).show();
            }

            if (tinggi.length() == 0){
                Toast.makeText(getApplication(), "Tinggi Belum Diisi!!" , Toast.LENGTH_LONG).show();
            }

            else{
                String alas1 = alas.getText().toString();
                String tinggi1 = tinggi.getText().toString();
                Integer alasSegitiga = Integer.parseInt(alas1);
                Integer tinggiSegitiga = Integer.parseInt(tinggi1);
                Integer hasil = VolumeSegitiga(alasSegitiga,tinggiSegitiga);
                result.setText(String.valueOf(hasil));
            }
        });


        resetButton.setOnClickListener(view-> {
            alas.getText().clear();
            tinggi.getText().clear();
            result.getText().clear();
        });

        backButton.setOnClickListener(view-> {
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
            finish();
        });

    }
    private Integer VolumeSegitiga(Integer a , Integer t){
        return 1/2 * a * t;


    }
    }
}