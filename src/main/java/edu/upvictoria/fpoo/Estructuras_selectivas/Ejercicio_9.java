package edu.upvictoria.fpoo.Estructuras_selectivas;

import edu.upvictoria.fpoo.App;

public class Ejercicio_9 extends App {

    private int minuto = 0; // minutos de llamda
    private float tarifa = 0f; // tarifa
    public Ejercicio_9() {
        System.out.println("-".repeat(70) + "\n" +
                "-".repeat(20) + "Ejericio_9 Descuento de transporte" + "-".repeat(15)
                + "\n" + "-".repeat(70));
        this.minuto = input.ReadInteger("Ingresa los minutos de duracion de la llamda ");
        Tarifa();
        System.out.println("La tarifa por "  + this.minuto + " de llamdad es igual a " + this.tarifa);

    }
    public void Tarifa(){
        if(this.minuto > 10) {
            this.tarifa = 1.00f + 0.80f + 0.70f + (this.minuto - 10) * 0.50f;
        } else if (this.minuto > 7 || this.minuto <= 10){
            this.tarifa = 1.00f + 0.80f + 0.70f;
        } else if (this.minuto >= 5 || this.minuto <= 7){
            this.tarifa = 1.00f + 0.80f;
        } else { this.tarifa += 1.00f; }
    }
}
