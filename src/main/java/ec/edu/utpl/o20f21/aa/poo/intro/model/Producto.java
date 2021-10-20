package ec.edu.utpl.o20f21.aa.poo.intro.model;

public class Producto {
    private String descripcion;
    private double precioUnitario;
    private double porcentajeIVA;

    public int getCantidad() {
        return cantidad;
    }

    private int cantidad;

    public Producto(String descripcion, double precioUnitario, double porcentajeIVA, int cantidad) {
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.porcentajeIVA = porcentajeIVA;
        if(cantidad > 0 ) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 1;
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getPorcentajeIVA() {
        return porcentajeIVA;
    }

    public void setPorcentajeIVA(double porcentajeIVA) {
        this.porcentajeIVA = porcentajeIVA;
    }


}
