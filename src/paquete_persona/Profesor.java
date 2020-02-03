/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_persona;

/**
 *
 * @author Asus
 */
public class Profesor extends Persona{
    private String Materias[];
    private int codProfesor;
    private String Facultad[];
    

    public Profesor( String Materias[], int codProfesor, String Facultad[], String primerNombre, String SegundoNombre, String apellidoMaterno, String apellidoPaterno, int Edad, int idCiudadania) {
        super(primerNombre, SegundoNombre, apellidoMaterno, apellidoPaterno, Edad, idCiudadania);
        this.Materias = Materias;
        this.codProfesor = this.codProfesor;
        this.Facultad = Facultad;
    }

    public String[] getMaterias() {
        return Materias;
    }

    public void setMaterias(String[] Materias) {
        this.Materias = Materias;
    }

    public int getCodProfesor() {
        return codProfesor;
    }

    public void setCodProfesor(int codProfesor) {
        this.codProfesor = codProfesor;
    }

    public String[] getFacultad() {
        return Facultad;
    }

    public void setFacultad(String[] Facultad) {
        this.Facultad = Facultad;
    }

}
