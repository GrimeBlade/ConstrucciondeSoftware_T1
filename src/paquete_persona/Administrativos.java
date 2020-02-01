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
public class Administrativos extends Persona {
    
    private int codAdmin;
    private String Area;
    private boolean Permisos; 
    
    public Administrativos(int codAdmin, String Area, boolean Permisos, String primerNombre, String SegundoNombre, String apellidoMaterno, String apellidoPaterno, int Edad, int idCiudadania) {
        super(primerNombre, SegundoNombre, apellidoMaterno, apellidoPaterno, Edad, idCiudadania);
        this.codAdmin = codAdmin;
        this.Area = Area;
        this.Permisos = Permisos;
    }
    
}
