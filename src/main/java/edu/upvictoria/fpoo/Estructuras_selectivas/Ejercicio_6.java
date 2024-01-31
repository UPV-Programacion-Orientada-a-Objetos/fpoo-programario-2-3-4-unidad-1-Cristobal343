package edu.upvictoria.fpoo.Estructuras_selectivas;

import edu.upvictoria.fpoo.App;

public class Ejercicio_6 extends App {
    public Ejercicio_6(){
        System.out.println("-".repeat(70) + "\n" +
                "-".repeat(20) + "Ejericio_6 LA LANGOSTA HAUMADA" + "-".repeat(10)
                + "\n" + "-".repeat(70));
    Presupuesto();
    }

    public void Presupuesto() {
        int num_clientes = input.ReadInteger("Ingresa el numero de clientes: ");
        float precio = 0f;
        if (num_clientes > 300) {
            precio = 75.00f;
        } else if (num_clientes > 200 && num_clientes < 300) {
            precio = 85.00f;
        } else {
            precio = 95.00f;
        }
        System.out.println("El precio total por " + num_clientes + " clientes es " + num_clientes * precio);
    }
}
