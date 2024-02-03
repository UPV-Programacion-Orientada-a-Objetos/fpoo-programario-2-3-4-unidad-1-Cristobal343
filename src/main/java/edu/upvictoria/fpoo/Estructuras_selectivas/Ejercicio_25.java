package edu.upvictoria.fpoo.Estructuras_selectivas;

public class Ejercicio_25 extends Generico_Default{
    private int years;
    private float bono;
    public Ejercicio_25(){
        this.years = input.ReadInteger("Ingrese el años que ha trabajado: ");
        System.out.println(toString());

    }
    public void bono() {
        if (this.years == 1){
            this.bono = 100f;
        } else if (this.years >= 2 || this.years < 5){
            this.bono = 200f;
        } else if (this.years >= 5){
            this.bono = 1000f;
        }
    }

    public String toString(){
        return "Años de trabajo " +  this.years + "\n" +
                "Bono " + this.bono;
    }
}
