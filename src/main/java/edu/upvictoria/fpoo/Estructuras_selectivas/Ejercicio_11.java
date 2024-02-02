package edu.upvictoria.fpoo.Estructuras_selectivas;

import edu.upvictoria.fpoo.App;
import edu.upvictoria.fpoo.Estructuras_selectivas.Problemas_Genericos.Rebate;

public class Ejercicio_11 extends App {

    private String tipo_hamb = null;
    private int num_hamb = 0;
    public Ejercicio_11(){
        System.out.println("-".repeat(70) + "\n" +
                "-".repeat(20) + "Ejericio_11 EL NAUFRAGO SADISFECHO" + "-".repeat(10)
                + "\n" + "-".repeat(70));
        this.tipo_hamb = input.ReadLine("Ingrese le tipo de hamburgesa SENSILLA, DOBLE O TRIPLE: ");
        System.out.println("La comision por " + this.num_hamb + " hamburgesa " + this.tipo_hamb + " es " + Comision());
    }

    public float Comision(){
        float value;
        float price = 0f;
        Rebate com = new Rebate();
        if (this.tipo_hamb.toLowerCase() == "sensilla") {
            price = this.num_hamb *  20.00f;
            value = com.Comision(price, 0.5f);
        } else if (this.tipo_hamb.toLowerCase() == "doble"){
            price = this.num_hamb * 25.00f;
            value = com.Comision(price, 0.5f);
        } else {
            price = this.num_hamb * 28.00f;
            value = com.Comision(price, 0.5f);
        }
        return value;
    }

}
