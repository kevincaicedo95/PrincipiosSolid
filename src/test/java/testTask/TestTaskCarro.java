package testTask;

import org.junit.Test;
import task.TaskCarro;
import vehiculos.Carro;

import java.text.ParseException;

import static org.junit.Assert.assertEquals;

public class TestTaskCarro {

    @Test
    public void testCalcularCuota () throws ParseException{
        double expected = 2000/60;
        Carro carro = new Carro(2000,6,50);
        TaskCarro taskCarro = new TaskCarro(carro);
        assertEquals(expected,taskCarro.calcularCuota(),2);
    }
}
