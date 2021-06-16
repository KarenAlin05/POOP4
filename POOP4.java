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
public class POOP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punto punto1 = new Punto();
        punto1.imprimePunto();
        punto1.x = 7;
        punto1.y = 2;
        punto1.imprimePunto();
        Punto punto2 = new Punto(9, 5);
        punto2.imprimePunto();
    ////////////////////////////////////////////
        
        Perro perro1 = new Perro("dalmata");
        perro1.ladrar();
        
        
        Perro perro2 = new Perro("Ramiro", "Salchicha");
        perro2.dormir();
     
    ////////////////////////////////////////////
                
        Alumno miAlumno = new Alumno("Paquita",317096604,20,(float)8.99,6);
        System.out.println(miAlumno);
        miAlumno.estudiar();
        miAlumno.leer("Harry Poter");
        miAlumno.aprobar("POO");
        
        ////////////////////////////////////////////
        System.out.println("\n\n////////////////////////////////////////////\n\n");
        
        Coche auto1 = new Coche("Toyota Supra", "Gris", 2020, 132452,4);
        
        auto1.vender();
        auto1.transmision();
        auto1.encender();
        auto1.apagar();
        auto1.pintar();
        
        System.out.println("\n\n////////////////////////////////////////////\n\n");
    }
    
}

