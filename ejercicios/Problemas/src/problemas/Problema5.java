/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema5 {

    public static void main(String[] args) {
        // Definir las matrices de prueba
        int[][] informacion = {
            {1, 2, 3},
            {10, 20, 30},
            {100, 200, 300}
        };

        int[][] informacion2 = {
            {1, 2, 3},
            {10, 20, 30},
            {100, 200, 300}
        };

        
        int[][] resultado = sumaMatrices(informacion, informacion2);

        
        System.out.println("Resultado de la suma de las matrices:");
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] sumaMatrices(int[][] matriz1, int[][] matriz2) {
        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
            throw new IllegalArgumentException("Las matrices deben tener las mismas dimensiones.");
        }

        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return resultado;
    }
}