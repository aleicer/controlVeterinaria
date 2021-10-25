package modelo;

import Clases.*;
import modelo.listas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import javax.swing.JComboBox;

public class modelPagoPlan {

    dbData dbData;
    listas listas;

    public modelPagoPlan() {
        this.listas = new listas();
        this.dbData = new dbData();
    }   

    public boolean crearPagoPlan(pagoPlan pp) {
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(),
                dbData.getUser(), dbData.getPassword())) {
            String query = "INSERT INTO pagoplan(cantidadCuotas, fechaPago, idPlan,idMascota) VALUES (?,?,?,?)";
            PreparedStatement statementPagoPlan = conn.prepareStatement(query);
            statementPagoPlan.setInt(1, pp.getCantidadCuotas());
            statementPagoPlan.setString(2, pp.getFechaPago());
            statementPagoPlan.setInt(3, pp.getPlan().getIdPlan());
            statementPagoPlan.setInt(4, pp.getMascota().getCodigo());
            int rowsInserted = statementPagoPlan.executeUpdate();
            if (rowsInserted > 0) {
                conn.close();
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            return false;
        }
    }

    public pagoPlan buscarPagoPlan( int idPagoPlan) {
        pagoPlan pp = null;
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String consulta = "SELECT * FROM pagoplan WHERE idPagoPlan = ?";
            PreparedStatement statementPagoPlan = conn.prepareStatement(consulta);
            statementPagoPlan.setInt(1, idPagoPlan);
            ResultSet result = statementPagoPlan.executeQuery();
            while (result.next()) {
                int idPlanPago = result.getInt(1);
                int cantidadCuotas = result.getInt(2);
                String fechaPago = result.getString(3);
                int idPlan = result.getInt(4);
                Planes plan= listas.buscarPlan(idPlan);
                int idMascota = result.getInt(5);
                Mascota mascota= listas.buscarMascota(idMascota);
                
                pp = new pagoPlan(idPlanPago, cantidadCuotas, fechaPago, plan, mascota);
                
            }
            return pp;
        } catch (Exception e) {
            return pp;
        }
    }
    

    public boolean modificarPagoPlan(pagoPlan pp) {
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String query = "UPDATE pagoplan SET cantidadCuotas = ?, fechaPago = ?, idPlan = ?, idMascota = ? WHERE idPagoPlan = ?";
            PreparedStatement statementPagoPlan = conn.prepareStatement(query);
            statementPagoPlan.setInt(1, pp.getCantidadCuotas());
            statementPagoPlan.setString(2, pp.getFechaPago());
            statementPagoPlan.setInt(3, pp.getPlan().getIdPlan());
            statementPagoPlan.setInt(4,pp.getMascota().getCodigo());
            statementPagoPlan.setInt(5, pp.getIdPagoPlan());
            int rowsUpdatedPagoPlan = statementPagoPlan.executeUpdate();
            return rowsUpdatedPagoPlan > 0;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean borrarPagoPlan(int idPagoPlan) {
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            conn.setAutoCommit(false);
            Savepoint savePoint = conn.setSavepoint("deletePoint");
            try {
                String queryPlan = "DELETE FROM pagoplan WHERE idPagoPlan = ?";
                PreparedStatement statementPagoPlan = conn.prepareStatement(queryPlan);
                statementPagoPlan.setInt(1, idPagoPlan);
                int rowsUpdatedPagoPlan = statementPagoPlan.executeUpdate();
                conn.commit();
                return rowsUpdatedPagoPlan > 0;
            } catch (Exception e) {
                conn.rollback(savePoint);
            }
        } catch (SQLException e) {
            return false;
        }
        return false;
    }

}
