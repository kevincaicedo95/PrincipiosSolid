package testTask;

import org.junit.Test;
import task.TaskMoto;
import task.TasksCamion;
import vehiculos.Moto;

import java.text.ParseException;

import static org.junit.Assert.assertEquals;

public class TestTaskMoto {
    @Test
    public void testCalcularCuota () throws ParseException {
        double expected=1000/60;
        Moto moto = new Moto(1000,0,0);
        TaskMoto taskMoto = new TaskMoto(moto);
        assertEquals(expected,taskMoto.calcularCuota(),2);
    }
}
