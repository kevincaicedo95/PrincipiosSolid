package testTask;

import org.junit.Test;
import task.TasksCamion;
import vehiculos.Camion;

import java.text.ParseException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestTaskCamion {
    @Test
    public void testCalcularcuota() throws ParseException{
        double expected = 15000/24;
        Camion camion = new Camion(15000,0,0,0);
        TasksCamion tasksCamion = new TasksCamion(camion);
        assertEquals(expected,tasksCamion.calcularCuota(),2);
    }

    @Test
    public void testSorteoperdedor() throws  ParseException {
        boolean expected = false;
        Camion camion = new Camion(15000,0,0,0);
        TasksCamion tasksCamion = new TasksCamion(camion);
        assertEquals(expected,tasksCamion.sorteo());
    }

}
