package edu.upvictoria.fpoo;
import edu.upvictoria.fpoo.Estructuras_repetitiva.Ejericio_1;
import edu.upvictoria.fpoo.Input.InputReader;
import edu.upvictoria.fpoo.Estructuras_selectivas.*;
public class App {

    public InputReader input = new InputReader();

    public static void main( String[] args ) {
        System.out.println("-".repeat(50) + "\n" + "-".repeat(15) +
                           "Programario 2-3&4" + "-".repeat(18) + "\n" +
                            "-".repeat(50));
        InputReader input = new InputReader();
        System.out.print("Elija un ejercicio [1-75]: ");
        int i = input.ReadInteger();
        switch (i){
            case 1: new Ejercicio_1(); break;
            case 2: new Ejercicio_2(); break;
            case 3: new Ejercicio_3(); break;
            case 4: new Ejercicio_4(); break;
            case 5: new Ejercicio_5(); break;
            case 6: new Ejercicio_6(); break;
            case 7: new Ejercicio_7(); break;
            case 8: new Ejercicio_8(); break;
            case 9: new Ejercicio_9(); break;
            case 10: new Ejercicio_10(); break;
            case 11: new Ejercicio_11(); break;
            case 12: new Ejercicio_12(); break;
            case 13: new Ejercicio_13(); break;
            case 14: new Ejercicio_14(); break;
            case 15: new Ejercicio_15(); break;
            case 16: new Ejercicio_16(); break;
            case 17: new Ejercicio_17(); break;
            case 18: new Ejercicio_18(); break;

        }
    }
}
