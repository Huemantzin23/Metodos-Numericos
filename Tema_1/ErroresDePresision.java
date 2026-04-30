/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tema_1;

/**
 *
 * @author Huemantzin
 */
public class ErroresDePresision {
    
    public static void main(String[] args) {
double x = 1.0/3.0;
double producto = x * 3;
double error = Math.abs(1.0 - producto);
System.out.println("x = " + x);
System.out.println("x*3 = " + producto);
System.out.println ("Error = " + error);
}
    
}
