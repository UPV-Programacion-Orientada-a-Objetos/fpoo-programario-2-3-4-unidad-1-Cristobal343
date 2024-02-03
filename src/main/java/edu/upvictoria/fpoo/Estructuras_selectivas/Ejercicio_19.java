package edu.upvictoria.fpoo.Estructuras_selectivas;

import edu.upvictoria.fpoo.App;
import edu.upvictoria.fpoo.Estructuras_selectivas.Problemas_Genericos.Rebate;
public class Ejercicio_19 extends Generico_Default{
    private float costo;
    private float descuento;
    public Ejercicio_19(){
        System.out.println("-".repeat(70) + "\n" +
                "-".repeat(20) + "Ejericio_17 Calcular Descuento" + "-".repeat(10)
                + "\n" + "-".repeat(70));
        this.setCosto(input.ReadFloat("Ingrese el costo del producto "));
    }

    public void Aplicar_Descuento(){
        if (this.getCosto() >= 200f){
            this.setDescuento(rebate.Rebate_sell(this.getCosto(),0.15f));
        } else if (this.getCosto() > 100f || this.costo <= 200){
            this.setDescuento(rebate.Rebate_sell(this.costo, 0.12f));
        } else {this.setDescuento(rebate.Rebate_sell(this.costo, 0.10f));}
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

}
