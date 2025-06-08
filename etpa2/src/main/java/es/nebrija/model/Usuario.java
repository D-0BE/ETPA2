package es.nebrija.model;

public class Usuario {
    private int idUsuario;
    private String nombre;
    private String email;
    private String password;

    public Usuario(int idUsuario, String nombre, String email, String password) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
}
