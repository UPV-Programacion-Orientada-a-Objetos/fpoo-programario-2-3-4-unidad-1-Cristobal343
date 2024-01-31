package edu.upvictoria.fpoo.Estructuras_selectivas.Problemas_Genericos;

public class Min_Max_Value {
    public int MIN_MAX_VALUE(int a, int b){ // Este metodo retorna el valor mas grande
        int MaxValue;
        if (a > b){
            MaxValue = a;
        }else {MaxValue = b;}
        return MaxValue;
    }

    public boolean Is_Max_to(int a, int b){ // Este metodo retorna un true si el valor
        boolean MaxValue;               // del parametro uno es mayor al parametro dos
        if (a > b){                     // de lo conntrario regeresa false
            MaxValue = true;
        }else {MaxValue = false;}
        return MaxValue;
    }


}
