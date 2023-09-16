import enums.TipoConversion;
import model.*;
import javax.swing.*;
import java.math.BigDecimal;
import java.awt.*;

public class Principal {

    public static void main(String[] args) throws Exception {

        // Configurar la apariencia de los diálogos
        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.PLAIN, 18));
        UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 18));
        UIManager.put("OptionPane.messageForeground", Color.BLUE);

        String conversionDeMoneda = "Convertir moneda";
        String conversionDeTemperatura = "Convertir temperatura";

        boolean ejecuta = true;

        Repetidor repetidor = new Repetidor();

        while (ejecuta) {
            String operacion = JOptionPane.showInputDialog(null, "Elige la operación",
                    "Conversiones", JOptionPane.QUESTION_MESSAGE, null,
                    new String[] { conversionDeMoneda, conversionDeTemperatura }, "Elección").toString();

            if (operacion.equals(conversionDeMoneda)) {
                IniciadorConversionMonedas iniciadorConversionMonedas = new IniciadorConversionMonedas();
                String operacionMonedas = JOptionPane.showInputDialog(null, "Elige una moneda",
                        "Monedas", JOptionPane.QUESTION_MESSAGE, null, new String[] {
                                TipoConversion.PESO_COLOMBIANO_PARA_DOLAR.getDescripcion(),
                                TipoConversion.PESO_COLOMBIANO_PARA_EURO.getDescripcion(),
                                TipoConversion.PESO_COLOMBIANO_PARA_LIBRA_ESTERLINA.getDescripcion(),
                                TipoConversion.PESO_COLOMBIANO_PARA_PESO_ARGENTINO.getDescripcion(),
                                TipoConversion.PESO_COLOMBIANO_PARA_PESO_CHILENO.getDescripcion(),
                                TipoConversion.PESO_COLOMBIANO_PARA_PESO_MEXICANO.getDescripcion(),
                                TipoConversion.DOLAR_PARA_PESO_COLOMBIANO.getDescripcion(),
                                TipoConversion.EURO_PARA_PESO_COLOMBIANO.getDescripcion(),
                                TipoConversion.LIBRA_ESTERLINA_PARA_PESO_COLOMBIANO.getDescripcion(),
                                TipoConversion.PESO_ARGENTINO_PARA_PESO_COLOMBIANO.getDescripcion(),
                                TipoConversion.PESO_CHILENO_PARA_PESO_COLOMBIANO.getDescripcion(),
                                TipoConversion.PESO_MEXICANO_PARA_PESO_COLOMBIANO.getDescripcion() },
                        "Escolha").toString();

                String valorString = JOptionPane.showInputDialog("Digite un valor");
                Validador validador = new Validador();
                if (!validador.verificar(valorString)) {
                    JOptionPane.showMessageDialog(null, "Valor Inválido");
                } else {
                    double valorInicial = validador.transformarEnDouble(valorString);
                    BigDecimal valorConvertido = iniciadorConversionMonedas.operarConversion(operacionMonedas,
                            valorInicial);
                    JOptionPane.showMessageDialog(null, valorConvertido);
                }
            } else if (operacion.equals(conversionDeTemperatura)) {
                IniciadorConversionTemperatura iniciadorConversionTemperatura = new IniciadorConversionTemperatura();
                String operacionTemperaturas = JOptionPane.showInputDialog(null, "Elige la escala de temperatura",
                        "Monedas", JOptionPane.QUESTION_MESSAGE, null, new String[] {
                                TipoConversion.CELSIUS_PARA_FAHRENHEIT.getDescripcion(),
                                TipoConversion.CELSIUS_PARA_KELVIN.getDescripcion(),
                                TipoConversion.FAHRENHEIT_PARA_CELSIUS.getDescripcion(),
                                TipoConversion.FAHRENHEIT_PARA_KELVIN.getDescripcion(),
                                TipoConversion.KELVIN_PARA_CELSIUS.getDescripcion(),
                                TipoConversion.KELVIN_PARA_FAHRENHEIT.getDescripcion(), },
                        "Elección").toString();

                String valorString = JOptionPane.showInputDialog("Digíte un valor");
                Validador validador = new Validador();
                if (!validador.verificar(valorString)) {
                    JOptionPane.showMessageDialog(null, "Valor Inválido");
                } else {
                    double valorInicial = validador.transformarEnDouble(valorString);
                    double valorConvertido = iniciadorConversionTemperatura.operarConversion(operacionTemperaturas,
                            valorInicial);
                    JOptionPane.showMessageDialog(null, valorConvertido);
                }
            }
            ejecuta = repetidor.intentaRepetir();
        }

    }
}
