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
public class Coche {
    String marca;
    String color;
    int modelo;
    int placas;
    int numeropuertas;
    public Coche(String marca, String color, int modelo, int placas, int numeropuertas) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.placas = placas;
        this.numeropuertas = numeropuertas;
    } 
    public void vender(){
        System.out.println("Voy a vender un auto "+marca+" modelo "+modelo+", tiene "+numeropuertas+ " puertas y sus placas son: "+placas+".");
    }
    public void apagar(){
        System.out.println("Se apaga retirando la llave o presionando el botón apagar ");
    }
    public void pintar(){
        System.out.println("Mi coche lo pintare de "+color+" con esto lo vendere a un mejor precio.");
    }
    public void encender(){
        System.out.println("Para encender el Toyota Supra solo necesito poner las llave");
    }
    public void transmision(){
        System.out.println("Un Toyota Supra tiene una transmisión automática de 8 velocidades ");
    }
}

    

