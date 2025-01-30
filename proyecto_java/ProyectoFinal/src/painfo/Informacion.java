/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package painfo;

/**
 *
 * @author Usuario iTC
 */
public class Informacion {
    public static String obtenerInformacion(int [] actividades){
        
        String cadena = "";
        int contador = 0;
                
        for (int i = 0; i < actividades.length; i++){
            contador = contador + actividades[i];
        }
        if (contador == 0) {
            cadena = "Mala campaña, debemos mejorar";
        } else {
            if (contador == 1 || contador <= 5) {
                cadena = "Poca participación en el club, hay que mejorar";
            } else {
                if (contador == 6 || contador <= 15) {
                    cadena = "Buena participación, sigan así.";
                } else {
                    if (contador >= 16) {
                        cadena = " Excelente campaña del club";
                    }

                }

            }

        }
        return cadena;
    }
}
