package org.example.operaciones;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.function.BiFunction;

public class OperacionDivision implements OperacionBinaria{

    private BigDecimal dividir(BigInteger num1, BigInteger num2)
    {
    }

    @Override
    public BigDecimal realizarOperacion(BigInteger num1, BigInteger num2) {
        return dividir(num1, num2);
    }
}
