package edu.upvictoria.fpoo.Estructuras_selectivas;
import edu.upvictoria.fpoo.App;
import edu.upvictoria.fpoo.Estructuras_selectivas.Problemas_Genericos.Min_Max_Value;
import edu.upvictoria.fpoo.Estructuras_selectivas.Problemas_Genericos.Rebate;

public class Ejercicio_8 extends App {

    private int numero_de_alumnos = 0;
    public Ejercicio_8(){
        System.out.println("-".repeat(70) + "\n" +
                "-".repeat(20) + "Ejericio_7 Embarcadero de uvas" + "-".repeat(10)
                + "\n" + "-".repeat(70));
        System.out.println("El descuesto de " +  this.numero_de_alumnos + " alumnos es de " + Aplicar_descuento());
    }
    public float Aplicar_descuento(){
        this.numero_de_alumnos = input.ReadInteger("Ingresar el numero de alumnos: ");   // Calcular el descuento
        float rebate = 0f;
        if (this.numero_de_alumnos > 100){
            rebate = this.numero_de_alumnos * 65.00f;
        } else if(this.numero_de_alumnos > 50 || a < 99){
            rebate = this.numero_de_alumnos * 70.00f;
        } else if (this.numero_de_alumnos > 30 || a < 49){
            rebate = this.numero_de_alumnos * 95.00f;
        } else {rebate = 400.00f; }
        return rebate;
    }
}
