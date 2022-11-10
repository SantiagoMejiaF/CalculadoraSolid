package org.example.operaciones;

import java.math.BigDecimal;
import java.math.BigInteger;

public class OperacionRaiz implements OperacionBinaria{
    @Override
    public BigDecimal realizarOperacion(BigInteger num1, BigInteger num2) {
        return this.root(num1, num2);

    }
    private BigDecimal root(BigInteger num1, BigInteger num2) {
        BigDecimal resultado = BigDecimal.valueOf(Math.pow(num1.doubleValue(), 1.0/num2.doubleValue()));
        resultado = BigDecimal.valueOf(Math.round(resultado.doubleValue()));
        return resultado;
    }
}
