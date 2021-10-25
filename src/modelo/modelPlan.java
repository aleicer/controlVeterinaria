package modelo;

import Clases.Planes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;

public class modelPlan {

    dbData dbData;

    public modelPlan() {
        this.dbData = new dbData();
    }

    public boolean crearPlan(Planes plan) {
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String query = "INSERT INTO plan(nombrePlan,descripcionPlan,precioPlan) VALUES (?,?,?)";
            PreparedStatement statementPlan = conn.prepareStatement(query);
            statementPlan.setString(1, plan.getNombre());
            statementPlan.setString(2, plan.getDescripcion());
            statementPlan.setInt(3, plan.getPrecio());
            int rowsInserted = statementPlan.executeUpdate();
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

    public Planes buscarPlan(String nombre) {
        Planes p = null;
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String consulta = "SELECT * FROM plan WHERE nombrePlan = ?";
            PreparedStatement statementPlan = conn.prepareStatement(consulta);
            statementPlan.setString(1, nombre);
            ResultSet result = statementPlan.executeQuery();
            while (result.next()) {
                int idPlan = result.getInt(1);
                String nombrePlan = result.getString(2);
                String descripcionPlan = result.getString(3);
                int precio = result.getInt(4);
                p = new Planes(idPlan, nombrePlan, precio, descripcionPlan);
            }
            return p;
        } catch (Exception e) {
            return p;
        }
    }

    public boolean modificarPlan(Planes p) {
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String queryPlan = "UPDATE plan SET descripcionPlan = ?, precioPlan = ? WHERE nombrePlan = ?";
            PreparedStatement statementPlan = conn.prepareStatement(queryPlan);
            statementPlan.setString(1, p.getDescripcion());
            statementPlan.setInt(2, p.getPrecio());
            statementPlan.setString(3, p.getNombre());
            int rowsUpdatedPlan = statementPlan.executeUpdate();
            return rowsUpdatedPlan > 0;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean borrarPlan(String nombre) {
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            conn.setAutoCommit(false);
            Savepoint savePoint = conn.setSavepoint("deletePoint");
            try {
                String queryPlan = "DELETE FROM plan WHERE nombrePlan = ?";
                PreparedStatement statementPlan = conn.prepareStatement(queryPlan);
                statementPlan.setString(1, nombre);
                int rowsUpdatedPlan = statementPlan.executeUpdate();
                conn.commit();
                return rowsUpdatedPlan > 0;
            } catch (Exception e) {
                conn.rollback(savePoint);
            }
        } catch (SQLException e) {
            return false;
        }
        return false;
    }

}
