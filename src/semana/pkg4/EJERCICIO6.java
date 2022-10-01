// EJERCICIO: MATRIZ DE 10X1O INGRESADO POR TECLADO QUE SUME TODAS LA COLUMNAS PARES DE LA MATRIZ
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana.pkg4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class EJERCICIO6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[10][10];
        int[] sumaColumnas = new int[10];
        int total = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                int k = (int) (Math.random() * 10 + 1);
                System.out.println("Ingrese el valor de la posicion : [" + i + "][" + j + "] = " + k);
                matriz[i][j] = k;
                if (j % 2 == 1) {
                    sumaColumnas[j] += matriz[i][j];
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }

        int contadorcolumnas = 1;
        for (int i = 0; i < matriz.length; i++) {
            if (i % 2 == 1) {
                System.out.println("La suma de la columna " + contadorcolumnas + " es : " + sumaColumnas[i]);
                total += sumaColumnas[i];
            }
            contadorcolumnas++;
        }
        System.out.println("La suma total de las columnas pares es : " + total);
    }

}
