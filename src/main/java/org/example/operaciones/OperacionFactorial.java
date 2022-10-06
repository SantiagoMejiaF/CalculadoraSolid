package org.example.operaciones;

import java.math.BigDecimal;
import java.math.BigInteger;

public class OperacionFactorial implements OperacionUnaria {

    private BigDecimal ejecutarFactorial(BigInteger num1) {
        if(num1.intValue() <= 1)
            return BigDecimal.ONE;
        BigDecimal resultado = new BigDecimal(9);
        for(int i = 1; i < num1.intValue(); i++){
            //TODO
        }
        return resultado;
    }

    @Override
    public BigDecimal ejecutarOperacionUnaria(BigInteger num1) {
        return null;
    }

}