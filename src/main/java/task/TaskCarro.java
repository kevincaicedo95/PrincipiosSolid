package task;

import vehiculos.Carro;

public class TaskCarro {

    private Carro carro;

    public TaskCarro (Carro carro ){
        this.carro=carro;
    }

    public double calcularCuota(){
        double cuota= carro.getCuota()/60;
        return cuota;
    }


}
