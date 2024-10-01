package org.example.modelos;

import java.time.LocalDate;

public class Paciente {
        private Long idPaciente;
        private String nombrePaciente;
        private Integer edadPaciente;
        private String generoPaciente;
        private String direccionPaciente;
        private String telefonoPaciente;
        private String emailPaciente;
        private LocalDate fechaIngresoPaciente;
        private String historialMedicoPaciente;
        private String alergiasPaciente;

        public Paciente() {
        }

        public Paciente(Long idPaciente, String nombrePaciente, Integer edadPaciente, String generoPaciente, String direccionPaciente, String telefonoPaciente, String emailPaciente, LocalDate fechaIngresoPaciente, String historialMedicoPaciente, String alergiasPaciente) {
                this.idPaciente = idPaciente;
                this.nombrePaciente = nombrePaciente;
                this.edadPaciente = edadPaciente;
                this.generoPaciente = generoPaciente;
                this.direccionPaciente = direccionPaciente;
                this.telefonoPaciente = telefonoPaciente;
                this.emailPaciente = emailPaciente;
                this.fechaIngresoPaciente = fechaIngresoPaciente;
                this.historialMedicoPaciente = historialMedicoPaciente;
                this.alergiasPaciente = alergiasPaciente;
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

        public Integer getEdadPaciente() {
                return edadPaciente;
        }

        public void setEdadPaciente(Integer edadPaciente) {
                this.edadPaciente = edadPaciente;
        }

        public String getGeneroPaciente() {
                return generoPaciente;
        }

        public void setGeneroPaciente(String generoPaciente) {
                this.generoPaciente = generoPaciente;
        }

        public String getDireccionPaciente() {
                return direccionPaciente;
        }

        public void setDireccionPaciente(String direccionPaciente) {
                this.direccionPaciente = direccionPaciente;
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

        public LocalDate getFechaIngresoPaciente() {
                return fechaIngresoPaciente;
        }

        public void setFechaIngresoPaciente(LocalDate fechaIngresoPaciente) {
                this.fechaIngresoPaciente = fechaIngresoPaciente;
        }

        public String getHistorialMedicoPaciente() {
                return historialMedicoPaciente;
        }

        public void setHistorialMedicoPaciente(String historialMedicoPaciente) {
                this.historialMedicoPaciente = historialMedicoPaciente;
        }

        public String getAlergiasPaciente() {
                return alergiasPaciente;
        }

        public void setAlergiasPaciente(String alergiasPaciente) {
                this.alergiasPaciente = alergiasPaciente;
        }

        @Override
        public String toString() {
                return "Paciente{" +
                        "idPaciente=" + idPaciente +
                        ", nombrePaciente='" + nombrePaciente + '\'' +
                        ", edadPaciente=" + edadPaciente +
                        ", generoPaciente='" + generoPaciente + '\'' +
                        ", direccionPaciente='" + direccionPaciente + '\'' +
                        ", telefonoPaciente='" + telefonoPaciente + '\'' +
                        ", emailPaciente='" + emailPaciente + '\'' +
                        ", fechaIngresoPaciente=" + fechaIngresoPaciente +
                        ", historialMedicoPaciente='" + historialMedicoPaciente + '\'' +
                        ", alergiasPaciente='" + alergiasPaciente + '\'' +
                        '}';
        }
}
