package es.nebrija.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import es.nebrija.model.Mochila;

public class DaoMochila {
    private Connection conn;

    public DaoMochila() throws SQLException {
        conn = DbConnection.getConnection();
    }

    public ArrayList<Mochila> cargarMochilas() throws SQLException {
        String sql = "SELECT * FROM Mochila";
        try (Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {

            ArrayList<Mochila> mochilas = new ArrayList<>();
            while (rs.next()) {
                mochilas.add(new Mochila(
                    rs.getInt("idMochila"),
                    rs.getString("nombre"),
                    rs.getString("descripcion"),
                    rs.getInt("capacidad"),
                    rs.getInt("valor")
                ));
            }
            return mochilas;
        }
    }
    
    public void guardarMochila(Mochila mochila) throws SQLException {
        String sql = "INSERT INTO Mochila(nombre, descripcion, capacidad, valor) VALUES(?,?,?,?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, mochila.getNombre());
            ps.setString(2, mochila.getDescripcion());
            ps.setInt(3, mochila.getCapacidad());
            ps.setInt(4, mochila.getValor());
            ps.executeUpdate();
        }
    }
    public void actualizarMochila(Mochila mochila) throws SQLException {
        String sql = "UPDATE Mochila SET nombre=?, descripcion=?, capacidad=?, valor=? WHERE idMochila=?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, mochila.getNombre());
            ps.setString(2, mochila.getDescripcion());
            ps.setInt(3, mochila.getCapacidad());
            ps.setInt(4, mochila.getValor());
            ps.setInt(5, mochila.getIdMochila());
            ps.executeUpdate();
        }
    }
    public void eliminarMochila(int idMochila) throws SQLException {
        String sql = "DELETE FROM Mochila WHERE idMochila=?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idMochila);
            ps.executeUpdate();
        }
    }
    public void selectAll() throws SQLException {
        String sql = "SELECT * FROM Mochila";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        int countData = 0;

        while (rs.next()) {
            int idMochila = rs.getInt("idMochila");
            int cantidadObjeto = rs.getInt("cantidadObjeto");

            countData++;

            System.out.println("Datos de la mochila " + countData + "\n" +
                    "ID Mochila: " + idMochila + "\n" +
                    "Cantidad de objetos: " + cantidadObjeto + "\n" +
                    "----------------------------");
        }

        stmt.close();
    }
}