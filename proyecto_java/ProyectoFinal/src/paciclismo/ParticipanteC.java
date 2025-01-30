/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paciclismo;

import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class ParticipanteC {
    public static String registrarParticipanteCiclismo(String mensaje){
        Scanner entrada = new Scanner(System.in);

        String nombre;
        int edad;
        String tipo;
        String ciudad;
        String marca;

        System.out.println("Ingrese el nombre del participante:");
        nombre = entrada.nextLine();

        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Ingrese su tipo de ciclismo:");
        tipo = entrada.nextLine();

        System.out.println("Ingrese su ciudad:");
        ciudad = entrada.nextLine();

        System.out.println("Ingrese su marca de bicicleta preferida:");
        marca = entrada.nextLine();

        mensaje = String.format("%sRegistrar Participante Futbol\n"
                + "Nombre: %s\n"
                + "Edad: %d\n"
                + "Tipo de ciclismo: %s\n"
                + "Ciudad: %s\n"
                + "marca de bicicleta preferida: %s\n",
                mensaje, nombre, edad, tipo, ciudad, marca);

        return mensaje;
    }
}
