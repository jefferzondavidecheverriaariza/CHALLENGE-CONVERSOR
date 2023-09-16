package model;

import enums.Moneda;

import java.math.BigDecimal;

public class ConvertidorDeMonedaPesoMexicano extends ConvertidorDeMoneda {

    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorMoendaR) {
        moneda = Moneda.PESO_MEXICANO;
        return super.convertirParaMoneda(moneda, valorMoendaR);
    }

    @Override
    public BigDecimal convertirParaCOP(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.PESO_MEXICANO;
        return super.convertirParaCOP(moneda, valorEnMoneda);
    }
}