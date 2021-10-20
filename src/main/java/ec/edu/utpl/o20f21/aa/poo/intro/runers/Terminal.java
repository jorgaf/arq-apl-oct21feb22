package ec.edu.utpl.o20f21.aa.poo.intro.runers;

import ec.edu.utpl.o20f21.aa.poo.intro.model.Cajero;
import ec.edu.utpl.o20f21.aa.poo.intro.model.Cliente;
import ec.edu.utpl.o20f21.aa.poo.intro.model.Factura;
import ec.edu.utpl.o20f21.aa.poo.intro.model.Producto;

import java.util.List;

public class Terminal {
    public static void main(String[] args) {
        Cajero cajero = new Cajero("jorgaf", "Jorge López", "2-532");
        Cliente cliente = new Cliente("Isabella", "San Sebastián", "Lourdes");
        List<Producto> productos = List.of(
                new Producto("Manzana", 0.25, 0, 5),
                new Producto("Pepsi", 1.05, 12, 2));
        Factura factura = new Factura("12-a.001", cliente, productos, cajero);

        printFactura(factura);

    }

    private static void printFactura(Factura factura) {
        System.out.println(factura.getCliente().getNombre());
        System.out.println(factura.getCliente().getDireccion());
        for(Producto p : factura.getProductos()) {
            System.out.printf("%d %-10s %.2f\n", p.getCantidad(), p.getDescripcion(), p.getPrecioUnitario());
        }
        System.out.printf("Subtotal: %.2f\n", factura.calcularSubtotal());
        System.out.printf("IVA(12%%): %.2f\n", factura.calcularIVA());
        System.out.printf("Total: %.2f\n", factura.calcularTotal());
    }
}
