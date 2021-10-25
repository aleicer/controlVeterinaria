package Clases;

public class Cliente {
    private int idCliente;
    private int identidicacion;
    private String nombre;
    private String apellidos;
    private String direccion;
    private int telefono;

    public Cliente() {
    }

    public Cliente(int idCliente, int identidicacion, String nombre, String apellidos, String direccion, int telefono) {
        this.idCliente = idCliente;
        this.identidicacion = identidicacion;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;       
    }



    public int getIdentidicacion() {
        return identidicacion;
    }


    public void setIdentidicacion(int identidicacion) {
        this.identidicacion = identidicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }


    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }


    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    
    
}