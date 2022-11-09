package org.example.menu;

import org.example.facade.CalculadoraFacade;
import org.example.facade.FacadeCalculadoraCompleta;
import org.example.facade.FacadeOperacionBinaria;

import java.math.BigInteger;
import java.util.Scanner;

public class MenuCalculadora {



    private FacadeCalculadoraCompleta facade;

    public MenuCalculadora() {
        facade = new CalculadoraFacade();
    }

   public void imprimirMenu()  {
        //MENU
        String opcion;
        int num1 = 0, num2 = 0;
        do {

            System.out.println("Calculdora\n 1. Suma\n 2. Resta\n " +
                    "3.Multiplicacion\n 4.Division\n " +
                    "5.Modulo\n 6.Potencia \n 7.Raiz \n 8.Salir\n");
            Scanner myObj = new Scanner(System.in);
            opcion = myObj.next();
            if (!opcion.equalsIgnoreCase("Salir")) {
                System.out.println("Inserte numero1, click en entre, y coloque numero2");
                Scanner numero1 = new Scanner(System.in);
                Scanner numero2 = new Scanner(System.in);
                num1 = numero1.nextInt();
                num2 = numero2.nextInt();

                System.out.println("El resultado es " + facade.ejecutarOperacionBinaria(opcion, new BigInteger(String.valueOf(num1)),
                        new BigInteger(String.valueOf(num2))));
            }

            //System.out.println("El resultado de la operacion es " + operacionBinaria.realizarOperacion(new BigInteger(String.valueOf(num1)), new BigInteger(String.valueOf(num2))));
        } while (!opcion.equalsIgnoreCase("Salir"));
    }
}
