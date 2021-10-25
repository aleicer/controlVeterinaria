package modelo;

import Clases.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import javax.swing.DefaultListModel;
import java.util.LinkedList;

public class listas {

    dbData dbData;

    public listas() {
        this.dbData = new dbData();
    }

    public LinkedList<Cliente> listaCliente() {
        LinkedList<Cliente> listaClientes = new LinkedList<>();
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String consulta = "SELECT * FROM cliente";
            PreparedStatement statementCliente = conn.prepareStatement(consulta);
            ResultSet result = statementCliente.executeQuery();
            while (result.next()) {
                int idAmo = result.getInt(1);
                int identificacionC = result.getInt(2);
                String nombreC = result.getString(3);
                String apellidosC = result.getString(4);
                String direccionC = result.getString(5);
                int telefonoC = result.getInt(6);
                Cliente c = new Cliente(idAmo, identificacionC, nombreC, apellidosC, direccionC, telefonoC);
                listaClientes.add(c);
            }
            return listaClientes;
        } catch (Exception e) {
            return listaClientes;
        }
    }

    public LinkedList<Planes> listaPlanes() {
        LinkedList<Planes> listaPlanes = new LinkedList<>();
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String consulta = "SELECT * FROM plan";
            PreparedStatement statementCliente = conn.prepareStatement(consulta);
            ResultSet result = statementCliente.executeQuery();
            while (result.next()) {
                int idPlan = result.getInt(1);
                String nombre = result.getString(2);
                String descripcion = result.getString(3);
                int precio = result.getInt(4);
                Planes p = new Planes(idPlan, nombre, precio, descripcion);
                listaPlanes.add(p);
            }
            return listaPlanes;
        } catch (Exception e) {
            return listaPlanes;
        }
    }

    public LinkedList<Mascota> listaMascotas() {
        LinkedList<Mascota> listaMascotas = new LinkedList<>();
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String consulta = "SELECT * FROM mascota";
            PreparedStatement statementMascota = conn.prepareStatement(consulta);
            ResultSet result = statementMascota.executeQuery();
            while (result.next()) {
                int idMascota = result.getInt(1);
                String nombre = result.getString(2);
                int edad = result.getInt(3);
                int peso = result.getInt(4);
                String especie = result.getString(5);
                int idAmo = result.getInt(6);
                Cliente amo = buscarAmo(idAmo);
                Mascota m = new Mascota(idMascota, nombre, edad, peso, especie, amo);
                listaMascotas.add(m);
            }
            return listaMascotas;
        } catch (Exception e) {
            return listaMascotas;
        }
    }
    
    public LinkedList<Consultas> graficaMascota() {
        LinkedList<Consultas> reporteM = new LinkedList<>();
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String consulta = "SELECT especieMascota, COUNT(especieMascota) FROM `mascota` GROUP BY especieMascota";
            PreparedStatement statementConsulta = conn.prepareStatement(consulta);
            ResultSet result = statementConsulta.executeQuery();
            while (result.next()) {
                Consultas c= new Consultas();
                String tipoEspecie= result.getString(1);
                int cantidadEspecie= result.getInt(2);
                c.setTipoEspecie(tipoEspecie);
                c.setCantidadEspecie(cantidadEspecie);
                reporteM.add(c);
            }
            return reporteM;
        } catch (Exception e) {
            return reporteM;
        }
    }

    public Cliente buscarAmo(int idAmo) {
        Cliente c = null;
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String consulta = "SELECT * FROM cliente WHERE idCliente = ?";
            PreparedStatement statementCliente = conn.prepareStatement(consulta);
            statementCliente.setInt(1, idAmo);
            ResultSet result = statementCliente.executeQuery();
            while (result.next()) {
                int amoId= result.getInt(1);
                int identificacionC = result.getInt(2);
                String nombreC = result.getString(3);
                String apellidosC = result.getString(4);
                String direccionC = result.getString(5);
                int telefonoC = result.getInt(6);
                c = new Cliente(idAmo, identificacionC, nombreC, apellidosC, direccionC, telefonoC);
            }
            return c;
        } catch (Exception e) {
            return c;
        }
    }

    public Planes buscarPlan(int idPlan) {
        Planes p = null;
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String consulta = "SELECT * FROM plan WHERE idPlan = ?";
            PreparedStatement statementCliente = conn.prepareStatement(consulta);
            statementCliente.setInt(1, idPlan);
            ResultSet result = statementCliente.executeQuery();
            while (result.next()) {
                int idP = result.getInt(1);
                String nombrePlan = result.getString(2);
                String descripcionPlan = result.getString(3);
                int precio = result.getInt(4);
                p = new Planes(idP, nombrePlan, precio, descripcionPlan);
            }
            return p;
        } catch (Exception e) {
            return p;
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
                int codigo = result.getInt(1);
                String nombre = result.getString(2);
                int edad = result.getInt(3);
                int peso = result.getInt(4);
                String especie = result.getString(5);
                int idAmo = result.getInt(6);
                Cliente amo= buscarAmo(idAmo);
                m = new Mascota(codigo, nombre, edad, peso, especie, amo);
            }
            return m;
        } catch (Exception e) {
            return m;
        }
    }
}
