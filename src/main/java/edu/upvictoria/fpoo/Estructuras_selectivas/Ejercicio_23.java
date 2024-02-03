package edu.upvictoria.fpoo.Estructuras_selectivas;

public class Ejercicio_23 extends Generico_Default {
    public int tipo_poliza;
    private int Tipo_cargo;
    public float cargo;

    public Ejercicio_23(){
        Tipo_cargo();
    }
    public void Tipo_cargo(){
        System.out.println("Ingrese el tipo de poliza: \n" +
                            "1: Tipo 1 \n" +
                            "2: Tipo 2 \n:");
        setTipo_poliza(input.ReadInteger());
        System.out.println("Ingrese el que tipo de cargo :\n" +
                            "1: bebe alchol \n" +
                            "2: usar lentes \n" +
                            "3: padece de alguna enfermedad \n" +
                            "4: padece de diabetes o deficiencia cardiaca \n" +
                            "5: tiene mas de 40 años" +
                            "6: ninguno \n");
        setTipo_cargo(input.ReadInteger());
        Cargo_extra();
        System.out.println(toString());
    }

    public void Cargo_extra(){
        if (this.getTipo_cargo() == 1 || this.getTipo_cargo() == 6){
            this.setCargo(0.10f);
        } else if (this.getTipo_cargo() == 2 || this.getTipo_cargo() == 3 || this.getTipo_cargo() == 4){
            this.setCargo(0.5f);
        } else if (this.getTipo_cargo() == 5){
            this.setCargo(0.20f);
        }
    }

    public float Cargo_total(){
        float cargo;
        if (this.getTipo_cargo() == 1){
            cargo = rebate.Comision(1200f, this.getCargo());
        }else {cargo = rebate.Comision(950f, this.getCargo());}
        return cargo;
    }

    public float getCargo() {
        return cargo;
    }

    public void setCargo(float cargo) {
        this.cargo = cargo;
    }

    public int getTipo_poliza() {
        return tipo_poliza;
    }

    public void setTipo_poliza(int tipo_poliza) {
        this.tipo_poliza = tipo_poliza;
    }

    public int getTipo_cargo() {
        return Tipo_cargo;
    }

    public void setTipo_cargo(int tipo_cargo) {
        Tipo_cargo = tipo_cargo;
    }
    @Override
    public String toString(){
        return "La Poliza " + this.getTipo_poliza() + " con un cargo de " + this.getCargo()
                + " el cargo total seria: " + this.Cargo_total();
    }
}
