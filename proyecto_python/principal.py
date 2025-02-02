from opciones import futbol, natacion, atletismo, basquetbol, ciclismo, tenis, yoga
from participaciones import obtener_info, obtener_reporte

def main():
    actividades = ["Fútbol", "Natación", "Atletismo", "Básquetbol", "Ciclismo", "Tenis", "Yoga"]
    resumen = []
    contador = [0] * len(actividades)
    
    while True:
        print("\nIngrese un número del (1) al (7)")
        
        valor = int(input("Valor: "))
        
        if (valor == 1):
             futbol.registrar_participante_fut
             actividades[0] = actividades[0] + 1
        else:
             if (valor == 2):
                  natacion.registrar_participante_na
                  actividades[1] = actividades[1] + 1
             else:
                 if (valor == 3):
                     atletismo.registrar_participante_at
                     actividades[2] = actividades[2] + 1
                 else:
                     if(valor == 4):
                         basquetbol.registrar_participante_ba
                         actividades[3] = actividades[3] + 1
                     else:
                         if(valor == 5):
                             ciclismo.registrar_participante_ci
                             actividades[4] = actividades[4] + 1
                         else:
                             if (valor == 6):
                                 tenis.registrar_participante_te
                                 actividades[5] = actividades[5] + 1
                             else:
                                 if (valor == 7):
                                     yoga.registrar_participante_yo
                                     actividades[6] = actividades[6] + 1

        salir = input("Desea seguir ingresando actividades, ingrese: (no) para salir ").strip().lower()
        if salir == "no":
            break
    
    print("\nResumen de participantes:")
    for r in resumen:
        print(r)
    
    print("\n" + obtener_info(len(resumen)))
    print("\n" + obtener_reporte(actividades, contador))

if __name__ == "__main__":
    main()