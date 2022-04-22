package vehiculos;

public class Camion {
    private double cuota;
    private int dia;
    private int hora;
    private int sorteo;

    public  Camion (double cuota, int dia, int hora, int sorteo){
        this.cuota=cuota;
        this.dia=dia;
        this.hora=hora;
        this.sorteo=sorteo;
    }

    public double getCuota(){return cuota;}
    public int getDia() {return dia;}
    public int getHora() {return hora;}
    public int getSorteo() {return sorteo;}

    public void setCuota(double cuota) {this.cuota = cuota;}
    public void setHora(int hora) {this.hora = hora;}
    public void setDia(int dia) {this.dia = dia;}
    public void setSorteo(int sorteo) {this.sorteo = sorteo;}

}
