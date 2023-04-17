package claseocho;


public class Producto {
    
    private String nombreProducto;
    private double precio;
    private int codigo;

    public Producto(String nombreProducto, double precio, int codigo) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.codigo = codigo;
    }
    
    
    //getters y setters

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombre(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
}
