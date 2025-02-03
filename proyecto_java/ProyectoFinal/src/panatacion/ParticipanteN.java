/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package panatacion;

import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class ParticipanteN {
    public static String registrarParticipanteNatacion(String mensaje){
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

        System.out.println("Ingrese su estilo favorito:");
        estilo = entrada.nextLine();
                                
        mensaje = String.format("%sRegistrar Participante Natación\n"
                + "Nombre: %s\n"
                + "Edad: %d\n"
                + "Nivel: %s\n"
                + "Ciudad: %s\n"
                + "Estilo Favorito: %s\n\n", 
                mensaje, nombre, edad, nivel, ciudad, estilo);
        
        return mensaje;
    }
}
