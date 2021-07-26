package com.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Double valor = 53250000.0;
        Integer tiempo = 36;
        EvaluarCreditoVehiculo evaluar = new EvaluarCreditoVehiculo();
        String eleccion = evaluar.compararOpcion(valor, tiempo);
        System.out.println(eleccion);
    }
}
