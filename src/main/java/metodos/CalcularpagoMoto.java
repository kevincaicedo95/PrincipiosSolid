package metodos;

import interfaz.CalcularPago;
import task.TaskMoto;
import vehiculos.Moto;

public class CalcularpagoMoto implements CalcularPago {

    private Moto moto;
    private TaskMoto taskMoto;

    public CalcularpagoMoto(Moto moto, TaskMoto taskMoto) {
        this.moto=moto;
        this.taskMoto=taskMoto;
    }

    @Override
    public int calcularPago(){
        int pago;
        if (moto.getHora()>3) {
            pago = (int)((taskMoto.calcularCuota()* moto.getMinuto()) + (taskMoto.calcularCuota() * moto.getHora() * 60));
        }
        else pago=3000;
        return pago;
    }
}
