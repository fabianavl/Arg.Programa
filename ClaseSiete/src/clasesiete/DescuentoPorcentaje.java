package clasesiete;


public class DescuentoPorcentaje extends Descuento {

    @Override
    public double montoFinal(double montoInicial) {

        return montoInicial - (montoInicial * this.getMontoDescuento());

    }
    
}
