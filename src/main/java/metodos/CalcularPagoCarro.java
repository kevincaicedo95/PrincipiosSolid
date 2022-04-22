package metodos;

import interfaz.CalcularPago;
import task.TaskCarro;
import task.TasksCamion;
import vehiculos.Carro;

public class CalcularPagoCarro implements CalcularPago {

    private Carro carro;
    private TaskCarro taskCarro;

    public CalcularPagoCarro(Carro carro, TaskCarro taskCarro) {
        this.carro=carro;
        this.taskCarro=taskCarro;
    }

    @Override
    public int calcularPago(){
        double pago;
        if (carro.getHora()>1){
            pago=(taskCarro.calcularCuota()*carro.getMinuto())+(taskCarro.calcularCuota()*carro.getHora()*60);
        }
        else pago=1000;
        return  (int)pago;
    }
}
