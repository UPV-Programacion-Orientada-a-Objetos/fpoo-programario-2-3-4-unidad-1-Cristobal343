package edu.upvictoria.fpoo.Estructuras_selectivas;

public class Ejercicio_24 extends Generico_Default {

    private int destino;
    private String nombre_detino;
    private float origen_destino;
    private float cost_per_km = 20.00f;
    private float costo_total;
    public Ejercicio_24(){
        System.out.println("-".repeat(70) + "\n" +
                "-".repeat(20) + "Ejericio_24 LA TORTUGA DE MAR" + "-".repeat(10)
                + "\n" + "-".repeat(70));
        Select_trip();
    }

    public void Select_trip(){
        System.out.println("Elija un viaje a realizar" +
                            "1: Mexico \n" +
                            "2: Acapulco \n" +
                            "3: Pueto vallarta \n" +
                            "4: Cancun");
        setDestino(input.ReadInteger(":"));
        setOrigen_destino();
        setCosto_total(this.getOrigen_destino() * this.getCost_per_km());
        System.out.println(toString());
    }
    public float getOrigen_destino() {
        return origen_destino;
    }

    public void setOrigen_destino() {
        switch (this.getDestino()){
            case 1: this.origen_destino = 750f; this.nombre_detino = "Mexico" ;break;
            case 2: this.origen_destino = 800f; this.nombre_detino = "Acapulco"; break;
            case 3: this.origen_destino = 1200; this.nombre_detino = "Puerto vallarta"; break;
            case 4: this.origen_destino = 1800; this.nombre_detino = "Cancun"; break;
        }
    }

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }


    public float getCosto_total() {
        return costo_total;
    }

    public void setCosto_total(float costo_total) {
        this.costo_total = costo_total;
    }


    public float getCost_per_km() {
        return cost_per_km;
    }

    public void setCost_per_km(float cost_per_km) {
        this.cost_per_km = cost_per_km;
    }
    @Override
    public String toString(){
        return "Destino " + this.nombre_detino + "\n" +
                " Kilometros " + this.origen_destino + "\n" +
                " costo por kilometro " + this.cost_per_km +
                " Total " +  this.costo_total;
    }
}
