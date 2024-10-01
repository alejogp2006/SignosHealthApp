package org.example.modelos;

import java.time.LocalDate;

public class SignoVital {
    private Long Id;
    private String tipo;
    private String valor;
    private String unidad;
    private LocalDate fechaMedicion;
    private String Medicion;
    private String observaciones;
    private String medicoResponsable;
    private String estado;
    private String metodoMedicion;

    public SignoVital() {
    }

    public SignoVital(Long id, String tipo, String valor, String unidad, LocalDate fechaMedicion, String medicion, String observaciones, String medicoResponsable, String estado, String metodoMedicion) {
        Id = id;
        this.tipo = tipo;
        this.valor = valor;
        this.unidad = unidad;
        this.fechaMedicion = fechaMedicion;
        Medicion = medicion;
        this.observaciones = observaciones;
        this.medicoResponsable = medicoResponsable;
        this.estado = estado;
        this.metodoMedicion = metodoMedicion;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public LocalDate getFechaMedicion() {
        return fechaMedicion;
    }

    public void setFechaMedicion(LocalDate fechaMedicion) {
        this.fechaMedicion = fechaMedicion;
    }

    public String getMedicion() {
        return Medicion;
    }

    public void setMedicion(String medicion) {
        Medicion = medicion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getMedicoResponsable() {
        return medicoResponsable;
    }

    public void setMedicoResponsable(String medicoResponsable) {
        this.medicoResponsable = medicoResponsable;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMetodoMedicion() {
        return metodoMedicion;
    }

    public void setMetodoMedicion(String metodoMedicion) {
        this.metodoMedicion = metodoMedicion;
    }

    @Override
    public String toString() {
        return "SignoVital{" +
                "Id=" + Id +
                ", tipo='" + tipo + '\'' +
                ", valor='" + valor + '\'' +
                ", unidad='" + unidad + '\'' +
                ", fechaMedicion=" + fechaMedicion +
                ", Medicion='" + Medicion + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", medicoResponsable='" + medicoResponsable + '\'' +
                ", estado='" + estado + '\'' +
                ", metodoMedicion='" + metodoMedicion + '\'' +
                '}';
    }
}
