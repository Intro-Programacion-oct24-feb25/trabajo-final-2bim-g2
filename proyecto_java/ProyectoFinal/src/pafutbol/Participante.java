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
public class Participante {
    public static String registrarParticipanteFutbol(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el Nombre del participante: ");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese la edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese la posición preferida: ");
        String posicion = entrada.nextLine();

        System.out.println("Ingrese la ciudad: ");
        String ciudad = entrada.nextLine();

        System.out.println("Ingrese su equipo favorito: ");
        String equipo = entrada.nextLine();
        
        
        cadena = String.format("""
                               %sRegistrar Participante Futbol
                               Nombre: %s
                               Edad: %d
                               Posicion: %s
                               Ciudad: %s
                               Equipo: %s
                               """,
                cadena,nombre,edad,posicion,ciudad,equipo);
        return cadena;
    }
}
