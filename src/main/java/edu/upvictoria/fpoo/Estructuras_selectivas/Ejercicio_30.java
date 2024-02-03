package edu.upvictoria.fpoo.Estructuras_selectivas;

public class Ejercicio_30 extends Generico_Default{
    private int puntos;
    private int bono;
    public Ejercicio_30(){
        System.out.println("Ejercicio 30");
        this.SetPuntosBono();
    }
    public void SetPuntosBono(){
        this.setPuntos();
        if (this.puntos >= 0 && this.puntos <= 100){
            this.setBono(1);
        } else if (this.puntos >= 101 && this.puntos <= 150) {
            this.setBono(2);
        } else if (this.puntos >= 151){
            this.setBono(3);
        }
        System.out.println(this.toString());
    }

    public void setPuntos() {
        this.puntos = input.ReadInteger("Ingrese la cantidad de puntos obtenida: ");
    }
    public void setBono(int bono) {
        this.bono = bono;
    }
    @Override
    public String toString(){
        return "Por " + this.puntos + " obtiene " + this.bono + " salario";
    }
}
