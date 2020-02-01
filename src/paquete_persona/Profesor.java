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
    private String Materias[] = new String[5];
    private int codProfesor;
    private String Facultad[] = new String[2];
    

    public Profesor( String Materias[], int codProfesor, String Facultad[], String primerNombre, String SegundoNombre, String apellidoMaterno, String apellidoPaterno, int Edad, int idCiudadania) {
        super(primerNombre, SegundoNombre, apellidoMaterno, apellidoPaterno, Edad, idCiudadania);
        this.Materias = Materias;
        this.codProfesor = this.codProfesor;
        this.Facultad = Facultad;
    }

}
