package model;

import enums.Moneda;
import interfaces.MonedaConvertible;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConvertidorDeMoneda implements MonedaConvertible {

    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorMonedaR) {
        return valorMonedaR.divide(moneda.getFACTOR_CONVERSION(), 2, RoundingMode.HALF_UP);
    }

    public BigDecimal convertirParaCOP(Moneda moneda, BigDecimal valorMoneda) {
        return valorMoneda.multiply(moneda.getFACTOR_CONVERSION());
    };

}
