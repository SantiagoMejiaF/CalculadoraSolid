package org.example.menu;

import org.example.facade.CalculadoraFacade;
import org.example.facade.FacadeCalculadoraCompleta;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class MenuCalculadora {

    private FacadeCalculadoraCompleta facade;
    public final String opciones[] = { "Suma", "Resta", "Multiplicacion", "Division", "Factorial", "Potencia", "Raiz", "Salir" };

    public MenuCalculadora() {
        facade = new CalculadoraFacade();
    }
    
    public void imprimirOpciones(){
        System.out.println("Seleccione una opcion");
        for (int i = 0; i < opciones.length; i++) {
            System.out.println(i + 1 + ". " + opciones[i]);
        }
    }

   public void imprimirMenu()  {
       //MENU
        String opcion;
        Scanner scan = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        do {
            String mensaje = "Hasta luego!";
            BigDecimal resultado = BigDecimal.ZERO;
            imprimirOpciones();
            opcion = scan.next();
            // Default case
            if (!Arrays.stream(opciones).anyMatch(opcion::equals)){
                System.out.println("Opcion invalida");
                continue;
            }
            if (opcion.equalsIgnoreCase("Salir")) {
                System.out.println(mensaje);
                break;
            }
            // Unary operations
            if(opcion.equalsIgnoreCase("Factorial")) {
                System.out.println("Inserte numero");
                num1 = scan.nextInt();
                resultado = facade.ejecucionOperacionUnaria(opcion, new BigInteger(String.valueOf(num1)));
            }else
            // Binary operations
            {
                System.out.println("Inserte numero 1");
                num1 = scan.nextInt();
                System.out.println("Inserte numero 2");
                num2 = scan.nextInt();
                resultado = facade.ejecutarOperacionBinaria(opcion, new BigInteger(String.valueOf(num1)), new BigInteger(String.valueOf(num2)));
            }
            mensaje = "El resultado es " + resultado;
            System.out.println(mensaje);
        } while (!opcion.equalsIgnoreCase("Salir"));
        scan.close();
    }
}
