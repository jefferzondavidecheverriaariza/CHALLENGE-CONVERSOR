package model;

import enums.Moneda;
import java.math.BigDecimal;

public class IniciadorConversionMonedas {

    private static final String PESO_COLOMBIANO_PARA_DOLAR = "De Peso Colombiano a Dólar";
    private static final String PESO_COLOMBIANO_PARA_EURO = "De Peso Colombiano a Euro";
    private static final String PESO_COLOMBIANO_PARA_LIBRA_ESTERLINA = "De Peso Colombiano a Libra Esterlina";
    private static final String PESO_COLOMBIANO_PARA_PESO_ARGENTINO = "De Peso Colombiano a Peso Argentino";
    private static final String PESO_COLOMBIANO_PARA_PESO_CHILENO = "De Peso Colombiano a Peso Chileno";
    private static final String PESO_COLOMBIANO_PARA_PESO_MEXICANO = "De Peso Colombiano a Peso Mexicano";
    private static final String DOLAR_PARA_PESO_COLOMBIANO = "De Dólar a Peso Colombiano";
    private static final String EURO_PARA_PESO_COLOMBIANO = "De Euro a Peso Colombiano";
    private static final String LIBRA_ESTERLINA_PARA_PESO_COLOMBIANO = "De Libra Esterlina a Peso Colombiano";
    private static final String PESO_ARGENTINO_PARA_PESO_COLOMBIANO = "De Peso Argentino a Peso Colombiano";
    private static final String PESO_CHILENO_PARA_PESO_COLOMBIANO = "De Peso Chileno a Peso Colombiano";
    private static final String PESO_MEXICANO_PARA_PESO_COLOMBIANO = "De Peso Mexicano a Peso Colombiano";
    private ConvertidorDeMoneda convertidorDeMonedaDolar = new ConvertidorDeMonedaDolar();
    private ConvertidorDeMoneda convertidorDeMonedaEuro = new ConvertidorDeMonedaEuro();
    private ConvertidorDeMoneda convertidorDeMonedaLibraEsterlina = new ConvertidorDeMonedaLibraEsterlina();
    private ConvertidorDeMoneda convertidorDeMonedaPesoArgentino = new ConvertidorDeMonedaPesoArgentino();
    private ConvertidorDeMoneda convertidorDeMonedaPesoChileno = new ConvertidorDeMonedaPesoChileno();
    private ConvertidorDeMoneda convertidorDeMonedaPesoMexicano = new ConvertidorDeMonedaPesoMexicano();

    private Moneda moneda;

    public BigDecimal operarConversion(String operacionMonedas, double valorInicial) throws Exception {

        switch (operacionMonedas) {
            case PESO_COLOMBIANO_PARA_DOLAR -> {
                return convertidorDeMonedaDolar.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESO_COLOMBIANO_PARA_EURO -> {
                return convertidorDeMonedaEuro.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESO_COLOMBIANO_PARA_LIBRA_ESTERLINA -> {
                return convertidorDeMonedaLibraEsterlina.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESO_COLOMBIANO_PARA_PESO_ARGENTINO -> {
                return convertidorDeMonedaPesoArgentino.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESO_COLOMBIANO_PARA_PESO_CHILENO -> {
                return convertidorDeMonedaPesoChileno.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESO_COLOMBIANO_PARA_PESO_MEXICANO -> {
                return convertidorDeMonedaPesoMexicano.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case DOLAR_PARA_PESO_COLOMBIANO -> {
                return convertidorDeMonedaDolar.convertirParaCOP(moneda, BigDecimal.valueOf(valorInicial));
            }
            case EURO_PARA_PESO_COLOMBIANO -> {
                return convertidorDeMonedaEuro.convertirParaCOP(moneda, BigDecimal.valueOf(valorInicial));
            }
            case LIBRA_ESTERLINA_PARA_PESO_COLOMBIANO -> {
                return convertidorDeMonedaLibraEsterlina.convertirParaCOP(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESO_ARGENTINO_PARA_PESO_COLOMBIANO -> {
                return convertidorDeMonedaPesoArgentino.convertirParaCOP(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESO_CHILENO_PARA_PESO_COLOMBIANO -> {
                return convertidorDeMonedaPesoChileno.convertirParaCOP(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESO_MEXICANO_PARA_PESO_COLOMBIANO -> {
                return convertidorDeMonedaPesoMexicano.convertirParaCOP(moneda, BigDecimal.valueOf(valorInicial));
            }
            default -> throw new Exception("Opción inválida");
        }

    }

}
