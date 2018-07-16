package com.academiamoviles.appbasededatos;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.academiamoviles.appbasededatos.adapter.ContactosAdapter;

public class ListaContactosActivity extends AppCompatActivity {

    private RecyclerView rvContactos;
    private FloatingActionButton fabAgregar;

    private ContactosAdapter contactosAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_contactos);


        enlazarElementos();
        configurarRecycler();

    }

    private void configurarRecycler() {
        contactosAdapter = new ContactosAdapter();
        rvContactos.setLayoutManager(new LinearLayoutManager(ListaContactosActivity.this));
        rvContactos.setAdapter(contactosAdapter);
    }

    private void enlazarElementos() {
        rvContactos = findViewById(R.id.rvContactos);

        fabAgregar = findViewById(R.id.fabAgregar);
        fabAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

    }

}
