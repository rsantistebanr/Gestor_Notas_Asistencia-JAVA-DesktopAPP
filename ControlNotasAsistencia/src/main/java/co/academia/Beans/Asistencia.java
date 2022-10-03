/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.academia.Beans;

import java.util.Date;


public class Asistencia {
    private String id_estudiante;
    private Date fecha;
    private int id_categoria_asistencia;

    public Asistencia(String id_estudiante, Date fecha, int id_categoria_asistencia) {
        this.id_estudiante = id_estudiante;
        this.fecha = fecha;
        this.id_categoria_asistencia = id_categoria_asistencia;
    }

    

    public Asistencia() {
    }

    public String getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(String id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    

    public int getId_categoria_asistencia() {
        return id_categoria_asistencia;
    }

    public void setId_categoria_asistencia(int id_categoria_asistencia) {
        this.id_categoria_asistencia = id_categoria_asistencia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
}
