package edu.upvictoria.fpoo.Estructuras_repetitiva;
import edu.upvictoria.fpoo.Input.InputReader;
public class Ejericio_1 {
    private InputReader input = new InputReader();
    public Ejericio_1(){ // mini banner
        System.out.println("-".repeat(70) + "\n" +
                            "-".repeat(20) + "Ejericio_1 sumar 10 numero con ciclo while"
                            + "\n" + "-".repeat(70));
        System.out.println("El resultado de la suma es: " + while_plus());
    }
    public float while_plus(){
        int i = 0, j = 0;
        while ( i++ < 10){
            System.out.println("ingrese el numero " + i);
            j = j + (input.ReadInteger());
        }
        return j;
    }

}
