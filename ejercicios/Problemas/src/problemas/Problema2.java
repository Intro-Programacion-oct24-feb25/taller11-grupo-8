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
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        int opcion;
        System.out.println("Para calcular el area de un cuadrado ingrese 1\n"
                + "Para calcular el area de un triangulo ingrese 2\nPara "
                + "calcular el area de un rectantangulo ingrese el 3 ");
        System.out.print("Ingrese un numero del 1 al 3 para ingresar en "
                + "la operacion: \n");
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                obtenerAreaCuadrado();
                break;
            case 2:
                obtenerAreaTriangulo();
                break;
            case 3:
                obtenerAreaRectangulo();
                break;

        }
    }

    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        double lado;
        double lado2;

        System.out.println("Ingrese la medida de uno de los lados del cuadrado"
                + ":");
        lado = entrada.nextDouble();
        lado2 = lado * lado;
        System.out.printf("El area de el cuadrado es:%.0f\n", lado2);
    }

    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        double altura;
        double base;
        double area;

        System.out.println("Ingrese la base del triangulo:");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura del triangulo:");
        altura = entrada.nextDouble();
        area = (base * altura) / 2;
        System.out.printf("El area de el triangulo es:%.1f\n", area);
    }

    public static void obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;

        System.out.println("Ingrese la base del rectangulo:");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura del rectangulo:");
        altura = entrada.nextDouble();
        area = base * altura;
        System.out.printf("El area de el rectangulo es:%.0f\n", area);
    }

}
