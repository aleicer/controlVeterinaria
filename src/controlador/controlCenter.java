package controlador;

import Clases.*;
import modelo.*;
import java.util.LinkedList;
import javax.swing.DefaultListModel;

public class controlCenter {

    private modelPlan modelPlan;
    private modelCliente modelCliente;
    private modelPagoPlan modelPagoPlan;
    private modelMascota modelMascota;
    private listas listas;

    public controlCenter() {
        this.modelPlan = new modelPlan();
        this.modelCliente = new modelCliente();
        this.modelPagoPlan = new modelPagoPlan();
        this.modelMascota = new modelMascota();
        this.listas = new listas();

    }

    //CONTROLADOR CRUD PLANES
    public boolean CrearPlan(Planes plan) {
        try {
            if (this.modelPlan.crearPlan(plan)) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public Planes buscarPlan(String nombre) {
        Planes p = null;
        try {
            p = this.modelPlan.buscarPlan(nombre);
            return p;
        } catch (Exception e) {
            return null;
        }

    }

    public boolean modificarPlan(Planes p) {
        try {
            return this.modelPlan.modificarPlan(p);

        } catch (Exception e) {
            return false;
        }
    }

    public boolean borrarPlan(String nombre) {
        try {
            return this.modelPlan.borrarPlan(nombre);
        } catch (Exception e) {
            return false;
        }
    }

    //CONTROLADOR CRUD CLIENTE
    public boolean CrearCliente(Cliente c) {
        try {
            if (this.modelCliente.crearCliente(c)) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public Cliente buscarCliente(int identificacion) {
        Cliente c = null;
        try {
            c = this.modelCliente.buscarCliente(identificacion);
            return c;
        } catch (Exception e) {
            return null;
        }
    }

    public boolean modificarCliente(Cliente c) {
        try {
            return this.modelCliente.modificarCliente(c);

        } catch (Exception e) {
            return false;
        }
    }

    public boolean borrarCliente(int identificacion) {
        try {
            return this.modelCliente.borrarCliente(identificacion);
        } catch (Exception e) {
            return false;
        }
    }

    //CONTROLADOR CRUD PAGO PLANES
    public boolean crearPagoPlan(pagoPlan pp) {
        try {
            if (this.modelPagoPlan.crearPagoPlan(pp)) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public pagoPlan buscarPagoPlan(int idPagoPlan) {
        pagoPlan pp = null;
        try {
            pp = this.modelPagoPlan.buscarPagoPlan(idPagoPlan);
            return pp;
        } catch (Exception e) {
            return null;
        }
    }

    public boolean modificarPagoPlan(pagoPlan pp) {
        try {
            return this.modelPagoPlan.modificarPagoPlan(pp);

        } catch (Exception e) {
            return false;
        }
    }

    public boolean borrarPagoPlan(int idPagoPlan) {
        try {
            return this.modelPagoPlan.borrarPagoPlan(idPagoPlan);
        } catch (Exception e) {
            return false;
        }
    }

    //CONTROLADOR CRUD MASCOTAS
    public boolean crearMascota(Mascota m) {
        try {
            if (this.modelMascota.crearMascota(m)) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public Mascota buscarMascota(int idMascota) {
        Mascota m = null;
        try {
            m = this.modelMascota.buscarMascota(idMascota);
            return m;
        } catch (Exception e) {
            return null;
        }
    }

    public boolean modificarMascota(Mascota m) {
        try {
            return this.modelMascota.modificarMascota(m);

        } catch (Exception e) {
            return false;
        }
    }

    public boolean borrarMascota(int idMascota) {
        try {
            return this.modelMascota.borrarMascota(idMascota);
        } catch (Exception e) {
            return false;
        }
    }

    //CONTROLADOR LISTAS
    public LinkedList<Cliente> listaCliente() {
        LinkedList<Cliente> listaClientes = null;
        try {
            listaClientes = this.listas.listaCliente();
            return listaClientes;
        } catch (Exception e) {
            return this.listas.listaCliente();
        }
    }

    public LinkedList<Planes> listaPlanes() {
        LinkedList<Planes> listaPlanes = null;
        try {
            listaPlanes = this.listas.listaPlanes();
            return listaPlanes;
        } catch (Exception e) {
            return this.listas.listaPlanes();
        }
    }

    public LinkedList<Mascota> listaMascotas() {
        LinkedList<Mascota> listaMascotas = null;
        try {
            listaMascotas = this.listas.listaMascotas();
            return listaMascotas;
        } catch (Exception e) {
            return this.listas.listaMascotas();
        }
    }

    public LinkedList<Consultas> graficaMascotas() {
        LinkedList<Consultas> reporteM = this.listas.graficaMascota();
        return reporteM;
    }
}
