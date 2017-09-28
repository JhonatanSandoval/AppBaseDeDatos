package com.academiamoviles.appbasededatos.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.academiamoviles.appbasededatos.R;
import com.academiamoviles.appbasededatos.model.ContactoModel;

import java.util.ArrayList;
import java.util.List;

public class ContactosAdapter extends RecyclerView.Adapter<ContactosAdapter.ContactoHolder> {

    private List<ContactoModel> listaContactos = new ArrayList<>();

    @Override
    public ContactoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ContactoHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contacto, parent, false));
    }

    @Override
    public void onBindViewHolder(ContactoHolder holder, int position) {
        final ContactoModel itemLista = listaContactos.get(position);

        holder.tvNombres.setText(itemLista.getNombre());
        holder.tvTelefono.setText(itemLista.getTelefono());

        holder.ivEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        holder.ivBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return listaContactos.size();
    }

    class ContactoHolder extends RecyclerView.ViewHolder {

        TextView tvNombres, tvTelefono;
        ImageView ivEditar, ivBorrar;

        public ContactoHolder(View itemView) {
            super(itemView);

            tvNombres = itemView.findViewById(R.id.tvNombres);
            tvTelefono = itemView.findViewById(R.id.tvTelefono);

            ivEditar = itemView.findViewById(R.id.ivEditar);
            ivBorrar = itemView.findViewById(R.id.ivBorrar);

        }

    }

}
