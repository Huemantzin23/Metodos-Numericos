/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tema_3;

import java.text.DecimalFormat;
public class Eliminacion_Gaussiana {
private static final int MAXN = 100;
public static void partialPivot(double[][] A, int n) {
for (int i = 0; i < n; i++) {
int pivotRow = i;
for (int j = i + 1; j < n; j++) {
if (Math.abs(A[j][i]) > Math.abs(A[pivotRow][i]))

{

pivotRow = j;
}
}
if (pivotRow != i) {
for (int j = i; j <= n; j++) {
double temp = A[i][j];
A[i][j] = A[pivotRow][j];
A[pivotRow][j] = temp;
}
}
for (int j = i + 1; j < n; j++) {
double factor = A[j][i] / A[i][i];
for (int k = i; k <= n; k++) {
A[j][k] -= factor * A[i][k];
}
}
}
}
public static void backSubstitute(double[][] A, int n,

double[] x) {

for (int i = n - 1; i >= 0; i--) {

double sum = 0;
for (int j = i + 1; j < n; j++) {
sum += A[i][j] * x[j];
}
x[i] = (A[i][n] - sum) / A[i][i];
}
}
public static void main(String[] args) {
int n = 3;
double[][] A = {{4.0, -2.0, 3.0, 5.0},
{1.0, 5.0, -1.0, 10.0},
{2.0, -3.0, 6.0, 12.0}
};

double[] x = new double[MAXN];
partialPivot(A, n);
backSubstitute(A, n, x);
DecimalFormat df = new DecimalFormat("0.000");
System.out.println("Solution for the system:");
for (int i = 0; i < n; i++) {

System.out.println("x[" + i + "] = " +

df.format(x[i]));

}
}
}
