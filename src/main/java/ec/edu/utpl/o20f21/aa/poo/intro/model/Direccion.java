package ec.edu.utpl.o20f21.aa.poo.intro.model;

public class Direccion {
    private String provincia;
    private String canton;
    private String barrio;
    private String callePrincipal;
    private String nro;
    private String calleSecundaria;

    public Direccion(String barrio, String callePrincipal) {
        this.setProvincia("Loja");
        this.setCanton("Loja");
        this.setBarrio(barrio);
        this.setCallePrincipal(callePrincipal);
    }


    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getCallePrincipal() {
        return callePrincipal;
    }

    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }
}
