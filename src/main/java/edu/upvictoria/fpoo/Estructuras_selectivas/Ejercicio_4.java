package edu.upvictoria.fpoo.Estructuras_selectivas;

import edu.upvictoria.fpoo.App;
import edu.upvictoria.fpoo.Estructuras_selectivas.Problemas_Genericos.Rebate;
import edu.upvictoria.fpoo.Input.InputReader;

public class Ejercicio_4 extends App {
    public Ejercicio_4(){
        System.out.println("-".repeat(70) + "\n" +
                "-".repeat(20) + "Ejericio_3 Lapices por mayoreo" + "-".repeat(10)
                + "\n" + "-".repeat(70));
        Input();
    }
    public void Input(){
        float a = input.ReadFloat("Ingrese el valor del producto: ");
        float rebeat;
        if (a > 2500.00f){ rebeat = 0.15f; } else {rebeat = 0.08f;}
        System.out.println("La rebaja en " + rebeat + " del articulo es igual a " + new Rebate().Rebate_sell(a,rebeat) );
    }
}
