package org.example.operaciones;

import java.math.BigDecimal;
import java.math.BigInteger;

public interface OperacionUnaria extends OperacionAritmetica {

    BigDecimal ejecutarOperacionUnaria(BigInteger num1);
}
