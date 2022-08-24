package edu.udea.EducationAll.controllers;

import edu.udea.EducationAll.Modelo.Usuarios;
import edu.udea.EducationAll.bussinesLogic.UsersRegister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
//Creamos controlador UsuarioRegistrado
@RestController
public class UsuarioControllers {
    @RequestMapping(value = "UsuarioRegistrado")
    public ArrayList<String> UsuarioRegister() {
        ArrayList<String> NamesFamily = new ArrayList<>();
        NamesFamily.add("Wilson Urbano");
        NamesFamily.add("Yineth Benavides");
        NamesFamily.add("Hamilton, Manuel y Marcela");
        return NamesFamily;
    }
    //Creamos el controlador de la URL UsersRegister
    private UsersRegister gestorUsuarioXXX = new UsersRegister();
    @GetMapping("/UsersRegister")
    public ResponseEntity<ArrayList<Usuarios>> getUsuariosXXX(){
        return new ResponseEntity<>(gestorUsuarioXXX.GestorUsuario(), HttpStatus.ACCEPTED);
    }


}






