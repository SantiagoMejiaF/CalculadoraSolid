package org.example.operaciones;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.function.BiFunction;

public class OperacionPotencia implements OperacionBinaria{

    private BigDecimal realizarPotencia(BigInteger num1, BigInteger num2)
    {
        BiFunction<BigInteger, BigInteger, BigDecimal> potenciar = (n1, n2) ->
                new BigDecimal(n1.pow(n2.intValue()));
        return potenciar.apply(num1, num2);
    }

    @Override
    public BigDecimal realizarOperacion(BigInteger num1, BigInteger num2) {
        return realizarPotencia(num1, num2);
    }
}
