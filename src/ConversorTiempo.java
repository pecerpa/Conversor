public class ConversorTiempo extends Conversor{

    @Override
    public double convertir(Double value) {
        System.out.println("Tiempo");
        return value/60;

    }

    @Override
    public double revertir(Double value) {
        return  value*60;
    }
}
