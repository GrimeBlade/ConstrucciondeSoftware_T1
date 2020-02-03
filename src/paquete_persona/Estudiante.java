/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_persona;

/**
 *
 * @author GrimeBlade
 */
public class Estudiante extends Persona {
  
    private int numMaterias;
    private int codEstudiante;
    private String Carrera;
    
    public Estudiante (String primerNombre, String SegundoNombre, String apellidoMaterno, String apellidoPaterno, int Edad, int idCiudadania, int numMaterias, int codEstudiante, String carrera){
        super(primerNombre,SegundoNombre,apellidoMaterno,apellidoPaterno,Edad,idCiudadania);
        this.numMaterias = numMaterias;
        this.codEstudiante = codEstudiante;
        this.Carrera = Carrera;
    }
    
    public void Mostrar(){
        System.out.println("Hola "+primerNombre);;
                
    } 
    
}
