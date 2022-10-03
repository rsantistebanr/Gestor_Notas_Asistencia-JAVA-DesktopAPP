
package co.academia.Beans;

import java.sql.Date;


public class Parcial {
    private int id_parcial;
    private Date fecha;
    private String nombre;
    private float total;
    private int estado;
    public Parcial() {
    }

    public Parcial(int id_parcial, Date fecha, String nombre, float total) {
        this.id_parcial = id_parcial;
        this.fecha = fecha;
        this.nombre = nombre;
        this.total = total;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    
    public int getId_parcial() {
        return id_parcial;
    }

    public void setId_parcial(int id_parcial) {
        this.id_parcial = id_parcial;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    
}
