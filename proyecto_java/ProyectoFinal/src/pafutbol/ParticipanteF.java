/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pafutbol;

import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class ParticipanteF {
    public static String registrarParticipanteFutbol(String mensaje){
        Scanner entrada = new Scanner(System.in);

        String nombre;
        int edad;
        String posicion;
        String ciudad;
        String equipo;
        
        System.out.println("Ingrese el Nombre del participante:");
        nombre = entrada.nextLine();

        System.out.println("Ingrese la edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        
        System.out.println("Ingrese la posición preferida:");
        posicion = entrada.nextLine();

        System.out.println("Ingrese la ciudad:");
        ciudad = entrada.nextLine();

        System.out.println("Ingrese su equipo favorito:");
        equipo = entrada.nextLine();
                                
        mensaje = String.format("%sRegistrar Participante Futbol\n"
                + "Nombre: %s\n"
                + "Edad: %d\n"
                + "Posicion: %s\n"
                + "Ciudad: %s\n"
                + "Equipo: %s\n", 
                mensaje, nombre, edad, posicion, ciudad, equipo);
        
        return mensaje;
    }
}
