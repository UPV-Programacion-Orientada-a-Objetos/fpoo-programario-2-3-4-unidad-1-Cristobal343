package edu.upvictoria.fpoo.Estructuras_selectivas;

public class Ejericicio_27 extends Generico_Default{
    private int num_alumnos;
    private int costo;
    public Ejericicio_27(){
        this.setNum_alumnos(input.ReadInteger("Ingrese el numero de alumnos "));
        this.setPrecio();
    }
    public void setPrecio(){
        if (this.num_alumnos > 100){
            this.setCosto(20);
        } else if (this.num_alumnos > 49 && this.num_alumnos < 100){
            this.setCosto(35);
        } else if (this.num_alumnos > 19 && this.num_alumnos < 49){
            this.setCosto(40);
        } else {this.setCosto(50);}
        System.out.println(this.toString());
    }
    public void setNum_alumnos(int num_alumnos) {
        this.num_alumnos = num_alumnos;
    }
    public void setCosto(int costo) {
        this.costo = costo;
    }
    @Override
    public String toString(){
        return "El costo por alumno seria de " + this.costo;
    }
}
