package edu.upvictoria.fpoo.Estructuras_selectivas;

public class Ejericicio_28 extends Generico_Default{
    public String nota;
    private int calf;
    public Ejericicio_28(){
        this.Get_Nota();
    }
    public void Get_Nota(){
        this.setNota();
        switch (this.nota.toLowerCase()){
            case "a": this.setCalf(10); break;
            case "b": this.setCalf(9); break;
            case "c": this.setCalf(8); break;
            case "d": this.setCalf(7); break;
            case "e": this.setCalf(6); break;
            default: this.setCalf(5); break;
        }
        System.out.println(this.toString());
    }
    public void setNota(){
        this.nota = input.ReadLine("Ingresa una nota [A,B,C,D,E,F]: ");
    }

    public void setCalf(int calf) {
        this.calf = calf;
    }
    @Override
    public String toString(){
        return "Nota" + this.nota + "\n" +
                "Calificacion" +  this.nota;
    }
}
