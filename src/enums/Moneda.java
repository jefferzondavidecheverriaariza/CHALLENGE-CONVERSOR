package enums;
import java.math.BigDecimal;

public enum Moneda {

    DOLAR(BigDecimal.valueOf(4118.64)),
    EURO(BigDecimal.valueOf(4485.82)),
    LIBRA_ESTERLINA(BigDecimal.valueOf(5244.68)),
    PESO_ARGENTINO(BigDecimal.valueOf(11.79)),
    PESO_CHILENO(BigDecimal.valueOf(4.73)),
    PESO_MEXICANO(BigDecimal.valueOf(241.45));

    private BigDecimal FACTOR_CONVERSION;

    Moneda(BigDecimal FACTOR_CONVERSION) {
        this.FACTOR_CONVERSION = FACTOR_CONVERSION;
    }

    public BigDecimal getFACTOR_CONVERSION() {
        return FACTOR_CONVERSION;
    }
}
