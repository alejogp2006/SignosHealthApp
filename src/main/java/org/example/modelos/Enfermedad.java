package org.example.modelos;

import java.time.LocalDate;

public class Enfermedad {
    private Long id;
    private String nombre;
    private String descripcion;
    private String tratamientoRecomendado;
    private Boolean esCronica;
    private String sintomas;
    private String diagnostico;
    private String causas;
    private String prevencion;
    private LocalDate fechaDiagnostico;

    public Enfermedad() {
    }

    public Enfermedad(Long id, String nombre, String descripcion, String tratamientoRecomendado, Boolean esCronica, String sintomas, String diagnostico, String causas, String prevencion, LocalDate fechaDiagnostico) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tratamientoRecomendado = tratamientoRecomendado;
        this.esCronica = esCronica;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.causas = causas;
        this.prevencion = prevencion;
        this.fechaDiagnostico = fechaDiagnostico;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTratamientoRecomendado() {
        return tratamientoRecomendado;
    }

    public void setTratamientoRecomendado(String tratamientoRecomendado) {
        this.tratamientoRecomendado = tratamientoRecomendado;
    }

    public Boolean isEsCronica() {
        return esCronica;
    }

    public void setEsCronica(Boolean esCronica) {
        this.esCronica = esCronica;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getCausas() {
        return causas;
    }

    public void setCausas(String causas) {
        this.causas = causas;
    }

    public String getPrevencion() {
        return prevencion;
    }

    public void setPrevencion(String prevencion) {
        this.prevencion = prevencion;
    }

    public LocalDate getFechaDiagnostico() {
        return fechaDiagnostico;
    }

    public void setFechaDiagnostico(LocalDate fechaDiagnostico) {
        this.fechaDiagnostico = fechaDiagnostico;
    }

    @Override
    public String toString() {
        return "Enfermedad{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", tratamientoRecomendado='" + tratamientoRecomendado + '\'' +
                ", esCronica=" + esCronica +
                ", sintomas='" + sintomas + '\'' +
                ", diagnostico='" + diagnostico + '\'' +
                ", causas='" + causas + '\'' +
                ", prevencion='" + prevencion + '\'' +
                ", fechaDiagnostico='" + fechaDiagnostico + '\'' +
                '}';
    }
}
