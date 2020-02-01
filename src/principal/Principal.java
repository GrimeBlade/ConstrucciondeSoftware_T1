/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import paquete_persona.Estudiante;
import paquete_persona.Persona;
import paquete_persona.Profesor;

/**
 *
 * @author Diego
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estudiante estudiante = new Estudiante("Cristian", "Yesid", "perea", "padilla", 19, 1192779666, 4, 7655356, "Ing Sistemas");
        
        //Aplicando Polimorfismo
        String facultad[]={"ingenieria"};
        String materias_nix[] ={"Construccion de software", "ingenieria de software"};
        
        Persona persona1;
        persona1 = new Profesor(materias_nix, 12353, facultad, "Nixon","Alonso", "Duarte", "Acosta", 42, 1132412);
 
        
        System.out.println("Hola: "+estudiante.getPrimerNombre());
        estudiante.Mostrar();
        
    }
    
}
