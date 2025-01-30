/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package payoga;

import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class ParticipanteY {
    public static String registrarParticipanteYoga(String mensaje){
        Scanner entrada = new Scanner(System.in);

        String nombre;
        int edad;
        String nivel;
        String ciudad;
        String estilo;
        
        System.out.println("Ingrese el nombre del participante:");
        nombre = entrada.nextLine();

        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        
        System.out.println("Ingrese su nivel:");
        nivel = entrada.nextLine();

        System.out.println("Ingrese su ciudad:");
        ciudad = entrada.nextLine();

        System.out.println("Ingrese su estilo de yoga preferido:");
        estilo = entrada.nextLine();
                                
        mensaje = String.format("%sRegistrar Participante Futbol\n"
                + "Nombre: %s\n"
                + "Edad: %d\n"
                + "Nivel: %s\n"
                + "Ciudad: %s\n"
                + "Estilo de yoga preferido: %s\n", 
                mensaje, nombre, edad, nivel, ciudad, estilo);
        
        return mensaje;
    }
}
