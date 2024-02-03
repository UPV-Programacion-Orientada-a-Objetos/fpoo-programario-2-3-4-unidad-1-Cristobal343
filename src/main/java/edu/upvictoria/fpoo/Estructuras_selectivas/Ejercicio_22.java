package edu.upvictoria.fpoo.Estructuras_selectivas;

public class Ejercicio_22 extends Generico_Default{

    private int years;

    private float sueldo;
    private float bono;
    public Ejercicio_22(){
        System.out.println("-".repeat(70) + "\n" +
                "-".repeat(20) + "Ejericio_22 Calcular Bono" + "-".repeat(10)
                + "\n" + "-".repeat(70));
        setYears(input.ReadInteger("Ingrese loa años que ha trabajado con la empresa: "));
        setSueldo(input.ReadFloat("Ingrese el sueldo del trabajador "));
        Calular_bono();
    }
    public void Calular_bono(){
        if (this.getYears() > 5){
            if (this.sueldo < 1000f){
                this.setBono(rebate.Comision(rebate.Comision(this.getSueldo(),0.30f),0.30f));
            } else if (this.sueldo > 1000f && this.sueldo < 3500f){
                this.setSueldo(rebate.Comision(rebate.Comision(this.getSueldo(),0.30f ), 0.20f));
            } else {setSueldo(rebate.Comision(rebate.Comision(this.getSueldo(),0.30f), 0.20f));}
        } else if (this.getYears() < 2){
            if (this.sueldo < 1000f){
                this.setBono(rebate.Comision(rebate.Comision(this.getSueldo(),0.30f),0.20f));
            } else if (this.sueldo > 1000f && this.sueldo < 3500f){
                this.setSueldo(rebate.Comision(rebate.Comision(this.getSueldo(),0.15f ), 0.20f));
            } else {setSueldo(rebate.Comision(rebate.Comision(this.getSueldo(),0.10f), 0.20f));}
        }
    }
    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }



    public float getBono() {
        return bono;
    }

    public void setBono(float bono) {
        this.bono = bono;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String toString(){
        return "Años dentro de la empresa" + this.getYears() + "\n" +
                "Sueldo " + this.getSueldo() + "\n" +
                "bono " + this.getBono();
    }

}
