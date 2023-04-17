package claseocho;


public class DescuentoPorcentajeConTope extends Descuento {

    @Override
    public double montoFinal(double montoInicial) {
        double descuentoConTope = montoInicial - (montoInicial * this.getMontoDescuento());
        
        if(descuentoConTope > 5000) {
            return 5000;
        } else {
            return descuentoConTope;
        }
    }
    
}
