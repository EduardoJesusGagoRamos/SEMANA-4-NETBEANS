// EJERCICIO: MATRIZ DE 10X1O INGRESADO POR TECLADO QUE SUME TODAS LA COLUMNAS DE LA MATRIZ
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
public class EJERCICIO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int [] sumaColumnas = new int [4];
        int total = 0;
        //Relleno la diagonal principal con 1
        //Solo tengo que recorrer las casillas en las que el numero de filas es
        //igual que el numero de columna : matriz[0][0]=matriz[1][1]...=matriz[6][6]=1
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                int k= (int)(Math.random() * 10 + 1);
                System.out.println("Ingrese el valor de la posicion : [" + i + "][" + j + "] = " +k);
                matriz [i][j] = k;
                sumaColumnas[j] += matriz [i][j];
                
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
        for (int i = 0; i < matriz.length; i++) {
        System.out.println("La suma de la columna "+i+" es : " +sumaColumnas [i]);
        total += sumaColumnas [i]; 
        }
        System.out.println("La suma total de las columnas es : " +total);
    }

}
