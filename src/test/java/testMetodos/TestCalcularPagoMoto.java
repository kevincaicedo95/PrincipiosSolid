package testMetodos;

import metodos.CalcularPagoCarro;
import metodos.CalcularpagoMoto;
import org.junit.Test;
import task.TaskCarro;
import task.TaskMoto;
import vehiculos.Carro;
import vehiculos.Moto;

import java.text.ParseException;

import static org.junit.Assert.assertEquals;

public class TestCalcularPagoMoto {
    @Test
    public void testCalcularPagoMenorUnaHora() throws ParseException {
        Moto moto = new Moto(1000,2,30);
        TaskMoto taskMoto = new TaskMoto(moto);
        CalcularpagoMoto calcularpagoMoto = new CalcularpagoMoto(moto,taskMoto);
        assertEquals(3000,calcularpagoMoto.calcularPago());
    }

    @Test
    public void testCalcularPagoMayorUnaHora() throws ParseException{
        Moto moto = new Moto(1000,4,30);
        TaskMoto taskMoto = new TaskMoto(moto);
        CalcularpagoMoto calcularpagoMoto = new CalcularpagoMoto(moto,taskMoto);
        assertEquals(4500,calcularpagoMoto.calcularPago());
    }
}
