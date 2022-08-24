package edu.udea.EducationAll.bussinesLogic;

import edu.udea.EducationAll.Modelo.Usuarios;

import java.util.ArrayList;

public class UsersRegister {
    private ArrayList<Usuarios> UsuariosXXX;

    public ArrayList<Usuarios> GestorUsuario (){
        this.UsuariosXXX = new ArrayList<>();
        Usuarios UsuarioX1X = new Usuarios("Wilur2011","Wilur1231");
        Usuarios UsuarioX2X = new Usuarios("Wilur2012","Wilur1232");
        Usuarios UsuarioX3X = new Usuarios("Wilur2013","Wilur1233");
        this.UsuariosXXX.add(UsuarioX1X);
        this.UsuariosXXX.add(UsuarioX2X);
        this.UsuariosXXX.add(UsuarioX3X);
        setUsuariosXXX(UsuariosXXX);
        return getUsuariosXXX();
    }

    public ArrayList<Usuarios> getUsuariosXXX() {
        return UsuariosXXX;
    }

    public void setUsuariosXXX(ArrayList<Usuarios> usuariosXXX) {
        UsuariosXXX = usuariosXXX;
    }
}
