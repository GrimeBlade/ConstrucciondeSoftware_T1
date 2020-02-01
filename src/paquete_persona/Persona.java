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
public class Persona {
    protected String primerNombre;
    protected String SegundoNombre;
    protected String apellidoMaterno;
    protected String apellidoPaterno;
    protected int Edad;
    protected int idCiudadania; 

    public Persona(String primerNombre, String SegundoNombre, String apellidoMaterno, String apellidoPaterno, int Edad, int idCiudadania) {
        this.primerNombre = primerNombre;
        this.SegundoNombre = SegundoNombre;
        this.apellidoMaterno = apellidoMaterno;
        this.apellidoPaterno = apellidoPaterno;
        this.Edad = Edad;
        this.idCiudadania = idCiudadania;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getSegundoNombre() {
        return SegundoNombre;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public int getEdad() {
        return Edad;
    }

    public int getIdCiudadania() {
        return idCiudadania;
    }
    
    
   
}
