/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal;

import java.util.Scanner;
import pafutbol.ParticipanteF;
import panatacion.ParticipanteN;
import paatletismo.ParticipanteA;
import pabasquetbol.ParticipanteB;
import paciclismo.ParticipanteC;
import patenis.ParticipanteT;
import payoga.ParticipanteY;
import papresentacion.ReporteCompleto;
import painfo.Informacion;
import pareporte.Reporte;

/**
 *
 * @author Usuario iTC
 */
public class ProyectoFinal {
    
    public static String cadena = "Reporte\n";

    /**
     * @param args
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
                    cadena = ParticipanteF.registrarParticipanteFutbol(cadena);
                    actividades[0] = actividades[0] + 1;
                    break;
                case 2:
                    cadena = ParticipanteN.registrarParticipanteNatacion(cadena);
                    actividades[1] = actividades[1] + 1;
                    break;
                case 3:
                    cadena = ParticipanteA.registrarParticipanteAtletismo(cadena);
                    actividades[2] = actividades[2] + 1;
                    break;
                case 4:
                    cadena = ParticipanteB.registrarParticipanteBasquetbol(cadena);
                    actividades[3] = actividades[3] + 1;
                    break;
                case 5:
                    cadena = ParticipanteC.registrarParticipanteCiclismo(cadena);
                    actividades[4] = actividades[4] + 1;
                    break;
                case 6:
                    cadena = ParticipanteT.registrarParticipanteTenis(cadena);
                    actividades[5] = actividades[5] + 1;
                    break;
                case 7:
                    cadena = ParticipanteY.registrarParticipanteYoga(cadena);
                    actividades[6] = actividades[6] + 1;

                    break;
                default:
                    System.out.println("lo sentimos, el club no tiene esa "
                            + "opcion");
            }
            System.out.println("Desea seguir ingresando actividades, ingrese:"
                    + " (no) para salir");
            entrada.nextLine();
            salida = entrada.nextLine();
            if (salida.equals("no")) {
                bandera = false;

            }

        }
        
        String info;
        info = Informacion.obtenerInformacion(actividades);
                        
        String reporte;        
        reporte = Reporte.obtenerReporte(participantes, actividades);
        
        ReporteCompleto.obtenerReporteFinal(info, reporte, cadena);
        
                
    }
        
}
