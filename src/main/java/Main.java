import interfaz.CalcularPago;
import metodos.CalcularPagoCarro;
import metodos.CalcularpagoMoto;
import task.TaskMoto;
import task.TasksCamion;
import task.TaskCarro;
import vehiculos.Camion;
import metodos.CalcularPAgoCamion;
import vehiculos.Carro;
import vehiculos.Moto;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        System.out.println ("Parqueadero tienda tipica: Elija el tipo de vehiculo");
        System.out.println ("1. Carro \n2. Moto \n3. Camion");
        String tipoVehiculo = "";
        Scanner scanertipoVehiculo = new Scanner (System.in);
        tipoVehiculo = scanertipoVehiculo.nextLine ();
        System.out.println(tipoVehiculo);
        if (tipoVehiculo.equals("3")==true){
            String valorDia = "";
            int valorDiaInt;
            String cantidadDias = "";
            int cantidadDiasInt;
            String cantidadHoras = "";
            int cantidadHorasInt;
            String sorteo= "";
            int  sorteoInt;
            System.out.println ("Ingrese el valor del dia: ");
            Scanner scanervalorDia = new Scanner (System.in);
            System.out.println ("Ingrese la cantidad de dias: ");
            Scanner scanerCantidadDias = new Scanner (System.in);
            System.out.println ("Ingrese la cantidad de horas: ");
            Scanner scanerCantidadHoras= new Scanner (System.in);
            System.out.println ("Elija el valor entre 1 y 1000: ");
            Scanner scanerSorteo= new Scanner (System.in);
            valorDia=scanervalorDia.nextLine();
            valorDiaInt=Integer.parseInt(valorDia);
            cantidadDias=scanerCantidadDias.nextLine();
            cantidadDiasInt=Integer.parseInt(cantidadDias);
            cantidadHoras=scanerCantidadHoras.nextLine();
            cantidadHorasInt=Integer.parseInt(cantidadHoras);
            sorteo=scanerSorteo.nextLine();
            sorteoInt=Integer.parseInt(sorteo);
            Camion camion= new Camion(valorDiaInt,cantidadDiasInt,cantidadHorasInt,sorteoInt);
            TasksCamion tasksCamion = new TasksCamion(camion);
            CalcularPago calcularPago;
            calcularPago= new CalcularPAgoCamion(camion,tasksCamion);
            System.out.println(calcularPago.calcularPago());
        }
        else if (tipoVehiculo.equals("1")==true){
            String valorHora= "";
            int valorHoraInt;
            String cantidadHora = "";
            int cantidadHoraInt;
            String cantidadMinutos= "";
            int cantidadMinutosInt;
            System.out.println ("Ingrese el valor de la hora: ");
            Scanner scanervalorHora = new Scanner (System.in);
            System.out.println ("Ingrese la cantidad de horas: ");
            Scanner scanerCantidadHora = new Scanner (System.in);
            System.out.println ("Ingrese la cantidad de minutos: ");
            Scanner scanerCantidadMinutos= new Scanner (System.in);
            valorHora=scanervalorHora.nextLine();
            valorHoraInt=Integer.parseInt(valorHora);
            cantidadHora=scanerCantidadHora.nextLine();
            cantidadHoraInt=Integer.parseInt(cantidadHora);
            cantidadMinutos=scanerCantidadMinutos.nextLine();
            cantidadMinutosInt=Integer.parseInt(cantidadMinutos);
            Carro carro = new Carro(valorHoraInt,cantidadHoraInt,cantidadMinutosInt);
            TaskCarro tasksCarro = new TaskCarro (carro);
            CalcularPago calcularPago;
            calcularPago= new CalcularPagoCarro(carro,tasksCarro);
            System.out.println(calcularPago.calcularPago());
        }
        else if (tipoVehiculo.equals("2")==true){
            String valorHora= "";
            int valorHoraInt;
            String cantidadHora = "";
            int cantidadHoraInt;
            String cantidadMinutos= "";
            int cantidadMinutosInt;
            System.out.println ("Ingrese el valor de la hora: ");
            Scanner scanervalorHora = new Scanner (System.in);
            System.out.println ("Ingrese la cantidad de horas: ");
            Scanner scanerCantidadHora = new Scanner (System.in);
            System.out.println ("Ingrese la cantidad de minutos: ");
            Scanner scanerCantidadMinutos= new Scanner (System.in);
            valorHora=scanervalorHora.nextLine();
            valorHoraInt=Integer.parseInt(valorHora);
            cantidadHora=scanerCantidadHora.nextLine();
            cantidadHoraInt=Integer.parseInt(cantidadHora);
            cantidadMinutos=scanerCantidadMinutos.nextLine();
            cantidadMinutosInt=Integer.parseInt(cantidadMinutos);
            Moto moto= new Moto(valorHoraInt,cantidadHoraInt,cantidadMinutosInt);
            TaskMoto taskMoto = new TaskMoto(moto);
            CalcularPago calcularPago;
            calcularPago= new CalcularpagoMoto(moto,taskMoto);
            System.out.println(calcularPago.calcularPago());
        }
    }
}
