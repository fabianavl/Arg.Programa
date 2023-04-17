package claseocho;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ComprasCarrito {

    public static void main(String[] args) {

        //los productos del supermercado
        Producto productoUno = new Producto("Queso", 160.30, 325);
        Producto productoDos = new Producto("Cereales", 200.40, 324);
        Producto productoTres = new Producto("Dulce de leche", 351.05, 555);
        Producto productoCuatro = new Producto("Pan", 300.05, 595);
        Producto productoCinco = new Producto("Galletitas dulces", 310.15, 556);
        Producto productoSeis = new Producto("Yerba", 200.20, 557);

        //llega el cliente 
        Cliente compradorUno = new Cliente("Maria Rodriguez", 45879203, "Calle falsa 123");

        //el cliente toma un carrito de compras
        Carrito carritoUno = new Carrito(562, compradorUno);

        //declaramos la coleccion lista
        List<ItemCarrito> listaItemCarrito = new ArrayList<>();
        //damos de ALTA los items
        ItemCarrito item1 = new ItemCarrito(carritoUno, productoUno, 3);
        ItemCarrito item2 = new ItemCarrito(carritoUno, productoCuatro, 2);
        ItemCarrito item3 = new ItemCarrito(carritoUno, productoDos, 5);
        ItemCarrito item4 = new ItemCarrito(carritoUno, productoCinco, 3);
        ItemCarrito item5 = new ItemCarrito(carritoUno, productoSeis, 2);
        ItemCarrito item6 = new ItemCarrito(carritoUno, productoTres, 5);
        //cargamos a la List a traves de .add
        listaItemCarrito.add(item1);
        listaItemCarrito.add(item2);
        listaItemCarrito.add(item3);
        listaItemCarrito.add(item4);
        listaItemCarrito.add(item5);
        listaItemCarrito.add(item6);

        mostrarCompra(listaItemCarrito, carritoUno, compradorUno);

    }

    public static void mostrarCompra(List listaItemCarrito, Carrito carritoUno, Cliente compradorUno) {

        System.out.println("Carro de compras:" + carritoUno.getIdCarrito() + " Comprador:" + compradorUno.getNombre());

        //recorremos la lista a traves del metodo iterator();
        Iterator<ItemCarrito> lIC = listaItemCarrito.iterator();
        while (lIC.hasNext()) { //recorro la lista mostrando los items
            ItemCarrito item = lIC.next();
            item.mostrarItem();
            carritoUno.sumarMonto(item);
        }

        System.out.println("El total: " + carritoUno.getMontoItemTotal());

        //excepciones
        if (carritoUno.getMontoItemTotal() > 0) {

            LocalDate diaDeDescuento = LocalDate.now();

            int descuento = diaDeDescuento.getDayOfMonth();
            if (descuento % 2 != 0) {
                Descuento dFijo = new DescuentoFijo();
                dFijo.setMontoDescuento(100);

                double montoDescFijo = dFijo.montoFinal(carritoUno.getMontoItemTotal());
                if (montoDescFijo > 0) {
                    System.out.println("El monto con descuento es: " + montoDescFijo);
                } else {
                    System.out.println("El descuento no se puede aplicar a este carro de compras");
                }

            } else {
                Descuento dPorcentaje = new DescuentoPorcentaje();
                dPorcentaje.setMontoDescuento(1.0);
                double montoDescPorcentaje = dPorcentaje.montoFinal(carritoUno.getMontoItemTotal());
                if (montoDescPorcentaje > 0) {
                    System.out.println("El monto con descuento con porcentaje es: " + montoDescPorcentaje);
                } else {
                    System.out.println("El descuento no se puede aplicar a este carro de compras");
                }
            }
        } else {
            System.out.println("No es posible aplicar descuento en un monto negativo");
        }

    }

}
