package Clases;


public class Planes {
    private int idPlan;
    private String nombre;
    private int precio;
    private String descripcion;

    public Planes(int idPlan, String nombre, int precio, String descripcion) {
        this.idPlan = idPlan;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }




    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public int getIdPlan() {
        return idPlan;
    }


    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
    }

    
}