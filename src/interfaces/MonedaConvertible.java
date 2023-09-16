package interfaces;

import enums.Moneda;

import java.math.BigDecimal;

public interface MonedaConvertible {

    BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorMonedaR);

    BigDecimal convertirParaCOP(Moneda moneda, BigDecimal valorMoneda);

}
