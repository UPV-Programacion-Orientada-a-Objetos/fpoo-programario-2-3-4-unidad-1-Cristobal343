package edu.upvictoria.fpoo.Estructuras_selectivas;

import edu.upvictoria.fpoo.App;
import edu.upvictoria.fpoo.Estructuras_selectivas.Problemas_Genericos.Min_Max_Value;

public class Ejercicio_10 extends App {
    public int numero_de_personas = 0;
    public String tipo_de_autobus = null;

    public float num_de_kilometros =  0f;
    public Ejercicio_10(){
        System.out.println("-".repeat(70) + "\n" +
                "-".repeat(20) + "Ejericio_10 Autobuses" + "-".repeat(10)
                + "\n" + "-".repeat(70));
        this.numero_de_personas = input.ReadInteger("Ingrese el numero de pasajeros");
        this.tipo_de_autobus = input.ReadLine("Ingresa el tipo de autobus [a, b, c]");
        this.num_de_kilometros = input.ReadFloat("Ingrese el numero de kilomtros recorridos: ");
        System.out.println("El consto total por persona es de: " + costo_total());
    }

    public float costo_total(){
        float precio_categoria = 0f;
        float costo_total = 0f;
        if(this.numero_de_personas >= 20) {
            if (this.tipo_de_autobus == "") {
                precio_categoria = 2.0f;
            } else if (this.tipo_de_autobus == "") {
                precio_categoria = 2.5f;
            } else {
                precio_categoria = 3.0f;
            }
            costo_total = (precio_categoria * this.num_de_kilometros)/this.numero_de_personas;
        } else {costo_total = precio_categoria * this.num_de_kilometros * this.numero_de_personas;}
        return costo_total;
    }

}
