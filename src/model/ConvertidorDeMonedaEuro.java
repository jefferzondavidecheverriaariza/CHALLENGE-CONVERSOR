package model;

import enums.Moneda;

import java.math.BigDecimal;

public class ConvertidorDeMonedaEuro extends ConvertidorDeMoneda {
    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorMonedaR) {
        moneda = Moneda.EURO;
        return super.convertirParaMoneda(moneda, valorMonedaR);
    }

    @Override
    public BigDecimal convertirParaCOP(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.EURO;
        return super.convertirParaCOP(moneda, valorEnMoneda);
    }
}
