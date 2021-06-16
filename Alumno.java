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
public class Alumno {
    String nombre;
    int numCuenta;
    int edad;
    float promedio;
    int semActual;

    public Alumno(String nombre, int numCuenta, int edad, float promedio, int semActual) {
        this.nombre = nombre;
        this.numCuenta = numCuenta;
        this.edad = edad;
        this.promedio = promedio;
        this.semActual = semActual;
        
        System.out.println("Bienvenido");
    }
    
    public void estudiar(){
        System.out.println("Estoy estudiando");
    }
    
    public void leer(String libro){
        System.out.println("Estoy leyendo "+libro);
    }
    
    public void aprobar(String asignatura){
        System.out.println("Aprobé "+asignatura+".");
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", numCuenta=" + numCuenta + ", edad=" + edad + ", promedio=" + promedio + ", semActual=" + semActual + '}';
    }
}

    

