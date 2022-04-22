package vehiculos;

public class Moto {
    private double cuota;
    private int hora;
    private int minuto;

    public  Moto (double cuota, int hora, int minuto){
        this.cuota=cuota;
        this.hora=hora;
        this.minuto=minuto;
    }

    public double getCuota(){return cuota;}
    public int getHora() {return hora;}
    public int getMinuto() {return minuto;}

    public void setCuota(double cuota) {this.cuota = cuota;}
    public void setHora(int hora) {this.hora = hora;}
    public void setMinuto(int minuto) {this.minuto = minuto;}
}
