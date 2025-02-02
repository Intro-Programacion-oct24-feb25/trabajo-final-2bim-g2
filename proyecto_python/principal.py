from opciones import futbol, natacion, atletismo, basquetbol, ciclismo, tenis, yoga
from participaciones import obtener_info, obtener_reporte

def principal():
    actividades = ["Fútbol", "Natación", "Atletismo", "Básquetbol", "Ciclismo", "Tenis", "Yoga"]
    reporte = []
    contador = [0] * len(actividades)
    
    while True:
        print("\nIngrese un número del (1) al (7)")     
        for i, opciones in enumerate(actividades, start=1):
            print(f"{i}. {opciones}")
        valor = int(input("Valor: "))
        
        if valor == 1:
                reporte.append(futbol.registrar_participante_fut())
                contador[0] += 1
        else:
            if valor == 2:
                    reporte.append(natacion.registrar_participante_na())
                    contador[1] += 1
            else:
                if valor == 3:
                        reporte.append(atletismo.registrar_participante_at())
                        contador[2] += 1
                else:
                    if valor == 4:
                            reporte.append(basquetbol.registrar_participante_ba())
                            contador[3] += 1
                    else:
                        if valor == 5:
                                reporte.append(ciclismo.registrar_participante_ci())
                                contador[4] += 1
                        else:
                            if valor == 6:
                                    reporte.append(tenis.registrar_participante_te())
                                    contador[5] += 1
                            else:
                                if valor == 7:
                                        reporte.append(yoga.registrar_participante_yo())
                                        contador[6] += 1
                                else:
                                    print("Lo sentimos, el club no tiene esa opción.")
                                     

        salir = input("Desea seguir ingresando actividades, ingrese: (no) para salir ").strip().lower()
        if salir == "no":
            break
    
    print("\nRepote:")
    for r in reporte:
        print(r)
    
    print("\n" + obtener_info(len(reporte)))
    print("\n" + obtener_reporte(actividades, contador))

if __name__ == "__main__":
    principal()