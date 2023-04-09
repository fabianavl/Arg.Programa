package clasesiete;


public class DescuentoPorcentajeConTope extends Descuento {

    @Override
    public double montoFinal(double montoInicial) {
        double descuentoConTope = montoInicial - (montoInicial * this.getMontoDescuento());
        
        if(descuentoConTope > 500) {
            return 500;
        } else {
            return descuentoConTope;
        }
    }
    
}
