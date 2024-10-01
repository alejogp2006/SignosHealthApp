package org.example.modelos;

import java.time.LocalDate;

public class Medicamento {
    private Long id;
    private String nombre;
    private String principioActivo;
    private String dosis;
    private String frecuencia;
    private String efectosSecundarios;
    private String contraindicaciones;
    private String interacciones;
    private String laboratorio;
    private LocalDate fechaVencimiento;

    public Medicamento() {
    }

    public Medicamento(Long id, String nombre, String principioActivo, String dosis, String frecuencia, String efectosSecundarios, String contraindicaciones, String interacciones, String laboratorio, LocalDate fechaVencimiento) {
        this.id = id;
        this.nombre = nombre;
        this.principioActivo = principioActivo;
        this.dosis = dosis;
        this.frecuencia = frecuencia;
        this.efectosSecundarios = efectosSecundarios;
        this.contraindicaciones = contraindicaciones;
        this.interacciones = interacciones;
        this.laboratorio = laboratorio;
        this.fechaVencimiento = fechaVencimiento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrincipioActivo() {
        return principioActivo;
    }

    public void setPrincipioActivo(String principioActivo) {
        this.principioActivo = principioActivo;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getEfectosSecundarios() {
        return efectosSecundarios;
    }

    public void setEfectosSecundarios(String efectosSecundarios) {
        this.efectosSecundarios = efectosSecundarios;
    }

    public String getContraindicaciones() {
        return contraindicaciones;
    }

    public void setContraindicaciones(String contraindicaciones) {
        this.contraindicaciones = contraindicaciones;
    }

    public String getInteracciones() {
        return interacciones;
    }

    public void setInteracciones(String interacciones) {
        this.interacciones = interacciones;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", principioActivo='" + principioActivo + '\'' +
                ", dosis='" + dosis + '\'' +
                ", frecuencia='" + frecuencia + '\'' +
                ", efectosSecundarios='" + efectosSecundarios + '\'' +
                ", contraindicaciones='" + contraindicaciones + '\'' +
                ", interacciones='" + interacciones + '\'' +
                ", laboratorio='" + laboratorio + '\'' +
                ", fechaVencimiento='" + fechaVencimiento + '\'' +
                '}';
    }
}
