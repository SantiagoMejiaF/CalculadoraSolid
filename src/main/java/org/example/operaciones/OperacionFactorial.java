package org.example.operaciones;

import java.math.BigDecimal;
import java.math.BigInteger;

public class OperacionFactorial implements OperacionUnaria {

    private BigDecimal ejecutarFactorial(BigInteger num1) {
        if(num1.intValue() <= 1)
            return BigDecimal.ONE;
        BigDecimal resultado = BigDecimal.valueOf(num1.intValue());
        for(int i = 1; i < num1.intValue(); i++){
            resultado = BigDecimal.valueOf(i).multiply(BigDecimal.valueOf(i+1));
        }
        return resultado;
    }

    @Override
    public BigDecimal ejecutarOperacionUnaria(BigInteger num1) {
        return ejecutarFactorial(num1);
    }

}