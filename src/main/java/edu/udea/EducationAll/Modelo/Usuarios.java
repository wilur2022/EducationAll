package edu.udea.EducationAll.Modelo;

public class Usuarios {
    //Atributos
    private String usuario;
    private String password;

    //Constructor
    public Usuarios(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }
    //Creamos un constructor sin parametros
    public Usuarios() {
    }


    //Getters and setters

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
