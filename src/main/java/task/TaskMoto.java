package task;

import vehiculos.Carro;
import vehiculos.Moto;

public class TaskMoto {
    private Moto moto;
    public TaskMoto (Moto moto){
        this.moto=moto;
    }

    public double calcularCuota(){
        double cuota= moto.getCuota()/60;
        return cuota;
    }
}
