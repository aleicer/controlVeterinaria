package modelo;

import Clases.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;

public class modelCliente {

    dbData dbData;

    public modelCliente() {
        this.dbData = new dbData();
    }

    public boolean crearCliente(Cliente c) {
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(),
                dbData.getUser(), dbData.getPassword())) {
            String query = "INSERT INTO cliente(documentoCliente, nombreCliente,"
                    + " apellidosCliente, direccionCliente, telefonoCliente)"
                    + " VALUES (?,?,?,?,?)";
            PreparedStatement statementCliente = conn.prepareStatement(query);
            statementCliente.setInt(1, c.getIdentidicacion());
            statementCliente.setString(2, c.getNombre());
            statementCliente.setString(3, c.getApellidos());
            statementCliente.setString(4, c.getDireccion());
            statementCliente.setInt(5, c.getTelefono());
            int rowsInserted = statementCliente.executeUpdate();
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

    public Cliente buscarCliente(int identificacion) {
        Cliente c = null;
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String consulta = "SELECT * FROM cliente WHERE documentoCliente = ?";
            PreparedStatement statementCliente = conn.prepareStatement(consulta);
            statementCliente.setInt(1, identificacion);
            ResultSet result = statementCliente.executeQuery();
            while (result.next()) {
                int idCliente= result.getInt(1);
                int identificacionC = result.getInt(2);
                String nombreC = result.getString(3);
                String apellidosC = result.getString(4);
                String direccionC = result.getString(5);
                int telefonoC = result.getInt(6);
                c = new Cliente(idCliente, identificacionC, nombreC, apellidosC, direccionC, telefonoC);
            }
            return c;
        } catch (Exception e) {
            return c;
        }
    }

    public boolean modificarCliente(Cliente c) {
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String queryCliente = "UPDATE cliente SET nombreCliente = ?, apellidosCliente = ?, direccionCliente = ?, telefonoCliente = ? WHERE documentoCliente = ?";
            PreparedStatement statementCliente = conn.prepareStatement(queryCliente);
            statementCliente.setString(1, c.getNombre());
            statementCliente.setString(2, c.getApellidos());
            statementCliente.setString(3, c.getDireccion());
            statementCliente.setInt(4, c.getTelefono());
            statementCliente.setInt(5, c.getIdentidicacion());
            int rowsUpdatedCliente = statementCliente.executeUpdate();
            return rowsUpdatedCliente > 0;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean borrarCliente(int identificacion) {
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            conn.setAutoCommit(false);
            Savepoint savePoint = conn.setSavepoint("deletePoint");
            try {
                String queryCliente = "DELETE FROM cliente WHERE documentoCliente = ?";
                PreparedStatement statementCliente = conn.prepareStatement(queryCliente);
                statementCliente.setInt(1, identificacion);
                int rowsUpdatedCliente = statementCliente.executeUpdate();
                conn.commit();
                return rowsUpdatedCliente > 0;
            } catch (Exception e) {
                conn.rollback(savePoint);
            }
        } catch (SQLException e) {
            return false;
        }
        return false;
    }
    
    

}
