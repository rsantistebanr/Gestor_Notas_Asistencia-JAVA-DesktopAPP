/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.academia.Beans;

import java.sql.Date;

/**
 *
 * @author ROBERT
 */
public class Matricula {
    private Date fecha_matricula;
    private float mensualidad;
    private int idmatricula;
    private int estado;
    private String DNI;

    public Matricula() {
    }

    public Date getFecha_matricula() {
        return fecha_matricula;
    }

    public void setFecha_matricula(Date fecha_matricula) {
        this.fecha_matricula = fecha_matricula;
    }

    public float getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(float mensualidad) {
        this.mensualidad = mensualidad;
    }

    public int getIdmatricula() {
        return idmatricula;
    }

    public void setIdmatricula(int idmatricula) {
        this.idmatricula = idmatricula;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
    
    
    
}
