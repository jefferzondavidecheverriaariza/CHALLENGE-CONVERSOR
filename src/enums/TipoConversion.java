package enums;

public enum TipoConversion {
    PESO_COLOMBIANO_PARA_DOLAR("De Peso Colombiano a Dólar"),
    PESO_COLOMBIANO_PARA_EURO("De Peso Colombiano a Euro"),
    PESO_COLOMBIANO_PARA_LIBRA_ESTERLINA("De Peso Colombiano a Libra Esterlina"),
    PESO_COLOMBIANO_PARA_PESO_ARGENTINO("De Peso Colombiano a Peso Argentino"),
    PESO_COLOMBIANO_PARA_PESO_CHILENO("De Peso Colombiano a Peso Chileno"),
    PESO_COLOMBIANO_PARA_PESO_MEXICANO("De Peso Colombiano a Peso Mexicano"),
    DOLAR_PARA_PESO_COLOMBIANO("De Dólar a Peso Colombiano"),
    EURO_PARA_PESO_COLOMBIANO("De Euro a Peso Colombiano"),
    LIBRA_ESTERLINA_PARA_PESO_COLOMBIANO("De Libra Esterlina a Peso Colombiano"),
    PESO_ARGENTINO_PARA_PESO_COLOMBIANO("De Peso Argentino a Peso Colombiano"),
    PESO_CHILENO_PARA_PESO_COLOMBIANO("De Peso Chileno a Peso Colombiano"),
    PESO_MEXICANO_PARA_PESO_COLOMBIANO("De Peso Mexicano a Peso Colombiano"),

    CELSIUS_PARA_FAHRENHEIT("Celsius a Fahrenheit"),
    CELSIUS_PARA_KELVIN("Celsius a Kelvin"),
    KELVIN_PARA_FAHRENHEIT("Kelvin a Fahrenheit"),
    KELVIN_PARA_CELSIUS("Kelvin a Celsius"),
    FAHRENHEIT_PARA_CELSIUS("Fahrenheit a Celsius"),
    FAHRENHEIT_PARA_KELVIN("Fahrenheit a Kelvin");

    private String descripcion;

    TipoConversion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
