package modelo;
//USE CHATGPT PARA EL USO DE LA FUNCION DATE y  POPR ULTIMO USE DE APOYO UN CURSO DE UDEMY DE POO
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Usuario {
    private String nombre;
    private String password;
    private String description;
    private Genero genero;
    private String email;
    private Date fechaNacimiento;
    private String redesSociales;
    private List<Comunidad> comunidades;
    private List<Usuario> followers;
    private String usuario;
    private Estatus estatus;

    public Usuario(String nombre, String password, String description, Genero genero,
                   String email, Date fechaNacimiento, String redesSociales,
                   String usuario, Estatus estatus) {
        this.nombre = nombre;
        this.password = password;
        this.description = description;
        this.genero = genero;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.redesSociales = redesSociales;
        this.usuario = usuario;
        this.estatus = estatus;
        this.comunidades = new ArrayList<>();
        this.followers = new ArrayList<>();
    }

    public void registrar() {
        System.out.println("Usuario registrado: " + this.nombre);
    }

    public void editar() {
        System.out.println("Usuario " + this.nombre + " editado.");
    }

    public void darBaja() {
        this.estatus = Estatus.INACTIVO;
        System.out.println("Usuario " + this.nombre + " dado de baja.");
    }

    public boolean login(String usuario, String password) {
        return this.usuario.equals(usuario) && this.password.equals(password);
    }

    public void follow(Usuario u) {
        if (!followers.contains(u)) {
            followers.add(u);
            System.out.println(this.nombre + " siguió a " + u.getNombre());
        }
    }

    public void unfollow(Usuario u) {
        followers.remove(u);
        System.out.println(this.nombre + " dejó de seguir a " + u.getNombre());
    }

    public void bloquear(Usuario u) {
        followers.remove(u);
        System.out.println(this.nombre + " bloqueó a " + u.getNombre());
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Genero getGenero() { return genero; }
    public void setGenero(Genero genero) { this.genero = genero; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Date getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(Date fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public String getRedesSociales() { return redesSociales; }
    public void setRedesSociales(String redesSociales) { this.redesSociales = redesSociales; }

    public List<Comunidad> getComunidades() { return comunidades; }
    public void setComunidades(List<Comunidad> comunidades) { this.comunidades = comunidades; }

    public List<Usuario> getFollowers() { return followers; }
    public void setFollowers(List<Usuario> followers) { this.followers = followers; }

    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }

    public Estatus getEstatus() { return estatus; }
    public void setEstatus(Estatus estatus) { this.estatus = estatus; }
}
