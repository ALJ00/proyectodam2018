package com.reto2018;

public class Administradores {

    private String nombre;
    private String usuario;
    private String password;

    public Administradores(String nombre, String usuario, String password) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.password = password;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
