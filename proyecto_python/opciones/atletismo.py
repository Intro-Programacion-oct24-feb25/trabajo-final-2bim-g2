def registrar_participante_at():
    print("Registrar participante Atletismo")
    nombre = input("Nombre: ")
    edad = int(input("Edad: "))
    especialidad = input("Especialidad: ")
    ciudad = input("Ciudad: ")
    record_personal = input("Récord personal: ")
    return f"Registrar participante Atletismo\nNombre: {nombre}\nEdad: {edad}\nEspecialidad: {especialidad}\nCiudad: {ciudad}\nRécord personal: {record_personal}"