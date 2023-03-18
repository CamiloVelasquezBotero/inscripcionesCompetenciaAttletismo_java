
package Ventanas;

import java.io.Serializable;

public class Attleta implements Serializable{
    private String nombre;
    private int edad;
    private double peso;
    private int estatura;

    public Attleta(String nombre, int edad, double peso, int estatura) {    //Constructor
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }

    public String getNombre() {     //Getters
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public double getPeso() {
        return peso;
    }
    public int getEstatura() {
        return estatura;
    }
    
    
}
