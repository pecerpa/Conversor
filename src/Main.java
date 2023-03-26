import javax.swing.*;

public class Main {



    public static void main(String[] args) {


        String[] menu = {"Moneda", "Tiempo"};

        int tipo = JOptionPane.showOptionDialog(null, "Selecciona el tipo de conversor", "Conversor", JOptionPane.OK_OPTION, JOptionPane.DEFAULT_OPTION, null, menu, menu[0]);

            if(tipo == 0) {
                String[] option = {"Peso a Dolar", "Dolar a Peso"};
                int selection = JOptionPane.showOptionDialog(null, "Selecciona el tipo de conversor", "Conversor", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option, option[0]);

                if (selection == 0) {
                    Double peso = 0.0;
                    ConversorMoneda conversorMoneda = new ConversorMoneda();
                    try {
                        peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el monto a convertir"));
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Solo puedes ingresar numeros");
                        main(args);
                    }
                    JOptionPane.showMessageDialog(null, "$ " + conversorMoneda.convertir(peso));
                } else if (selection == 1) {
                    Double dolar = 0.0;
                    ConversorMoneda conversorMoneda = new ConversorMoneda();
                    try {
                        dolar = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el monto a convertir"));
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Solo puedes ingresar numeros");
                        main(args);
                    }
                    JOptionPane.showMessageDialog(null, "$ " + conversorMoneda.revertir(dolar));
                }
            }

            else if(tipo == 1) {
                String[] option = {"Minutos a Horas", "Horas a Minutos"};
                int selection = JOptionPane.showOptionDialog(null, "Selecciona el tipo de conversor", "Conversor", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option, option[0]);

                if (selection == 0) {
                    Double minutos = 0.0;
                    ConversorTiempo conversor = new ConversorTiempo();
                    try {
                        minutos = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el monto a convertir"));
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Solo puedes ingresar numeros");
                        main(args);
                    }
                    JOptionPane.showMessageDialog(null,  conversor.convertir(minutos)+" H ");
                } else if (selection == 1) {
                    Double horas = 0.0;
                    ConversorTiempo conversor = new ConversorTiempo();
                    try {
                        horas = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el monto a convertir"));
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Solo puedes ingresar numeros");
                        main(args);
                    }
                    JOptionPane.showMessageDialog(null, conversor.revertir(horas)+"M");

                }
        }
    }


}
