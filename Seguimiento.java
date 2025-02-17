package modelo;

public class Seguimiento {
    private Usuario seguidor;
    private Usuario seguido;

    public Seguimiento(Usuario seguidor, Usuario seguido) {
        this.seguidor = seguidor;
        this.seguido = seguido;
    }

    public void iniciarSeguimiento() {
        seguidor.follow(seguido);
    }

    public void detenerSeguimiento() {
        seguidor.unfollow(seguido);
    }

    public void bloquearUsuario() {
        seguidor.bloquear(seguido);
    }

    public Usuario getSeguidor() { return seguidor; }
    public void setSeguidor(Usuario seguidor) { this.seguidor = seguidor; }

    public Usuario getSeguido() { return seguido; }
    public void setSeguido(Usuario seguido) { this.seguido = seguido; }
}
