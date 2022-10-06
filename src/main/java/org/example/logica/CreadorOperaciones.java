package org.example.logica;

import org.example.operaciones.OperacionAritmetica;
import org.example.operaciones.OperacionBinaria;
import org.example.operaciones.OperacionUnaria;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class CreadorOperaciones {

    public static BigDecimal ejecutarOperacion(String operacion ,BigInteger num1, BigInteger num2) {
        Optional<OperacionBinaria> respuesta = (Optional<OperacionBinaria>) getInstanciaOperacion(operacion);
        if(respuesta.isPresent())
            return respuesta.get().realizarOperacion(num1, num2);
        throw new RuntimeException("Operacion no valida " + operacion);
    }

    public static BigDecimal ejecutarOperacion(String operacion, BigInteger num1) {
        Optional<OperacionUnaria> respuesta = (Optional<OperacionUnaria>) getInstanciaOperacion(operacion);
        if(respuesta.isPresent())
            return respuesta.get().ejecutarOperacionUnaria(num1);
        throw new RuntimeException("Operacion no valida " + operacion);
    }




    private static Optional<?> getInstanciaOperacion(String operacion) {
        try {
            OperacionAritmetica operacionAritmetica = (OperacionAritmetica)
                    Class.forName("org.example.operaciones.Operacion" + operacion).newInstance();
            return Optional.of(operacionAritmetica);
        }
        catch (ClassNotFoundException ce) {
            System.out.println("Operacion no valida " + operacion);
        }
        catch (InstantiationException | IllegalAccessException e) {
            System.out.println("Error al acceder a la operacion");
        }
        return Optional.empty();
    }
}
