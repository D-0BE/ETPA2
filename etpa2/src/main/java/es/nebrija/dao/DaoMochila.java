package es.nebrija.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoMochila {
    private static final String URL = "";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    private String nombre;
    private String descripcion;
    private int capacidad;
    private int valor;


    public void addObjeto(String nombre, String descripcion, int capacidad, int valor)throws Exception {
        String sql = "INSERT INTO Objeto (nombre, descripcion, peso) VALUES (?, ?, ?)";
            try (Connection conn= DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                preparedStatement.setString(1, nombre);
                preparedStatement.setString(2, descripcion);
                preparedStatement.setInt(3, capacidad);
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }
}