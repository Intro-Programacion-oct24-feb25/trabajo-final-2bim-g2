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
    
    public static String cadena(){
        String ca = "Reporte\n";
        return ca;
    }

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
        
        String ca = cadena();
        
        while (bandera) {
            System.out.println("ingrese un numero, del (1) al (7)");
            valor = entrada.nextInt();
            switch (valor) {
                case 1:
                    ca = ParticipanteF.registrarParticipanteFutbol(ca);
                    actividades[0] = actividades[0] + 1;
                    break;
                case 2:
                    ca = ParticipanteN.registrarParticipanteNatacion(ca);
                    actividades[1] = actividades[1] + 1;
                    break;
                case 3:
                    ca = ParticipanteA.registrarParticipanteAtletismo(ca);
                    actividades[2] = actividades[2] + 1;
                    break;
                case 4:
                    ca = ParticipanteB.registrarParticipanteBasquetbol(ca);
                    actividades[3] = actividades[3] + 1;
                    break;
                case 5:
                    ca = ParticipanteC.registrarParticipanteCiclismo(ca);
                    actividades[4] = actividades[4] + 1;
                    break;
                case 6:
                    ca = ParticipanteT.registrarParticipanteTenis(ca);
                    actividades[5] = actividades[5] + 1;
                    break;
                case 7:
                    ca = ParticipanteY.registrarParticipanteYoga(ca);
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
        
        ReporteCompleto.obtenerReporteFinal(info, reporte, ca);
        
                
    }
        
}
