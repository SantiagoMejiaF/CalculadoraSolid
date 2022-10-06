package org.example.operaciones;

import java.math.BigDecimal;
import java.math.BigInteger;

public class OperacionRaiz implements OperacionBinaria{
    @Override
    public BigDecimal realizarOperacion(BigInteger num1, BigInteger num2) {
        return BigDecimal.valueOf(num1.pow(1/ num2.intValue()).doubleValue());
    }
}
