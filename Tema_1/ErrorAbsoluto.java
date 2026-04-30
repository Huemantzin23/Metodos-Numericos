
package com.mycompany.tema_1;


public class ErrorAbsoluto {
    public static void main(String[] args) {
double valorReal = 150.0; // cm (valor verdadero)
double valorAproximado = 149.2; // cm (medición)
double errorAbsoluto = Math.abs(valorReal - valorAproximado);
System.out.println("Error absoluto = " + errorAbsoluto + " cm");
}
}
