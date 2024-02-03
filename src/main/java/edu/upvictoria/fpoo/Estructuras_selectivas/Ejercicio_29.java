package edu.upvictoria.fpoo.Estructuras_selectivas;

public class Ejercicio_29 extends Generico_Default{
    private int day;
    private String nameofday;
    public Ejercicio_29(){
        System.out.println("Ejercicio 29");
        this.Day_week();
    }
    public void Day_week(){
        this.setDay();
        switch (this.day){
            case 1: this.nameofday = "lunes"; break;
            case 2: this.nameofday = "martes"; break;
            case 3: this.nameofday = "miercoles"; break;
            case 4: this.nameofday = "jueves"; break;
            case 5: this.nameofday = "viernes"; break;
            case 6: this.nameofday = "sabado"; break;
            case 7: this.nameofday = "momingo"; break;
        }
        System.out.println(this.toString());
    }
    public void setDay() {
        this.day = input.ReadInteger("Ingrese un numero del dia de la semana: ");
    }
    @Override
    public String toString(){
        return "El numero del dia" + this.day + "\n" +
                "El nombre del dia " + this.nameofday;
    }
}
