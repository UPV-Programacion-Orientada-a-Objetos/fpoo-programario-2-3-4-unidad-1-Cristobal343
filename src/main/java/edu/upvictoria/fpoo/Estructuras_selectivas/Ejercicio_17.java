package edu.upvictoria.fpoo.Estructuras_selectivas;

import edu.upvictoria.fpoo.App;

public class Ejercicio_17 extends App {
    private int horas;
    private float tarifa;

    public Ejercicio_17(){
        System.out.println("-".repeat(70) + "\n" +
                "-".repeat(20) + "Ejericio_17 Tarifa de estacionamiento" + "-".repeat(10)
                + "\n" + "-".repeat(70));
        Parking();
        toString();

    }
    public void Parking(){
        if (this.getHoras() >= 2){
            this.setTarifa(5.00f);
        } if (this.getTarifa() >= 5){
            this.setTarifa(this.getTarifa() + 4.00f);
        } if (this.getTarifa() >= 10){
            this.setTarifa(this.getTarifa() + 3.00f);
        } if (this.getHoras() > 10){
            this.setTarifa(this.getTarifa() + (2 * (this.getHoras() - 10)) );
        }
    }
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public float getTarifa() {
        return tarifa;
    }

    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
    }
    @Override
    public String toString(){
        return "La tarifa por " + this.getHoras() + " son " + this.getTarifa();
    }
}
