package model;

import enums.Moneda;

import java.math.BigDecimal;

public class ConvertidorDeMonedaPesoArgentino extends ConvertidorDeMoneda {

    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorMonedaR) {
        moneda = Moneda.PESO_ARGENTINO;
        return super.convertirParaMoneda(moneda, valorMonedaR);
    }

    @Override
    public BigDecimal convertirParaCOP(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.PESO_ARGENTINO;
        return super.convertirParaCOP(moneda, valorEnMoneda);
    }
}
