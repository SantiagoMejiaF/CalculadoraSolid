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
            // ;)
            System.out.println("\n\t\t\t.::CALCULADORA::." +
                    "\n\t\tOperaciones disponibles:" +
                    "\n\t\t\t   Division" +
                    "\n\t\t\t   Modulo" +
                    "\n\t\t\t   Multiplicacion" +
                    "\n\t\t\t   Potencia" +
                    "\n\t\t\t   Raiz" +
                    "\n\t\t\t   Resta" +
                    "\n\t\t\t   Suma" +
                    "\n\t\t\t   Salir" +
                    "\n\nEscriba la operación que desea realizar:");
            Scanner myObj = new Scanner(System.in);
            opcion = myObj.next();
            if (!opcion.equalsIgnoreCase("Salir")) {
                if (opcion.equals("Division") || opcion.equals("Modulo") || opcion.equals("Multiplicacion") || opcion.equals("Potencia")
                        || opcion.equals("Raiz") || opcion.equals("Resta") || opcion.equals("Suma")) {
                    Scanner numero1 = new Scanner(System.in);
                    System.out.println("\nInserte el 1er número de la operación:");
                    try {
                        num1 = numero1.nextInt();
                    } catch (Exception a) {
                        System.out.println("No has digitado un número.");
                        try {
                            Thread.sleep(1500);
                        } catch (Exception ignored) {}
                        continue;
                    }
                    Scanner numero2 = new Scanner(System.in);
                    System.out.println("\nInserte el 2do número de la operación:");
                    try {
                        num2 = numero2.nextInt();
                    } catch (Exception b) {
                        System.out.println("No has digitado un número.");
                        try {
                            Thread.sleep(1500);
                        } catch (Exception ignored) {}
                        continue;
                    }

                    System.out.println("\nEl resultado es: " + facade.ejecutarOperacionBinaria(opcion, new BigInteger(String.valueOf(num1)),
                            new BigInteger(String.valueOf(num2))));

                    try {
                        Thread.sleep(2500);
                    } catch (Exception ignored) {}
                }
                else{
                    System.out.println("\nNo has escrito correctamente la operación o no has escrito una operación." +
                            "\n(Recuerda escribir exactamente como se imprime en el menú)");
                    try {
                        Thread.sleep(1500);
                    } catch (Exception ignored) {}
                }

            }
            //System.out.println("El resultado de la operacion es " + operacionBinaria.realizarOperacion(new BigInteger(String.valueOf(num1)), new BigInteger(String.valueOf(num2))));
        } while (!opcion.equalsIgnoreCase("Salir"));
    }
}
