package edu.upvictoria.fpoo.Estructuras_selectivas;

import edu.upvictoria.fpoo.App;
import edu.upvictoria.fpoo.Estructuras_selectivas.Problemas_Genericos.Rebate;
public class Ejercicio_13 extends App {
    private int clave;
    private float precio_de_venta;
    private float costo_de_producion;
    private float materia_prima;
    private float precio_fabricacion;
    private float gasto_de_fabricaion;
    private float precio_mano_obra;

    private Rebate rebate = new Rebate();

    public Ejercicio_13(){
        System.out.println("-".repeat(70) + "\n" +
                "-".repeat(20) + "Ejericio_13 Fabrica el cometa" + "-".repeat(10)
                + "\n" + "-".repeat(70));
        this.clave = input.ReadInteger("Ingrese el la catergoria del producto [1-6]: ");
        this.setMateria_prima(input.ReadFloat("Ingrese el valor de la materia prima: "));
        setPrecio_mano_obra();
        setCosto_de_producion();
        setPrecio_de_venta();
        setGasto_de_fabricaion();
        setGasto_de_fabricaion();
        System.out.println(this.toString());
    }

    public float getMateria_prima() {
        return materia_prima;
    }

    public void setMateria_prima(float materia_prima) {
        this.materia_prima = materia_prima;
    }

    public float getPrecio_mano_obra() {
        return precio_mano_obra;
    }

    public void setPrecio_mano_obra() {
        if(this.clave == 3 || this.clave == 4){
            this.precio_mano_obra = rebate.Comision(this.getMateria_prima(),0.75f);
        }
        else if (this.clave == 1 || this.clave == 5){
            this.precio_mano_obra = rebate.Comision(this.getMateria_prima(), 0.80f);
        }
        else if (this.clave == 2 || this.clave == 6){
            this.precio_mano_obra = rebate.Comision(this.getMateria_prima(), 0.85f);
        } else {
            System.out.println("La categoria del producto no sirve");
        }
    }

    public float getCosto_de_producion() {
        return costo_de_producion;
    }
    public void setCosto_de_producion() {
        this.costo_de_producion = this.getMateria_prima() + this.getPrecio_mano_obra() + this.getGasto_de_fabricaion();
    }
    public float getPrecio_de_venta() {
        return precio_de_venta;
    }

    public void setPrecio_de_venta() {
        this.precio_de_venta = this.getCosto_de_producion() + rebate.Comision(this.costo_de_producion,0.45f);
    }

    public float getGasto_de_fabricaion() {return gasto_de_fabricaion;}

    public void setGasto_de_fabricaion() {
        if (this.clave == 2 || this.clave == 5){
            this.gasto_de_fabricaion = rebate.Comision(this.getMateria_prima(),0.30f);
        } else if (this.clave == 3 || this.clave == 6){
            this.gasto_de_fabricaion = rebate.Comision(this.getMateria_prima(), 0.35f);
        } else if (this.clave == 1){
            this.gasto_de_fabricaion = rebate.Comision(this.getMateria_prima(), 0.28f);
        } else {
            System.out.println("Las claves no coiciden");
        }
    }

    @Override
    public String toString() {
        return  "clave=" + clave +
                ", precio_de_venta =" + precio_de_venta +
                ", costo_de_producion =" + costo_de_producion +
                ", materia_prima =" + materia_prima +
                ", precio_fabricacion =" + precio_fabricacion +
                ", gasto_de_fabricaion =" + gasto_de_fabricaion +
                ", precio_mano_obra =" + precio_mano_obra +
                ", rebate=" + rebate;
    }
}
