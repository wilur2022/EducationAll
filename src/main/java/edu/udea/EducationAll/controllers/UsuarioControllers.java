package edu.udea.EducationAll.controllers;

import edu.udea.EducationAll.Modelo.Usuarios;
import edu.udea.EducationAll.bussinesLogic.UsersRegister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    //Creamos una consulta por medio de una URL usando un QUERY PARAMS
    //En internet debe escribirse localhost:8080/OnlyUser?id=1001
    @GetMapping("/OnlyUser")
    public ResponseEntity<String> getUsuarioXXX(@RequestParam String id){
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

    //Creamos una consulta por medio de un PATH PARAMS
    //En internet debe escribirse localhost:8080/1001/edit. ESE edit ES OPCIONAL
    @GetMapping("/OnlyUser/{password}/edit")
    public ResponseEntity<Object> getUsuarioXXXPath(@PathVariable String password){
        try {
            Usuarios UserX = gestorUsuarioXXX.getOnlyUsuario(password);
            return new ResponseEntity<>(UserX, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}






