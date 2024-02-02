package edu.upvictoria.fpoo.Estructuras_selectivas;

import edu.upvictoria.fpoo.App;

public class Ejercicio_16 extends App {
    private float presupuesto;
    private String regalo;

    public Ejercicio_16(){
        System.out.println("-".repeat(70) + "\n" +
                "-".repeat(20) + "Ejericio_16 FELIZ DIA DE SANVALENTIN" + "-".repeat(10)
                + "\n" + "-".repeat(70));
        setPresupuesto(input.ReadFloat("Ingrese su presupuesto"));
        Eleccion();
        toString();
    }

    public void Eleccion(){
        if(getPresupuesto() <= 10.00f){
            this.setRegalo("una tarjeta");
        } else if (getPresupuesto() >= 11.00f || getPresupuesto() <= 100.00f){
            this.setRegalo("uno chocolates");
        } else if (getPresupuesto() >= 101.00f || getPresupuesto() <= 250.00f){
            this.setRegalo("unas flores");
        } else {this.setRegalo("un anillo");}
    }
    public float getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getRegalo() {
        return regalo;
    }

    public void setRegalo(String regalo) {
        this.regalo = regalo;
    }
    @Override
    public String toString(){
        return "Su regalo perfecto seria " + this.getRegalo();
    }

}
