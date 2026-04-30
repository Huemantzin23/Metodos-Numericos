package com.mycompany.tema_3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Huemantzin
 */
public class GaussSeidel {
    
    public class GaussSeidelEjemplo {

        public static void mostrarMatriz(double[][] matriz) {
            System.out.println("Matriz de coeficientes:");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.printf("%.2f ", matriz[i][j]);
                }
                System.out.println();
            }
        }

        public static double[] gaussSeidel(double[][] A, double[] b, double tol,
                int maxIter) {
            int n = A.length;
            double[] x = new double[n];
            double[] xNuevo = new double[n];
            int iteraciones = 0;
            for (int iter = 0; iter < maxIter; iter++) {
                System.arraycopy(x, 0, xNuevo, 0, n);
                for (int i = 0; i < n; i++) {
                    double suma = 0;
                    for (int j = 0; j < n; j++) {
                        if (j != i) {
                            suma += A[i][j] * xNuevo[j];
                        }
                    }
                    xNuevo[i] = (b[i] - suma) / A[i][i];
                }
                double error = 0;
                for (int i = 0; i < n; i++) {
                    error = Math.max(error, Math.abs(xNuevo[i] - x[i]));
                }
                if (error < tol) {
                    System.out.println("Convergencia alcanzada en "
                            + (iteraciones + 1) + " iteraciones.\n");

                    return xNuevo;

                }
                System.arraycopy(xNuevo, 0, x, 0, n);
                iteraciones++;
            }
            System.out.println("Máximo número de iteraciones alcanzado.");
            return x;
        }

        public static void main(String[] args) {
            double[][] A = {
                {10, 2, 1},
                {3, 10, 4},
                {2, 3, 10}
            };
            double[] b = {9, 24, 18};
            System.out.println("Matriz ingresada:\n");
            mostrarMatriz(A);
            double[] soluciones = gaussSeidel(A, b, 0.000001, 100);
            System.out.println("\nSoluciones del sistema:");
            for (int i = 0; i < soluciones.length; i++) {
                System.out.printf("%.3f ", soluciones[i]);
            }
        }
    }
    
}
