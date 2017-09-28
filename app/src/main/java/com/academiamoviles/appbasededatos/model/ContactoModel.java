package com.academiamoviles.appbasededatos.model;

public class ContactoModel {

    private String _id, nombre, telefono;

    public ContactoModel() {
    }

    public ContactoModel(String _id, String nombre, String telefono) {
        this._id = _id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


}
