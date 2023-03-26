public class ConversorMoneda extends Conversor {
    @Override
    public double convertir(Double value) {
        return value / 5000;
    }

    @Override
    public double revertir(Double value) {
        return value * 5000;
    }

}
