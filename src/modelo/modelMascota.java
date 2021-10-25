package modelo;

import Clases.*;
import com.mysql.cj.xdevapi.Statement;
import modelo.listas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;

public class modelMascota {

    dbData dbData;
    listas listas;

    public modelMascota() {
        this.dbData = new dbData();
        this.listas = new listas();
    }

    public boolean crearMascota(Mascota m) {
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String query = "INSERT INTO mascota(nombreMascota, edadMascota, pesoMascota, especieMascota, idCliente) VALUES (?,?,?,?,?)";
            PreparedStatement statementMascota = conn.prepareStatement(query);
            statementMascota.setString(1, m.getNombre());
            statementMascota.setInt(2, m.getEdad());
            statementMascota.setInt(3, m.getPeso());
            statementMascota.setString(4, m.getEspecie());
            statementMascota.setInt(5, m.getAmo().getIdCliente());
            int rowsInserted = statementMascota.executeUpdate();
            if (rowsInserted > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            return false;
        }
    }

    public Mascota buscarMascota(int idMascota) {
        Mascota m = null;
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String consulta = "SELECT * FROM mascota WHERE idMascota = ?";
            PreparedStatement statementMascota = conn.prepareStatement(consulta);
            statementMascota.setInt(1, idMascota);
            ResultSet result = statementMascota.executeQuery();
            while (result.next()) {
                int idM = result.getInt(1);
                String nombre = result.getString(2);
                int edad = result.getInt(3);
                int peso = result.getInt(4);
                String especie = result.getString(5);
                int idAmo = result.getInt(6);
                Cliente amo= listas.buscarAmo(idAmo);
                m = new Mascota(idM, nombre, edad, peso, especie, amo);
            }
            return m;
        } catch (Exception e) {
            return m;
        }
    }
    
    public boolean modificarMascota(Mascota m) {
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String queryMascota = "UPDATE mascota SET nombreMascota = ?, edadMascota = ?, pesoMascota = ?, especieMascota = ?, idCliente = ? WHERE idMascota = ?";
            PreparedStatement statementMascota = conn.prepareStatement(queryMascota);
            statementMascota.setString(1, m.getNombre());
            statementMascota.setInt(2, m.getEdad());
            statementMascota.setInt(3, m.getPeso());
            statementMascota.setString(4, m.getEspecie());
            statementMascota.setInt(5, m.getAmo().getIdCliente());
            statementMascota.setInt(6, m.getCodigo());
            int rowsUpdatedPlan = statementMascota.executeUpdate();
            return rowsUpdatedPlan > 0;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public boolean borrarMascota(int idMascota) {
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            conn.setAutoCommit(false);
            Savepoint savePoint = conn.setSavepoint("deletePoint");
            try {
                String queryMascota = "DELETE FROM mascota WHERE idMascota = ?";
                PreparedStatement statementMascota = conn.prepareStatement(queryMascota);
                statementMascota.setInt(1, idMascota);
                int rowsUpdatedMascota = statementMascota.executeUpdate();
                conn.commit();
                return rowsUpdatedMascota > 0;
            } catch (Exception e) {
                conn.rollback(savePoint);
            }
        } catch (SQLException e) {
            return false;
        }
        return false;
    }


}
