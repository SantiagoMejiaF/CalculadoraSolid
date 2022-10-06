package org.example.operaciones;

import java.math.BigDecimal;
import java.math.BigInteger;

public interface OperacionBinaria extends OperacionAritmetica {

    BigDecimal realizarOperacion(BigInteger num1, BigInteger num2);

}
