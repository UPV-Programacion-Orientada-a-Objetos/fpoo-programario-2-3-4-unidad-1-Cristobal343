package edu.upvictoria.fpoo.Estructuras_selectivas;

import edu.upvictoria.fpoo.App;

public class Ejercicio_15 extends App {
    private int edad;

    public Ejercicio_15(){
        System.out.println("-".repeat(70) + "\n" +
                "-".repeat(20) + "Ejericio_15 Edad de votante" + "-".repeat(10)
                + "\n" + "-".repeat(70));
                setEdad(input.ReadInteger("Ingrese la edad de la persona"));
                toString();
    }

    public String can_vote(){
        String message;
        if (this.getEdad() >= 18){
            message = "si";
        } else {message = "no";}
        return message;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString(){
        return "La persona " + this.edad + " puede votar";
    }

}
