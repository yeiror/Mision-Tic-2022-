package com.example;
public class EvaluarCreditoVehiculo {
    /**
    * Calcula la cantidad de intereses a pagar en un crédito aplicando
    * interés simple.
    *
    * @param valor Cantidad de dinero necesario para adquirir el vehiculo
    * @param tiempo Número de meses a los que espera terminar de pagar el
    * préstamo.
    * @param interes Porcentaje de interes a aplicar.
    * @return El valor de interés que debe pagar por el prestamo.
    */
    private Double calcularInteresSimple(Double valor, Integer tiempo) {
        Double interes;
        interes=2.5/100;
        return (valor*tiempo*interes);
    }
    /**
    * Calcula la cantidad de intereses a pagar en un credito aplicando interes
    * compuesto.
    *
    * @param valor Cantidad de dinero necesario para adquirir el vehiculo
    * @param tiempo Número de meses a los que espera terminar de pagar el
    * préstamo.
    * @param interes Porcentaje de interes a aplicar.
    * @return El valor de interes que debe pagar por el prestamo.
    */
    private Double calcularInteresCompuesto(Double valor,Integer tiempo) {
        Double TMV;
        TMV=2.2/100 ;
             
        return valor*((Math.pow((1+TMV),tiempo)-1));
    }
    /**
    * Compara las distintas opciones de crédito para tomar la mejor decisión.
    *
    * @param valor Cantidad de dinero necesario para adquirir el vehiculo
    * @param tiempo Número de meses a los que espera terminar de pagar el préstamo.
    * @return Una cadena de caracteres que explique cuál es la opción que de debe
    * tomar. Los posibles valores son:
    * <ul>
    * <li><pre>credito especial</pre></li>
    * <li><pre>credito estandar</pre></li>
    * </ul>
    *
    * En el caso quesea igual tomar cualquiera de los 2, debe elegir <pre>credit
   o especial</pre>
    */
    

    public String compararOpcion(Double valor, Integer tiempo) {
        if(calcularInteresCompuesto(valor, tiempo)>calcularInteresSimple(valor, tiempo)){
            return "credito especial";
        }
        else{
            return "credito estandar";
        }
      
    }
   }