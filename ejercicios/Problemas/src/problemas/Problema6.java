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
public class Problema6 {

    public static void main(String[] args) {
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        double media = calcularMedia(informacion);
        double desviacionEstandar = calcularDesviacionEstandar(informacion, media);

        System.out.println("Media aritmética: " + media);
        System.out.println("Desviación estándar: " + desviacionEstandar);
    }

    public static double calcularMedia(int[] arreglo) {
        int suma = 0;
        for (int valor : arreglo) {
            suma = suma + valor;
        }
        return suma;
    }

    public static double calcularDesviacionEstandar(int[] arreglo, double media) {
        double sumaDiferenciasCuadradas = 0;
        for (int valor : arreglo) {
            sumaDiferenciasCuadradas = sumaDiferenciasCuadradas + Math.pow(valor - media, 2);
        }
        return sumaDiferenciasCuadradas;
    }

}
