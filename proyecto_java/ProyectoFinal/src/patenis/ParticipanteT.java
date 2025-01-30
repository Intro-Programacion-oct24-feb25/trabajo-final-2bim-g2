/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patenis;

import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class ParticipanteT {
    public static String registrarParticipanteTenis(String mensaje){
        Scanner entrada = new Scanner(System.in);

        String nombre;
        int edad;
        String nivel;
        String ciudad;
        String manoHabil;
        
        System.out.println("Ingrese el nombre del participante:");
        nombre = entrada.nextLine();

        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        
        System.out.println("Ingrese su nivel:");
        nivel = entrada.nextLine();

        System.out.println("Ingrese su ciudad:");
        ciudad = entrada.nextLine();

        System.out.println("Ingrese su mano habil:");
        manoHabil = entrada.nextLine();
                                
        mensaje = String.format("%sRegistrar Participante Futbol\n"
                + "Nombre: %s\n"
                + "Edad: %d\n"
                + "Nivel: %s\n"
                + "Ciudad: %s\n"
                + "Mano habil: %s\n", 
                mensaje, nombre, edad, nivel, ciudad, manoHabil);
        
        return mensaje;
    }
}
