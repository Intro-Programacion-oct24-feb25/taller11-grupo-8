/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;
import java.util.Scanner;

public class Problema3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota0;
        double nota1;
        double nota2;
        double nota3;
        
        System.out.println("Ingrese la primera nota:");
        nota0 = scanner.nextDouble();
        System.out.println("Ingrese la segunda nota:");
        nota1 = scanner.nextDouble();
        System.out.println("Ingrese la tercera nota:");
        nota2 = scanner.nextDouble();
        System.out.println("Ingrese la cuarta nota:");
        nota3 = scanner.nextDouble();

        String promedioCualitativo = funcion1(nota0, nota1, nota2, nota3);
        String mensaje = String.format("El promedio de las notas: %.1f, %.1f, %.1f, %.1f es %s",
                nota0, nota1, nota2, nota3, promedioCualitativo);
        System.out.println(convertirAMayusculas(mensaje));
    }
    
    public static String funcion1(double nota1, double nota2, double nota3, double nota4) {
        double promedio = (nota1 + nota2 + nota3 + nota4) / 4;

        if (promedio <= 5) {
            return "Regular";
        } else if (promedio <= 8) {
            return "Bueno";
        } else if (promedio <= 9) {
            return "Muy Bueno";
        } else {
            return "Sobresaliente";
        }
    }
    
    public static String convertirAMayusculas(String texto) {
        return texto.toUpperCase();
    }

}