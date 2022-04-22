package testMetodos;

import metodos.CalcularPAgoCamion;
import org.junit.Before;
import org.junit.Test;
import task.TasksCamion;
import vehiculos.Camion;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.text.ParseException;

public class TestCalmularPagoCamion {

    @Test
    public void testCalcularPagoCamionGanadorSorteo() throws ParseException{
        final TasksCamion tasksCamion = mock(TasksCamion.class);
        when(tasksCamion.sorteo()).thenReturn(true);
        Camion camion= new Camion(15000,3,12,10);
        CalcularPAgoCamion calcularPAgoCamion = new CalcularPAgoCamion(camion,tasksCamion);
        assertEquals(2000,calcularPAgoCamion.calcularPago());
    }

    @Test
    public void testCalcularPagoCamionPerdedorSorteo() throws ParseException{
        Camion camion= new Camion(15000,2,12,5000);
        TasksCamion tasksCamion = new TasksCamion(camion);
        CalcularPAgoCamion calcularPAgoCamion = new CalcularPAgoCamion(camion,tasksCamion);
        assertEquals(37500,calcularPAgoCamion.calcularPago());
    }
}
