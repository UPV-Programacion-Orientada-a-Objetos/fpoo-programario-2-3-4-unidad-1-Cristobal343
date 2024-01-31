package edu.upvictoria.fpoo.Estructuras_selectivas;
import edu.upvictoria.fpoo.App;
import edu.upvictoria.fpoo.Estructuras_selectivas.Problemas_Genericos.Min_Max_Value;
import edu.upvictoria.fpoo.Input.InputReader;

public class Ejercicio_3 extends App {
    public Ejercicio_3(){
        System.out.println("-".repeat(70) + "\n" +
                "-".repeat(20) + "Ejericio_3 Lapices por mayoreo" + "-".repeat(10)
                + "\n" + "-".repeat(70));
        Input();
    }
    public void Input(){
        int a = input.ReadInteger("Ingresa la cantida de lapices: ");
        if(new Min_Max_Value().Is_Max_to(a,1000)){
            System.out.println("El valor de " + a  + " lapices es igual a " + (float) a*3.65f + " pesos");
        } else {
            System.out.println("El valor de " + a + " lapices es igual a " + (float) a*4.58f + " pesos");
        }

    }

}
