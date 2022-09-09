package com.mobile.example.aplikasipenghitungbentuk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class KubusPage extends AppCompatActivity {
    EditText  sisi,result;
    Button  processButton,resetButton, backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus_page);
        sisi = findViewById(R.id.sisi);
        processButton = findViewById(R.id.processButton);
        result = findViewById(R.id.result);
        resetButton = findViewById(R.id.resetButton);
        backButton = findViewById(R.id.backButton);

        result.setEnabled(false);


        processButton.setOnClickListener(view-> {
           if (sisi.length() == 0){
               Toast.makeText(getApplication(), "Sisi Belum Diisi!" , Toast.LENGTH_LONG).show();
           }

           else{
               String sisi2 = sisi.getText().toString();
               Integer sisiKubus = Integer.parseInt(sisi2);
               Integer hasil = VolumeKubus(sisiKubus);
               result.setText(String.valueOf(hasil));
           }
        });


        resetButton.setOnClickListener(view-> {
            sisi.getText().clear();
            result.getText().clear();
        });

        backButton.setOnClickListener(view-> {
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
            finish();
        });

        }
    private Integer VolumeKubus(Integer sisi){
        return sisi*sisi*sisi;


    }
}