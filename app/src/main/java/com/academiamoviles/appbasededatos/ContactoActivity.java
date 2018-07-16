package com.academiamoviles.appbasededatos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ContactoActivity extends AppCompatActivity {

    private EditText etNombres, etTelefono;
    private Button btnGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        enlazarElementos();

    }

    private void validarContacto() {
        String nombres = etNombres.getText().toString().trim();
        String telefono = etTelefono.getText().toString().trim();

        if (!nombres.isEmpty() && !telefono.isEmpty()) {
            // guardar en base de datos

        }
    }

    private void enlazarElementos() {
        etNombres = findViewById(R.id.etNombres);
        etTelefono = findViewById(R.id.etTelefono);
        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validarContacto();
            }
        });
    }
}
