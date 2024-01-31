package edu.upvictoria.fpoo.Estructuras_selectivas;

import edu.upvictoria.fpoo.Estructuras_selectivas.Problemas_Genericos.*;
import edu.upvictoria.fpoo.Input.InputReader;
public class Ejercicio_2 {

    private InputReader input = new InputReader();
    public Ejercicio_2(){
        System.out.println("-".repeat(70) + "\n" +
                "-".repeat(20) + "Ejericio_2 Identificar numero negativo" + "-".repeat(20)
                + "\n" + "-".repeat(70));
        is_Positive_or_negative();
    }

    public void is_Positive_or_negative() {
        int a = input.ReadInteger("Ingresa un numero ENTERO positivo o negativo: ");
        if (new IsNegative().isNegative(a) == false) {
            System.out.print("El numero ingresado es positvo ");
        } else {
            System.out.print("El numero es negativo");
        }
    }
}
