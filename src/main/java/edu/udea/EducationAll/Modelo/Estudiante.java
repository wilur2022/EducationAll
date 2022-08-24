package edu.udea.EducationAll.Modelo;

public class Estudiante extends Usuarios {
    //Atributos
    private String idStudent ;
    private String nameStudent;
    private String mailStudent;

    //Constructor con todos los atributos

    public Estudiante(String usuario, String password, String idStudent, String nameStudent, String mailStudent) {
        super(usuario, password);
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.mailStudent = mailStudent;
    }


    //Constructor sin atributos

    public Estudiante(String usuario, String password) {
        super(usuario, password);
    }


    //Setters and Getters

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getMailStudent() {
        return mailStudent;
    }

    public void setMailStudent(String mailStudent) {
        this.mailStudent = mailStudent;
    }
}
