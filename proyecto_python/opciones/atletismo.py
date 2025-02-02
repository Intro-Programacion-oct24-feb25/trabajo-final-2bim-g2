def registrar_participante_at():
    print("Registrar participante Atletismo")
    nombre = input("Nombre: ")
    edad = int(input("Edad: "))
    especialidad = input("Especialidad: ")
    ciudad = input("Ciudad: ")
    record_personal = input("Récord personal: ")
    return f"Atletismo: {nombre}, {edad} años, especialidad {especialidad}, de {ciudad}, récord personal {record_personal}"