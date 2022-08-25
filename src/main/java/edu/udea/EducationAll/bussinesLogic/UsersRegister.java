package edu.udea.EducationAll.bussinesLogic;

import edu.udea.EducationAll.Modelo.Usuarios;

import java.util.ArrayList;

public class UsersRegister {
    private ArrayList<Usuarios> UsuariosXXX;

    public ArrayList<Usuarios> GestorUsuario (){
        this.UsuariosXXX = new ArrayList<>();
        Usuarios UsuarioX1X = new Usuarios("Wilson Javier Urbano Vargas","Wilur1231");
        Usuarios UsuarioX2X = new Usuarios("Yineth Maricela Benavides Ceron","Wilur1232");
        Usuarios UsuarioX3X = new Usuarios("Hamilton Andres Urbano","Wilur1233");
        Usuarios UsuarioX4X = new Usuarios("Manuel Alejandro Urbano","Wilur1234");
        Usuarios UsuarioX5X = new Usuarios("Leidy Marcela Urbano","Wilur1235");
        this.UsuariosXXX.add(UsuarioX1X);
        this.UsuariosXXX.add(UsuarioX2X);
        this.UsuariosXXX.add(UsuarioX3X);
        this.UsuariosXXX.add(UsuarioX4X);
        this.UsuariosXXX.add(UsuarioX5X);
        setUsuariosXXX(UsuariosXXX);
        return getUsuariosXXX();
    }
    public Usuarios getOnlyUsuario(String password) throws Exception {
        this.UsuariosXXX=GestorUsuario();
        for (Usuarios UserX: this.UsuariosXXX){
            if(UserX.getPassword().equals(password)){
                return UserX;
            }
        }
        throw new Exception("Usuario NO Existente");
    }



    //Getters and Setters de UsuariosXXX
    public ArrayList<Usuarios> getUsuariosXXX() {
        return UsuariosXXX;
    }

    public void setUsuariosXXX(ArrayList<Usuarios> usuariosXXX) {
        UsuariosXXX = usuariosXXX;
    }
}
