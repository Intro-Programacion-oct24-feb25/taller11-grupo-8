/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {

    public static void main(String[] args) {

        String[] arregloCiudad = generarArreglo();
        imprimirCiudades(arregloCiudad);
    }

    public static String[] generarArreglo() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el número de elementos que desea en el"
                + " arreglo:");
        int elementos = entrada.nextInt();

        String[] ciudades = new String[elementos];

        for (int i = 0; i <= elementos - 1; i++) {
            System.out.print("Ingrese el nombre de la ciudad de ecuador"
                    + " que desea presentar:");
            ciudades[i] = entrada.nextLine();
        }

        return ciudades;
    }

    public static void imprimirCiudades(String[] a) {
        System.out.println("Ciudades que tienen 4 o 5 caracteres:");
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i].length() == 4 || a[i].length() == 5) {
                System.out.println(a[i]);
            }
        }
    }
}
