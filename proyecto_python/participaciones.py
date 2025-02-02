def obtener_informacion(total_actividades):
    if total_actividades == 0:
        return "Mala campaña, debemos mejorar"
    elif 1 <= total_actividades <= 5:
        return "Poca participación en el club, hay que mejorar"
    elif 6 <= total_actividades <= 15:
        return "Buena participación, sigan así."
    else:
        return "Excelente campaña del club."

def obtener_reporte(actividades, conteos):
    reporte = "Las actividades ingresadas son:\n"
    for actividad, conteo in zip(actividades, conteos):
        reporte += f"- Número de participantes en {actividad}: {conteo}\n"
    return reporte