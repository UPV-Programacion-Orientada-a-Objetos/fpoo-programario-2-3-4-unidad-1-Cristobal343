package edu.upvictoria.fpoo.Estructuras_selectivas;

public class Ejercicio_20 extends Generico_Default{
    private float precio;
    private float descuento;

    public Ejercicio_20() {
        System.out.println("-".repeat(70) + "\n" +
                "-".repeat(20) + "Ejericio_20 Calcular Descuento" + "-".repeat(10)
                + "\n" + "-".repeat(70));
    }

    public void Calcular_Descuento() {
        if (this.getPrecio() > 200f){
            this.setDescuento(rebate.Rebate_sell(this.getPrecio(), 0.15f));
        } else if (this.getPrecio() >= 100f || this.getPrecio() <= 200f){
            this.setDescuento(rebate.Rebate_sell(this.getPrecio(), 0.21f));
        } else {this.setDescuento(rebate.Rebate_sell(this.getPrecio(),0.10f));}
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    @Override
    public String toString(){
        return "Precion original " + this.getPrecio() + " precios con descuento " + this.getDescuento();
    }
}
