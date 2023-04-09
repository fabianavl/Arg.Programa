package clasesiete;

import java.time.LocalDate;

public class ComprasCarrito {

    public static void main(String[] args) {

        //los productos del supermercado
        Producto productoUno = new Producto("Queso", 160.30, 325);
        Producto productoDos = new Producto("Cereales", 200.40, 324);
        Producto productoTres = new Producto("Dulce de leche", 351.05, 555);
        Producto productoCuatro = new Producto("Pan", 300.05, 595);

        //llega el cliente 
        Cliente compradorUno = new Cliente("Maria Rodriguez", 45879203, "Calle falsa 123");

        //el cliente toma un carrito de compras
        Carrito carritoUno = new Carrito(562, compradorUno);

        //empieza la carga de items en el carrito: cargar 3 productos
        ItemCarrito item[] = new ItemCarrito[3];
        item[0] = new ItemCarrito(carritoUno, productoUno, 3);
        item[1] = new ItemCarrito(carritoUno, productoCuatro, 2);
        item[2] = new ItemCarrito(carritoUno, productoTres, 5);

        //metodo para mostrar la compra
        mostrarCompra(item, carritoUno, compradorUno);
    }

    public static void mostrarCompra(ItemCarrito cargaItem[], Carrito carritoUno, Cliente compradorUno) {

        System.out.println("Carro de compras:" + carritoUno.getIdCarrito() + " Comprador:" + compradorUno.getNombre());
        for (ItemCarrito items : cargaItem) {
            items.mostrarItem();
            //utilizamos met. setter para modificara montoItem de la clase Carrito
            carritoUno.sumarMonto(items);
        }
        System.out.println("El total: " + carritoUno.getMontoItemTotal());

        LocalDate diaDeDescuento = LocalDate.now();
        int descuento = diaDeDescuento.getDayOfMonth();
        //si dia es impar es descuento fijo, si no esdescuento x porcentaje
        if (descuento % 2 != 0) {
            Descuento dFijo = new DescuentoFijo();
            dFijo.setMontoDescuento(100); //descuento en $
            System.out.println("El monto con descuento es: " + dFijo.montoFinal(carritoUno.getMontoItemTotal()));
        } else {
            Descuento dPorcentaje = new DescuentoPorcentaje();
            dPorcentaje.setMontoDescuento(0.5);
            System.out.println("Descuento con porcentaje: " + dPorcentaje.montoFinal(carritoUno.getMontoItemTotal()));
        }
    }

}
