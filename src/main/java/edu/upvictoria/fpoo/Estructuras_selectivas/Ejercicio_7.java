package edu.upvictoria.fpoo.Estructuras_selectivas;

import edu.upvictoria.fpoo.App;

public class Ejercicio_7 extends App {

    private String tipo = null;
    private int tamaNo = 0;
    private float precio = 0f;
    private float kg = 0f;
    public Ejercicio_7(){
        System.out.println("-".repeat(70) + "\n" +
                "-".repeat(20) + "Ejericio_7 Embarcadero de uvas" + "-".repeat(10)
                + "\n" + "-".repeat(70));
        System.out.println("El Precio de " + this.kg + "kg " + " es de $" + (float) this.kg * this.precio);
    }

    public void Grappes_Price(){
        this.tipo = input.ReadLine("Ingrese el tipo de uva [A o B]: ");
        this.tamaNo = input.ReadInteger("Ingrese el tamaño 1 o 2: ");
        this.kg = input.ReadFloat("Ingrese la cantidad de kilos que desea: ");
        if ((this.tipo == "A" && this.tamaNo == 1) || (this.tipo == "B" && this.tamaNo == 1)) { precio = 30;}
        else if (this.tipo == "A" && this.tamaNo == 2) {precio = 20;}
        else { precio = 50;}
    }
}
