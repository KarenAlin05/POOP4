/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop4;

/**
 *
 * @author nikte
 */
public class Perro {
    String nombre;
    String raza;
    String color = "Cafe";

    public Perro() {
    }

    public Perro(String raza) {
        this.raza = raza;
    }

    public Perro(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
        
        System.out.println("Hola soy "+nombre+" de la raza "+raza+".");
    }
        
    
    public void comer(){
        System.out.println("Soy "+nombre+" y voy a comer");
    }

    public void dormir(){
        System.out.println("Soy "+nombre+" y tengo sueño");
    }
    
    public void ladrar(){
        System.out.println("Gua gua!");
    }
}


