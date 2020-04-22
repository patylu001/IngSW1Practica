package com.fca.calidad;

public class Calculadora{
    float resultado;
    
  public  float divide(int operador1, int operador2) {
        resultado=(operador1/operador2);
        System.out.println("La division de "+operador1+" / "+operador2+" es "+resultado);
        return resultado;
    }
    public  float multiplica(int operador1, int operador2) {
        resultado=operador1*operador2;
        System.out.println("La multiplicacion de "+operador1+" * "+operador2+" es "+resultado);
        return resultado;
    }
    public  float resta(int operador1, int operador2) {
        resultado=operador1-operador2;
        System.out.println("La resta de "+operador1+" - "+operador2+" es "+resultado);
        return resultado;
    }
    public  float suma(int operador1, int operador2) {
        resultado=operador1+operador2;
        System.out.println("La suma de "+operador1+" + "+operador2+" es "+resultado);
        return resultado;
    }
    
}
