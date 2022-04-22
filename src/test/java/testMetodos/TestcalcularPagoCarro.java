package testMetodos;

import metodos.CalcularPagoCarro;
import org.junit.Test;
import task.TaskCarro;
import vehiculos.Carro;

import java.text.ParseException;

import static org.junit.Assert.assertEquals;

public class TestcalcularPagoCarro {
    @Test
    public void testCalcularPagoMenorUnaHora() throws ParseException{
        Carro carro = new Carro(2000,0,30);
        TaskCarro taskCarro = new TaskCarro(carro);
        CalcularPagoCarro calcularPagoCarro = new CalcularPagoCarro(carro,taskCarro);
        assertEquals(1000,calcularPagoCarro.calcularPago());
    }

    @Test
    public void testCalcularPagoMayorUnaHora() throws ParseException{
        Carro carro = new Carro(2000,2,30);
        TaskCarro taskCarro = new TaskCarro(carro);
        CalcularPagoCarro calcularPagoCarro = new CalcularPagoCarro(carro,taskCarro);
        assertEquals(5000,calcularPagoCarro.calcularPago());
    }
}
