package edu.upvictoria.fpoo.Estructuras_selectivas;

import edu.upvictoria.fpoo.Estructuras_selectivas.Problemas_Genericos.Diferencia;

public class Ejericicio_26 extends Generico_Default {

    private float salary_per_hour;
    private int horas;
    private int dias_tabajados;
    private float sueldo_semanal;
    public Ejericicio_26(){
        System.out.println("Sistema del trabajador ");
        this.setSalary_per_hour(input.ReadFloat("Ingrese le sueldo del trabajador"));
        this.setHoras(input.ReadInteger("Ingrese la horas trabajadas "));
        this.setDias_tabajados(input.ReadInteger("Ingrese los dias que trabajo "));
        this.sueldo();
    }

    public void sueldo(){
        if(this.horas < 16){
            this.sueldo_semanal = salary_per_hour * this.horas * this.dias_tabajados;
        } else if (this.horas >= 41 || this.horas < 45){
            this.sueldo_semanal = ((salary_per_hour * 40) + ((this.horas - 40) * (this.salary_per_hour * 2)) * this.dias_tabajados);
        } else {
            this.sueldo_semanal = ((salary_per_hour * 40) + (this.sueldo_semanal * 30) + ((this.horas - 45) * (this.salary_per_hour * 3)) * this.dias_tabajados);
        }
        System.out.println(this.toString());
    }
    @Override
    public String toString(){
        return "Sueldo por hora " + this.salary_per_hour + "\n" +
                "Dias trabajados " + this.dias_tabajados + "\n" +
                "Horas trabajadas " + this.salary_per_hour + "\n" +
                "Salario total " + this.sueldo_semanal;
    }

    public void setSalary_per_hour(float salary_per_hour) {
        this.salary_per_hour = salary_per_hour;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setDias_tabajados(int dias_tabajados) {
        this.dias_tabajados = dias_tabajados;
    }
}
