package model;

import enums.Moneda;

import java.math.BigDecimal;

public class ConvertidorDeMonedaDolar extends ConvertidorDeMoneda {

    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorMonedaR) {
        moneda = Moneda.DOLAR;
        return super.convertirParaMoneda(moneda, valorMonedaR);
    }

    @Override
    public BigDecimal convertirParaCOP(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.DOLAR;
        return super.convertirParaCOP(moneda, valorEnMoneda);
    }
}
