// EJERCICIO: MATRIZ DE 10X1O INGRESADO POR TECLADO QUE SUME TODAS LA FILAS PARES DE LA MATRIZ

package semana.pkg4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author GAGO RAMOS EDUARDO JESÚS
 */
public class EJERCICIO8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[10][10];
        int[] sumaFilas = new int[10];
        int total = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                int k = (int) (Math.random() * 10 + 1);
                System.out.println("Ingrese el valor de la posicion : [" + i + "][" + j + "] = " + k);
                matriz[i][j] = k;
                if (i % 2 == 1) {
                    sumaFilas[i] += matriz[i][j];
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }

        int contadorfilas = 1;
        for (int i = 0; i < matriz.length; i++) {
            if (i % 2 == 1) {
                System.out.println("La suma de la fila " + contadorfilas + " es : " + sumaFilas[i]);
                total += sumaFilas[i];
            }
            contadorfilas++;
        }
        System.out.println("La suma total de las filas pares es : " + total);
    }

}
