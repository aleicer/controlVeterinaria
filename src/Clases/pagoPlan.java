
package Clases;

public class pagoPlan {
    private int idPagoPlan;
    private int cantidadCuotas;
    private String fechaPago;
    private Planes plan;
    private Mascota mascota;

    public pagoPlan(int idPagoPlan, int cantidadCuotas, String fechaPago, Planes plan, Mascota mascota) {
        this.idPagoPlan = idPagoPlan;
        this.cantidadCuotas = cantidadCuotas;
        this.fechaPago = fechaPago;
        this.plan = plan;
        this.mascota = mascota;
    }




    
    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Planes getPlan() {
        return plan;
    }


    public void setPlan(Planes plan) {
        this.plan = plan;
    }


    public Mascota getMascota() {
        return mascota;
    }


    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public int getIdPagoPlan() {
        return idPagoPlan;
    }

    public void setIdPagoPlan(int idPagoPlan) {
        this.idPagoPlan = idPagoPlan;
    }

    
    
    
}
