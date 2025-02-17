package modelo;

public class RedesSocial {
    private String nombre;
    private String enlace;

    public RedesSocial(String nombre, String enlace) {
        this.nombre = nombre;
        this.enlace = enlace;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEnlace() { return enlace; }
    public void setEnlace(String enlace) { this.enlace = enlace; }

    public void mostrarRedSocial() {
        System.out.println("🌐 " + nombre + ": " + enlace);
    }
}

