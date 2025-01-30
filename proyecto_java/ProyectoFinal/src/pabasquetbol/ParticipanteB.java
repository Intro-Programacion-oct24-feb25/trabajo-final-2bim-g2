/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pabasquetbol;

import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class ParticipanteB {
    public static String registrarParticipanteBasquetbol(String mensaje){
        Scanner entrada = new Scanner(System.in);

        String nombre;
        int edad;
        String posicion;
        String ciudad;
        String estatura;
        
        System.out.println("Ingrese el nombre del participante:");
        nombre = entrada.nextLine();

        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        
        System.out.println("Ingrese su posición preferida:");
        posicion = entrada.nextLine();
        
        System.out.println("Ingrese su estatura:");
        estatura = entrada.nextLine();
        
        System.out.println("Ingrese su ciudad:");
        ciudad = entrada.nextLine();
                                
        mensaje = String.format("%sRegistrar Participante Futbol\n"
                + "Nombre: %s\n"
                + "Edad: %d\n"
                + "Posición: %s\n"
                + "Estatura: %s\n"
                + "Ciudad: %s\n", 
                mensaje, nombre, edad, posicion, estatura, ciudad);
        
        return mensaje;
    }
}
