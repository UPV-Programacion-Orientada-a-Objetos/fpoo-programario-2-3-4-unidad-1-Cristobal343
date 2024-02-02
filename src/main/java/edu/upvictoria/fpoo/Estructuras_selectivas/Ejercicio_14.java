package edu.upvictoria.fpoo.Estructuras_selectivas;

import edu.upvictoria.fpoo.App;
import edu.upvictoria.fpoo.Estructuras_selectivas.Problemas_Genericos.Rebate;

public class Ejercicio_14 extends App {
    private double credito;
    private int tipo_tarjeta;
    private double limite_credio;

    Rebate rebate = new Rebate();

    public Ejercicio_14(){
        System.out.println("-".repeat(70) + "\n" +
                "-".repeat(20) + "Ejericio_14 BANCO EL PUEBLITO DESCONOCIDO" + "-".repeat(10)
                + "\n" + "-".repeat(70));
        Limite_credito();
        toString();
    }

    public void Limite_credito(){
        this.setCredito(input.ReadDouble("¿Que cantidad de credito solicita solicitar?"));
        this.setTipo_tarjeta(input.ReadInteger("¿Para que tipo de tarjeta desea solicitar?"));
        switch (getTipo_tarjeta()){
            case 1: this.limite_credio = (double)rebate.Comision((float)this.getCredito(),0.30f); break;
            case 2: this.limite_credio = (double)rebate.Comision((float)this.getCredito(),0.35f); break;
            case 3: this.limite_credio = (double)rebate.Comision((float)this.getCredito(), 0.40f); break;
            default: this.limite_credio = (double)rebate.Comision((float)this.getLimite_credio(),0.50f); break;
        }
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public int getTipo_tarjeta() {
        return tipo_tarjeta;
    }

    public void setTipo_tarjeta(int tipo_tarjeta) {
        this.tipo_tarjeta = tipo_tarjeta;
    }

    public double getLimite_credio() {
        return limite_credio;
    }

    public void setLimite_credio(double limite_credio) {
        this.limite_credio = limite_credio;
    }

    @Override
    public String toString() {
        return  "Credito = " + credito +
                ", Tipo_tarjeta = " + tipo_tarjeta +
                ", Limite_credio = " + limite_credio;
    }
}

