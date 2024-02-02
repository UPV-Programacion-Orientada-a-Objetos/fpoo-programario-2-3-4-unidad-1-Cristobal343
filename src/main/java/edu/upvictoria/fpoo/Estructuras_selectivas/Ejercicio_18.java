package edu.upvictoria.fpoo.Estructuras_selectivas;

import edu.upvictoria.fpoo.App;

public class Ejercicio_18 extends App {
    private String nombre;
    private int edad;
    private boolean esMayor;

    public Ejercicio_18(){
        System.out.println("-".repeat(70) + "\n" +
                "-".repeat(20) + "Ejericio_18 Nombre & Edad" + "-".repeat(10)
                + "\n" + "-".repeat(70));
        this.setNombre(input.ReadLine("Ingrese su nombre: "));
        this.setEdad(input.ReadInteger(0"Ingrese su Edad: "));
        this.toString();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEsMayor() {
        return esMayor;
    }

    public void setEsMayor(int edad) {
        if(edad >= 18)
            this.esMayor = true;
        else {this.esMayor = false;}
    }

    @Override
    public String toString(){
        return "Nombre" +  this.getNombre() +
                "Edad " + this.getEdad() +
                "¿Es mayor de edad? " + this.isEsMayor();
    }

}
