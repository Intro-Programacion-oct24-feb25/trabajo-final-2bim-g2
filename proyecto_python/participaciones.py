def obtener_info(total_actividades):      
    if total_actividades == 0:
        return "Mala campaña, debemos mejorar"
    else:
        if 1 <= total_actividades <= 5:
            return "Poca participación en el club, hay que mejorar"
        else:
            if 6 <= total_actividades <= 15:
                return "Buena participación, sigan así."
            else:
                if total_actividades >= 16:
                    return "Excelente campaña del club."
            
def obtener_reporte(actividades, contador):
    reporte = "Las actividades ingresadas son:\n"
    for actividad, conta in zip(actividades, contador):
        reporte += f"- Número de participantes en {actividad}: {conta}\n"
    return reporte
