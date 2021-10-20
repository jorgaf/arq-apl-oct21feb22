package ec.edu.utpl.o20f21.aa.poo.intro.model;

public class Cliente {
    private String nombre;
    private Direccion direccion;
    private String telefono;

    public Cliente(String nombre, String barrio, String callePrincipal) {
        this.nombre = nombre;
        direccion = new Direccion(barrio, callePrincipal);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return String.format("%s (%s)", direccion.getBarrio(), direccion.getCallePrincipal());
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
