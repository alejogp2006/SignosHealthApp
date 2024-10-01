package org.example;

import org.example.modelos.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los siguientes datos del paciente");

        System.out.print("Ingrese ID: ");
        Long idPaciente = Long.parseLong(scanner.nextLine());

        System.out.print("Ingrese Nombre: ");
        String nombrePaciente = scanner.nextLine();

        System.out.print("Ingrese Edad: ");
        Integer edadPaciente = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese Género: ");
        String generoPaciente = scanner.nextLine();

        System.out.print("Ingrese Dirección: ");
        String direccionPaciente = scanner.nextLine();

        System.out.print("Ingrese Teléfono: ");
        String telefonoPaciente = scanner.nextLine();

        System.out.print("Ingrese Email: ");
        String emailPaciente = scanner.nextLine();

        System.out.print("Ingrese Fecha de Ingreso (YYYY-MM-DD): ");
        LocalDate fechaIngresoPaciente = LocalDate.parse(scanner.nextLine());

        System.out.print("Ingrese Historial Médico: ");
        String historialMedicoPaciente = scanner.nextLine();

        System.out.print("Ingrese Alergias: ");
        String alergiasPaciente = scanner.nextLine();


        Paciente pacienteUno=new Paciente(idPaciente, nombrePaciente, edadPaciente,
                generoPaciente, direccionPaciente, telefonoPaciente, emailPaciente,
                fechaIngresoPaciente, historialMedicoPaciente, alergiasPaciente);

        System.out.println("Ingrese los siguientes datos del Medico");

        System.out.print("Ingrese ID: ");
        Long idMedico = Long.parseLong(scanner.nextLine());

        System.out.print("Ingrese Nombre: ");
        String nombreMedico = scanner.nextLine();

        System.out.print("Ingrese Especialidad: ");
        String especialidadMedico = scanner.nextLine();

        System.out.print("Ingrese Número de Licencia: ");
        String numeroLicenciaMedico = scanner.nextLine();

        System.out.print("Ingrese Teléfono: ");
        String telefonoMedico = scanner.nextLine();

        System.out.print("Ingrese Email: ");
        String emailMedico = scanner.nextLine();

        System.out.print("Ingrese Hospital Afiliado: ");
        String hospitalAfiliadoMedico = scanner.nextLine();

        System.out.print("Ingrese Años de Experiencia: ");
        Integer aniosExperienciaMedico = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese Dirección: ");
        String direccionMedico = scanner.nextLine();

        System.out.print("Ingrese Fecha de Nacimiento (YYYY-MM-DD): ");
        LocalDate fechaNacimientoMedico = LocalDate.parse(scanner.nextLine());

        Medico medico = new Medico(idMedico, nombreMedico, especialidadMedico, numeroLicenciaMedico,
                telefonoMedico, emailMedico, hospitalAfiliadoMedico,
                aniosExperienciaMedico, direccionMedico, fechaNacimientoMedico);



        Paciente pacienteDos=new Paciente(
                1020356029L,
                "alicia",
                20,
                "femeinino",
                "calle 50",
                "3002574748",
                "alicia@gmail.com",
                LocalDate.now(),
                "Paciente con trauma cerebral",
                "Alergica al tramadol");

        System.out.println(pacienteUno);
        System.out.println(pacienteDos);

        Medico medicoUno=new Medico();
        Medico medicoDos=new Medico(
                1023455858L,
                "manuel",
                "cirugano",
                "103054",
                "3002568932",
                "manuel@gmail.com",
                "san vicente",
                15,
                "calle 13",
                LocalDate.now()
        );

        System.out.println(medicoUno);
        System.out.println(medicoDos);

        Enfermedad enfermedadUno=new Enfermedad();
        Enfermedad enfermedadDos=new Enfermedad(
                1L,
                "Diabetes Tipo 2",
                "Enfermedad crónica que afecta la forma en que el cuerpo metaboliza la glucosa.",
                "Controlar la dieta y medicamentos",
                true,
                "Sed excesiva, aumento de la frecuencia urinaria",
                "Diagnóstico médico",
                "Genética, obesidad",
                "Dieta equilibrada, ejercicio regular",
                LocalDate.now()
        );
        System.out.println(enfermedadUno);
        System.out.println(enfermedadDos);

        Medicamento medicamentoUno=new Medicamento();
        Medicamento medicamentoDos=new Medicamento(
                1L,
                "Paracetamol",
                "Paracetamol",
                "500 mg",
                "Cada 8 horas",
                "Náuseas, erupciones cutáneas",
                "Hipersensibilidad al paracetamol",
                "Alcohol, anticoagulantes",
                "Laboratorios XYZ",
                LocalDate.now()
        );
        System.out.println(medicamentoUno);
        System.out.println(medicamentoDos);

        SignoVital signoVitalUno=new SignoVital();
        SignoVital signoVitalDos=new SignoVital(
                1L,
                "Presión Arterial",
                "120/80",
                "mmHg",
                LocalDate.now(),
                "09:30",
                "Dentro de rangos normales",
                "Dr. Fernández",
                "Normal",
                "Medición manual"
        );
        System.out.println(signoVitalUno);
        System.out.println(signoVitalDos);

    }
}