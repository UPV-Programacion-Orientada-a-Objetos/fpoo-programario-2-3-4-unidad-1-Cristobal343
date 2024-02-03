package edu.upvictoria.fpoo.Input;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Scanner;

public class InputReader {

    // Esta clase captura la entrada de datos mediante las clases BufferdReader y InputStreamReader

    private BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
    public InputReader(){

    }
    // Return the input in to int
    public int ReadInteger(){
        int integer = 0;
        try {
            integer = Integer.parseInt(scanner.readLine()); // con mensaje
        } catch (NumberFormatException e){
            throw new RuntimeException("argument invalid isn't a integer value: ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return integer;
    }
    public int ReadInteger(String a){
        int integer = 0;
        try {
            System.out.print(a);
            integer = Integer.parseInt(scanner.readLine()); // con mensaje
        } catch (NumberFormatException e){
            throw new RuntimeException("arguement invalid isn't a integer value");
        } catch (IOException e){
            throw new RuntimeException(e);
        }

        return integer;
    }
    // Return the input in to float
    public float ReadFloat(String a) {
        try {
            System.out.print(a);
            float flat = Float.parseFloat(scanner.readLine());
            return flat;
        } catch (IOException e){
            throw new IllegalArgumentException("Illegal argumet isn't a float value");
        }
    }

    // Retorna el input convertido a double
    public double ReadDouble(String a){
        System.out.print(a);
        double doogle;
        try {
            doogle = Double.parseDouble(scanner.readLine());
        }catch (NumberFormatException e){
            throw new RuntimeException("Illegal argumetn isn't a Double value");
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        return  doogle;
    }
    // Retorna el input convertido a long
    public long ReadLong(String a) throws IOException {
        System.out.print(a);
        long lang = Long.parseLong(scanner.readLine());
        return lang;
    }

    // Retorna el input
    public String ReadLine(String a){
        String string;
        System.out.print(a);
        try {
            string = scanner.readLine(); // con mensaje
        } catch (NumberFormatException e){
            throw new RuntimeException("argument invalid isn't a String: ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return string;
    }

}
