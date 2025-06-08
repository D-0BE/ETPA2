package es.nebrija.dao;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import es.nebrija.model.Objeto;

public class DaoObjeto {
    private Connection conn = null;

    public DaoObjeto() throws SQLException {
        conn = DbConnection.getConnection();
    }

    public ArrayList<Objeto> cargarObjetos() throws SQLException {
        String seleccionarTodo = "SELECT * FROM Objeto";
        Statement statementSelect = conn.createStatement();
        ResultSet resultData = statementSelect.executeQuery(seleccionarTodo);

        ArrayList<Objeto> objetos = new ArrayList<Objeto>();
        while (resultData.next()) {
            int idObjeto = resultData.getInt("idObjeto");
            String nombre = resultData.getString("nombre");
            String descripcion = resultData.getString("descripcion");
            int valor = resultData.getInt("valor");
            int peso = resultData.getInt("peso");
            Objeto cargado = new Objeto(idObjeto, nombre, descripcion, valor, peso);
            objetos.add(cargado);
        }
        return objetos;
    }
    public void guardarObjeto(Objeto objeto) throws SQLException {
        String sql = "INSERT INTO Objeto(nombre, descripcion, valor, peso) VALUES(?,?,?,?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, objeto.getNombre());
            ps.setString(2, objeto.getDescripcion());
            ps.setInt(3, objeto.getValor());
            ps.setInt(4, objeto.getPeso());
            ps.executeUpdate();
        }
    }
    public void actualizarObjeto(Objeto objeto) throws SQLException {
        String sql = "UPDATE Objeto SET nombre=?, descripcion=?, valor=?, peso=? WHERE idObjeto=?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, objeto.getNombre());
            ps.setString(2, objeto.getDescripcion());
            ps.setInt(3, objeto.getValor());
            ps.setInt(4, objeto.getPeso());
            ps.setInt(5, objeto.getIdObjeto());
            ps.executeUpdate();
        }
    }
    public void eliminarObjeto(int idObjeto) throws SQLException {
        String sql = "DELETE FROM Objeto WHERE idObjeto=?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idObjeto);
            ps.executeUpdate();
        }
    }
}
