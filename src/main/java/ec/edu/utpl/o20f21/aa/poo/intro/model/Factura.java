package ec.edu.utpl.o20f21.aa.poo.intro.model;

import java.time.LocalDate;
import java.util.List;

public class Factura {
    private String nro;
    private LocalDate fecha;
    private String nroPedido;
    private LocalDate fechaVence;
    private Cliente cliente;
    private List<Producto> productos;
    private Cajero cajero;

    public Factura(String nroPedido, Cliente cliente, List<Producto> productos, Cajero cajero) {
        fecha = LocalDate.now();
        this.nroPedido = nroPedido;
        this.cliente = cliente;
        this.productos = productos;
        fechaVence = fecha.plusDays(15);
        this.cajero = cajero;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getNroPedido() {
        return nroPedido;
    }

    public void setNroPedido(String nroPedido) {
        this.nroPedido = nroPedido;
    }

    public LocalDate getFechaVence() {
        return fechaVence;
    }

    public void setFechaVence(LocalDate fechaVence) {
        this.fechaVence = fechaVence;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public double calcularSubtotal() {
        var subtotal = 0.0;
        for(Producto p : productos) {
            subtotal += p.getPrecioUnitario() * p.getCantidad();
        }
        return subtotal;
    }

    public double calcularIVA() {
        return productos.stream()
                .filter(p -> p.getPorcentajeIVA() != 0)
                .reduce(0.0,
                        (subtotal, producto) -> subtotal + ((producto.getPrecioUnitario() * producto.getPorcentajeIVA() / 100) * producto.getCantidad()),
                        Double::sum);
    }

    public double calcularTotal() {
        return calcularSubtotal() + calcularIVA();
    }
}
