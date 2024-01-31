package edu.upvictoria.fpoo.Estructuras_selectivas;
import edu.upvictoria.fpoo.Estructuras_selectivas.Problemas_Genericos.Min_Max_Value;
import edu.upvictoria.fpoo.App;
public class Ejercicio_5 extends App {
    public Ejercicio_5(){
        System.out.println("-".repeat(70) + "\n" +
                "-".repeat(20) + "Ejericio_3 Lapices por mayoreo" + "-".repeat(10)
                + "\n" + "-".repeat(70));
        Max_value();
    }
    public void Max_value(){
        int a = input.ReadInteger("Ingresa el valor de a: ");
        int b = input.ReadInteger("Ingrese el valor de b: ");
        int c = input.ReadInteger("Ingrese el valor de c: ");
        System.out.println("El valor maximo es de: " + new Min_Max_Value().MIN_MAX_VALUE(new Min_Max_Value().MIN_MAX_VALUE(a,b),c));
    }

}
