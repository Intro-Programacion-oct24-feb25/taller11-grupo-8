/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;
import java.util.Scanner;

public class Problema3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] notas = new double[4];
        String cualitativo;
        for (int i = 0; i <= 3; i++){
            System.out.println("Ingrese la nota");
            notas[i] = entrada.nextDouble();           
        }
        
        cualitativo = funcion1(notas[0], notas[1], notas[2], notas[3]);
        System.out.println("El promedio de las notas: " + notas[0] + ", " + notas[1] + ", " + notas[2] +
                "; " + notas[3] + " es: " + cualitativo) ;
    }
    
    public static String funcion1(double a, double b, double c, double d) {
        // 
        int promedio = 0;
        String mensaje = "";
        promedio = (int) ((a + b + c + d )/4);
        if (promedio <= 5) {
            mensaje = "Regular";
        } else {
            if (promedio > 5 && promedio <=8) {
                mensaje = "Muy bueno";
            } else {
                if (promedio > 9 && promedio <= 10){
                    mensaje = "Sobre Saliente";
                }
            }
        }       
        return null;
    }
    
    public static String convertirMayusculas(String mensaje){
        
        return mensaje;
        
    }

}