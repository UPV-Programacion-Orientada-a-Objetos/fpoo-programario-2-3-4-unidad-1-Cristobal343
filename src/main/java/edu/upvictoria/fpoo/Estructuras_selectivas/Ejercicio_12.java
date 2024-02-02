package edu.upvictoria.fpoo.Estructuras_selectivas;

import edu.upvictoria.fpoo.App;

public class Ejercicio_12 extends App {
    private int num_cit; // numero de citas
    private float consto_cita; // costo de la cita

    private float consto_total; // consto total de todas la citas
    public Ejercicio_12(){
        System.out.println("-".repeat(70) + "\n" +
                "-".repeat(20) + "Ejericio_12 Sistema de atencion de citas" + "-".repeat(10)
                + "\n" + "-".repeat(70));
        this.num_cit = input.ReadInteger("Ingrese el numero de la cita: ");
        System.out.println("El costo de la cita " + this.num_cit + " es " + this.consto_cita + " y el total por todas es: "
        + this.consto_total);
    }

    public void Costo_total(){
        switch (this.num_cit){
            case 1: this.consto_cita = 200.00f;
                    this.consto_total = this.consto_cita;
            break;
            case 2: this.consto_cita = 150.00f;
                    this.consto_total = 200.00f + this.consto_cita;
            break;
            case 3: this.consto_cita = 100.00f;
                    this.consto_total = 350.00f + this.consto_cita;
            default: this.consto_cita = 50.0f;
                     this.consto_total = 450.00f + this.consto_cita;
            break;
        }
    }
}
