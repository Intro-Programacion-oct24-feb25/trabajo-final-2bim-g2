/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paatletismo;

import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class ParticipanteA {

    public static String registrarParticipanteAtletismo(String mensaje) {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        int edad;
        String especialidad;
        String ciudad;
        String record;

        System.out.println("Ingrese el nombre del participante:");
        nombre = entrada.nextLine();

        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Ingrese su especialidad:");
        especialidad = entrada.nextLine();

        System.out.println("Ingrese su ciudad:");
        ciudad = entrada.nextLine();

        System.out.println("Ingrese su record personal:");
        record = entrada.nextLine();

        mensaje = String.format("%sRegistrar Participante Futbol\n"
                + "Nombre: %s\n"
                + "Edad: %d\n"
                + "Especialidad: %s\n"
                + "Ciudad: %s\n"
                + "Record Personal: %s\n",
                mensaje, nombre, edad, especialidad, ciudad, record);

        return mensaje;
    }
}
