package org.example.operaciones;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.function.BiFunction;

public class OperacionResta implements OperacionBinaria {

    private BigDecimal restar(BigInteger num1, BigInteger num2) {
        BiFunction<BigInteger, BigInteger, BigDecimal> restar = (n1, n2) ->
                new BigDecimal(n1.subtract(n2));
        return restar.apply(num1, num2);
    }

    @Override
    public BigDecimal realizarOperacion(BigInteger num1, BigInteger num2) {
        return restar(num1, num2);
    }
}
