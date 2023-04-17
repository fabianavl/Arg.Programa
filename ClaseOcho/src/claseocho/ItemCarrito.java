package claseocho;

public class ItemCarrito {
    //c/producto que esta asociado al Carrito

    private Carrito idCarrito;
    private Producto itemProducto;
    private int cantidadProducto;
    private double montoItem;

    public ItemCarrito(Carrito id, Producto items, int cantidadProducto) {
        this.idCarrito = id;
        this.itemProducto = items;
        this.cantidadProducto = cantidadProducto;
        montoItem = itemProducto.getPrecio() * cantidadProducto; //($ del producto * cantidad de prod. = precio de clase Producto)
    }

    public double getMontoItem() {
        return montoItem;
    }

    public void setMontoItem(double montoItem) {
        this.montoItem = montoItem;
    }

    public void mostrarItem() {
        System.out.println("Producto:" + itemProducto.getNombreProducto() + " Cantidad:" + cantidadProducto
                + " Precio:" + itemProducto.getPrecio() + " Total:" + montoItem);
    }

}
