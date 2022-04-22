package task;

import vehiculos.Camion;

public class TasksCamion {

    private Camion camion;
    public TasksCamion(Camion camion){
        this.camion=camion;
    }

    public double calcularCuota(){
        double cuota=camion.getCuota()/24;
        return cuota;
    }

    public boolean sorteo(){
        int aleatorio;
        aleatorio = (int) ((Math.random()*(1000-1)) + 1);
        boolean condicion;
        if (camion.getSorteo()== aleatorio){
            condicion=true;
        }
        else condicion=false;
        return condicion;
    }
}
