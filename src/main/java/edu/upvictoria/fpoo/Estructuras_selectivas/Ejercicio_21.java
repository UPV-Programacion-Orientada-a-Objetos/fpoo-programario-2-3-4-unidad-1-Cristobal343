package edu.upvictoria.fpoo.Estructuras_selectivas;

public class Ejercicio_21 {
    private int edad;
    private float promedio;
    private float beca_ingreso;

    public Ejercicio_21(){
        System.out.println("-".repeat(70) + "\n" +
                "-".repeat(20) + "Ejericio_21 Tarifa de estacionamiento" + "-".repeat(10)
                + "\n" + "-".repeat(70));
        Cantidad_monetaria();
        toString();
    }
    public void Cantidad_monetaria(){
        if (this.getEdad() > 18) {
            if (this.getPromedio() >= 9.0f) {
                this.setBeca_ingreso(2000f);
            } else if (this.getPromedio() >= 7.5 && this.getPromedio() < 9.0f) {
                this.setBeca_ingreso(1000f);
            } else if (this.getPromedio() >= 6.5f && this.getPromedio() < 7.5f) {
                this.setBeca_ingreso(500f);
            }
        }
        else {
            if (this.getPromedio() >= 9.0){
                this.setBeca_ingreso(3000f);
            } else if (this.getPromedio() >= 8.0f && this.getPromedio() < 9.0f){
                this.setBeca_ingreso(2000f);
            } else if (this.getPromedio() >= 6.0f && this.getPromedio() < 8.0f) {
                this.setBeca_ingreso(1000f);
            }
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public float getBeca_ingreso() {
        return beca_ingreso;
    }

    public void setBeca_ingreso(float beca_ingreso) {
        this.beca_ingreso = beca_ingreso;
    }
    @Override
    public String toString(){
        String message;
        if (this.getPromedio() > 6){
            message = "Con su promedio de " + this.getBeca_ingreso();
        } else {message = "Lo senitimos no cumple con los requisitos del programa";}
        return message;
    }
}
