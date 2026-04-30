/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema_4;

/**
 *
 * @author Huemantzin
 */
public class MetodoTrapecio {
    

        public static void main(String[] args) {
            double a = 1, b = 5;
            int n = 4;
            double h = (b - a) / n;
            double suma = 0.5 * (f(a) + f(b));
            for (int i = 1; i < n; i++) {
                suma += f(a + i * h);
            }
            double integral = h * suma;
            System.out.println("Aproximación: " + integral);
        }

        public static double f(double x) {
            return 2 * x + 3;
        }
    }

