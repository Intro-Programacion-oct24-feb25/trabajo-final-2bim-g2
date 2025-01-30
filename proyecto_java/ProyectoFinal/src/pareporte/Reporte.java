/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pareporte;

/**
 *
 * @author Usuario iTC
 */
public class Reporte {
    public static String obtenerReporte(String [] participantes,
                                        int [] actividades){
        String cadena = "Las actividades ingresadas son:\n";
        int contador = 0;
        
        for (int i = 0; i < actividades.length; i++){
            contador = contador + 1;
            
            cadena = String.format("%s\n%d.Número de Participantes de %s: %d\n",
                cadena,
                contador,
                participantes[i], 
                actividades[i]);
        }
                
        return cadena;
    }
}   
