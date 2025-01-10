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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int valor;
        boolean bandera = true;
        System.out.println("Ingrese su nombre:");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su cedula:");
        String cedula = entrada.nextLine();
        System.out.println("Ingrese el valor segun lo que quiera consultar:");
        valor = entrada.nextInt();
        switch (valor) {
            case 1:
                calcularValorLuz(nombre, cedula);
                break;
            case 2:
                calcularPredio(nombre, cedula);
                break;

        }
    }

    public static void calcularValorLuz(String a, String b) {
        Scanner entrada = new Scanner(System.in);
        double valork;
        double mesk;
        double resultado;
        System.out.println("Ingrese el costo de kilovatio:");
        valork = entrada.nextDouble();
        System.out.println("Ingrese el numeor de kilovatio que ocupa al mes:");
        mesk = entrada.nextDouble();
        resultado = mesk * valork;

        System.out.printf("Cliente %s con cédula %s "
                + "debe cancelar el valor de %.2f", a, b, resultado);
    }

    public static void calcularPredio(String a, String b) {
        Scanner entrada = new Scanner(System.in);
        double inmueble;
        double operacion;
        System.out.println("Ingrese el costo del inmueble:");
        inmueble = entrada.nextDouble();
        operacion = inmueble * 0.2;
        System.out.printf("Cliente %s con cédula %s "
                + "tiene un bien inmueble valorado en %.2f y tiene que pagar "
                + "de predio $ %.2f", a, b, inmueble, operacion);
    
    }
}    

