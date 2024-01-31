package edu.upvictoria.fpoo.Estructuras_selectivas;
import edu.upvictoria.fpoo.Input.InputReader;
import edu.upvictoria.fpoo.Estructuras_selectivas.Problemas_Genericos.Min_Max_Value;
public class Ejercicio_1 {
    private InputReader input = new InputReader(); // la clase input reader maneja el flujo de
                                                    // entrada por teclado
    public Ejercicio_1(){
        System.out.println("-".repeat(70) + "\n" +
                "-".repeat(20) + "Ejericio_1 sumar 10 numero con ciclo while" + "-".repeat(20)
                + "\n" + "-".repeat(70));
        ReadInput();
    }
    public void ReadInput(){
        int a = 0; int b = 0;
        a = input.ReadInteger("Ingrese el valor del numero a: ");
        b = input.ReadInteger("Ingrese el valor de numero b: ");
        System.out.println("El valor mas grande es: " + new Min_Max_Value().MIN_MAX_VALUE(a,b));
    }

}
