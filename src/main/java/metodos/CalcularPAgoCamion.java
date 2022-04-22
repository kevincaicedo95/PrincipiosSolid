package metodos;

import interfaz.CalcularPago;
import task.TasksCamion;
import vehiculos.Camion;

import static org.mockito.Mockito.mock;

public class CalcularPAgoCamion implements CalcularPago {

    private Camion camion;
    private TasksCamion tasksCamion;

    public CalcularPAgoCamion (Camion camion , TasksCamion tasksCamion){
        this.camion=camion;
        this.tasksCamion=tasksCamion;
    }

    @Override
    public int calcularPago() {
        double pago;
        if (tasksCamion.sorteo()==true){
            pago=2000;
        }
        else{
            pago=(tasksCamion.calcularCuota()*camion.getHora())+(tasksCamion.calcularCuota()*camion.getDia()*24);
        }
        return (int)pago;
    }
}
