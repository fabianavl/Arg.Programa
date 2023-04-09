package clasesiete;

//clase abstracta
public abstract class Descuento {
    
    private double montoDescuento; //el monto que se va a descontar

    public double getMontoDescuento() {
        return montoDescuento;
    }

    public void setMontoDescuento(double montoDescuento) {
        this.montoDescuento = montoDescuento;
    }

//método abtracto
    public abstract double montoFinal(double montoInicial);
    
}
