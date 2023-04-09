package clasesiete;


public class Carrito {
    
    private int idCarrito;
    private Cliente comprador; //no crear met. getter ya que es un objeto y esta instanciado en ComprasCarrito
    private double montoItemTotal; //se va a usar en itemCarrito

    public Carrito(int idCarrito, Cliente comprador) {
        this.idCarrito = idCarrito;
        this.comprador = comprador;
        montoItemTotal = 0.0;
    }

    public int getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(int idCarrito) {
        this.idCarrito = idCarrito;
    }

    public double getMontoItemTotal() {
        return montoItemTotal;
    }

    public void sumarMonto (ItemCarrito montoItem) {
        montoItemTotal = montoItemTotal + montoItem.getMontoItem();
    }                                   //montoItem.getMontoItem(clase ItemCarrito)    
    
    
        
}
