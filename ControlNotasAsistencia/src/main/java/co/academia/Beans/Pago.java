/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.academia.Beans;

import java.sql.Date;

public class Pago {
    private Date date_pago;
    private String dni;
    private int id_curso;
    private float monto;
    private int cant_meses;
    private float deuda;
    private int estado;

    public Pago(Date date_pago, String dni, int id_curso, float monto, int cant_meses, int estado) {
        this.date_pago = date_pago;
        this.dni = dni;
        this.id_curso = id_curso;
        this.monto = monto;
        this.cant_meses = cant_meses;
        this.estado = estado;
    }

    

    public Pago() {
    }

    public Date getDate_pago() {
        return date_pago;
    }

    public void setDate_pago(Date date_pago) {
        this.date_pago = date_pago;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public float getDeuda() {
        return deuda;
    }

    public void setDeuda(float deuda) {
        this.deuda = deuda;
    }

    

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getCant_meses() {
        return cant_meses;
    }

    public void setCant_meses(int cant_meses) {
        this.cant_meses = cant_meses;
    }

    
   
    
    
}
