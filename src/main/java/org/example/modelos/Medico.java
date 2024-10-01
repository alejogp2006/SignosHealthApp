package org.example.modelos;

import java.time.LocalDate;

public class Medico {
    private Long idPaciente;
    private String nombrePaciente;
    private String especialidadPaciente;
    private String numeroLicenciaPaciente;
    private String telefonoPaciente;
    private String emailPaciente;
    private String hospitalAfiliadoPaciente;
    private Integer aniosExperienciaPaciente;
    private String direccionPaciente;
    private LocalDate fechaNacimientoPaciente;

    public Medico() {
    }

    public Medico(Long idPaciente, String nombrePaciente, String especialidadPaciente, String numeroLicenciaPaciente, String telefonoPaciente, String emailPaciente, String hospitalAfiliadoPaciente, Integer aniosExperienciaPaciente, String direccionPaciente, LocalDate fechaNacimientoPaciente) {
        this.idPaciente = idPaciente;
        this.nombrePaciente = nombrePaciente;
        this.especialidadPaciente = especialidadPaciente;
        this.numeroLicenciaPaciente = numeroLicenciaPaciente;
        this.telefonoPaciente = telefonoPaciente;
        this.emailPaciente = emailPaciente;
        this.hospitalAfiliadoPaciente = hospitalAfiliadoPaciente;
        this.aniosExperienciaPaciente = aniosExperienciaPaciente;
        this.direccionPaciente = direccionPaciente;
        this.fechaNacimientoPaciente = fechaNacimientoPaciente;
    }

    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getEspecialidadPaciente() {
        return especialidadPaciente;
    }

    public void setEspecialidadPaciente(String especialidadPaciente) {
        this.especialidadPaciente = especialidadPaciente;
    }

    public String getNumeroLicenciaPaciente() {
        return numeroLicenciaPaciente;
    }

    public void setNumeroLicenciaPaciente(String numeroLicenciaPaciente) {
        this.numeroLicenciaPaciente = numeroLicenciaPaciente;
    }

    public String getTelefonoPaciente() {
        return telefonoPaciente;
    }

    public void setTelefonoPaciente(String telefonoPaciente) {
        this.telefonoPaciente = telefonoPaciente;
    }

    public String getEmailPaciente() {
        return emailPaciente;
    }

    public void setEmailPaciente(String emailPaciente) {
        this.emailPaciente = emailPaciente;
    }

    public String getHospitalAfiliadoPaciente() {
        return hospitalAfiliadoPaciente;
    }

    public void setHospitalAfiliadoPaciente(String hospitalAfiliadoPaciente) {
        this.hospitalAfiliadoPaciente = hospitalAfiliadoPaciente;
    }

    public Integer getAniosExperienciaPaciente() {
        return aniosExperienciaPaciente;
    }

    public void setAniosExperienciaPaciente(Integer aniosExperienciaPaciente) {
        this.aniosExperienciaPaciente = aniosExperienciaPaciente;
    }

    public String getDireccionPaciente() {
        return direccionPaciente;
    }

    public void setDireccionPaciente(String direccionPaciente) {
        this.direccionPaciente = direccionPaciente;
    }

    public LocalDate getFechaNacimientoPaciente() {
        return fechaNacimientoPaciente;
    }

    public void setFechaNacimientoPaciente(LocalDate fechaNacimientoPaciente) {
        this.fechaNacimientoPaciente = fechaNacimientoPaciente;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "idPaciente=" + idPaciente +
                ", nombrePaciente='" + nombrePaciente + '\'' +
                ", especialidadPaciente='" + especialidadPaciente + '\'' +
                ", numeroLicenciaPaciente='" + numeroLicenciaPaciente + '\'' +
                ", telefonoPaciente='" + telefonoPaciente + '\'' +
                ", emailPaciente='" + emailPaciente + '\'' +
                ", hospitalAfiliadoPaciente='" + hospitalAfiliadoPaciente + '\'' +
                ", aniosExperienciaPaciente=" + aniosExperienciaPaciente +
                ", direccionPaciente='" + direccionPaciente + '\'' +
                ", fechaNacimientoPaciente=" + fechaNacimientoPaciente +
                '}';
    }
}
