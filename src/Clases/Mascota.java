
package Clases;


public class Mascota {
    private int codigo;
    private String nombre;
    private int edad;
    private int peso;
    private String especie;
    private Cliente amo;

    public Mascota(int codigo, String nombre, int edad, int peso, String especie, Cliente amo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.especie = especie;
        this.amo = amo;
    }


    
    
    public int getCodigo() {
        return codigo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Cliente getAmo() {
        return amo;
    }

    public void setAmo(Cliente amo) {
        this.amo = amo;
    }

    
    
    
}
