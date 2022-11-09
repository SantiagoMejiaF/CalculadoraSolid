package org.example.operaciones;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.function.BiFunction;

public class OperacionSuma implements OperacionBinaria{

    private BigDecimal sumar(BigInteger num1, BigInteger num2)
    {
        BiFunction<BigInteger, BigInteger, BigDecimal> sumar = (n1, n2) ->
                new BigDecimal(n1.add(n2));
        return sumar.apply(num1, num2);
    }

    @Override
    public BigDecimal realizarOperacion(BigInteger num1, BigInteger num2) {
        return sumar(num1, num2);
    }
}
