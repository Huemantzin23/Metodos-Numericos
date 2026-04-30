/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tema_1;

public class ErrorRelativo {
public static void main(String[] args) {
double valorReal = 15;
double valorAproximado = 14.2;
double errorRelativo = Math.abs(valorReal - valorAproximado) /

valorReal;
System.out.println("Error relativo = " + errorRelativo);
}}