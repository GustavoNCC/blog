package modelo;

import java.util.ArrayList;
import java.util.List;

public class Comunidad {
    private String nombre;
    private String descripcion;
    private List<Usuario> miembros;

    public Comunidad(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.miembros = new ArrayList<>();
    }

    public void agregarMiembro(Usuario usuario) {
        if (!miembros.contains(usuario)) {
            miembros.add(usuario);
            System.out.println(usuario.getNombre() + " se unió a la comunidad: " + this.nombre);
        }
    }

    public void eliminarMiembro(Usuario usuario) {
        if (miembros.remove(usuario)) {
            System.out.println(usuario.getNombre() + " salió de la comunidad: " + this.nombre);
        }
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public List<Usuario> getMiembros() { return miembros; }
    public void setMiembros(List<Usuario> miembros) { this.miembros = miembros; }
}
