/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal;

import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        int[] actividades = new int[7];
        String[] participantes = {"Futbol", "Natacion", "Atletismo", 
            "Básquetbol", "Ciclismo", "Tenis", "Yoga"};
  
        int valor;
        boolean bandera = true;
        String salida;
        
        while (bandera) {
            System.out.println("ingrese un numero, del (1) al (7)");
            valor = entrada.nextInt();
            switch (valor) {
                case 1:
                    registrarParticipanteFutbol();
                    actividades[0] = actividades[0] + 1;
                    break;
                case 2:
                    registrarParticipanteNatacion();
                    actividades[1] = actividades[1] + 1;
                    break;
                case 3:
                    registrarParticipanteAtletismo();
                    actividades[2] = actividades[2] + 1;
                    break;
                case 4:
                    registrarParticipanteBasquet();
                    actividades[3] = actividades[3] + 1;
                    break;
                case 5:
                    registrarParticipanteCiclismo();
                    actividades[4] = actividades[4] + 1;
                    break;
                case 6:
                    registrarParticipanteTenis();
                    actividades[5] = actividades[5] + 1;
                    break;
                    ;
                case 7:
                    registrarParticipanteYoga();
                    actividades[6] = actividades[6] + 1;

                    break;
                default:
                    System.out.println("lo sentimos, el club no tiene esa "
                            + "opcion");
            }
            System.out.println("desea seguir ingresando actividades, ingrese:"
                    + " (no) para salir");
            salida = entrada.nextLine();
            if (salida.equals("no")) {
                bandera = false;

            }

        }
        
        String info;
        info = obtenerInformacion(actividades);
                        
        String reporte;
        
        reporte = obtenerReporte(participantes, actividades);
        
        System.out.println(info);
        System.out.println(reporte);
    }
    
    public static String cadena = "REPORTE\n";
    
}
