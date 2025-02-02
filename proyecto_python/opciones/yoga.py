def registrar_participante():
    print("Registrando participante en Yoga")
    nombre = input("Nombre: ")
    edad = int(input("Edad: "))
    nivel = input("Nivel (principiante, intermedio, avanzado): ")
    ciudad = input("Ciudad: ")
    estilo_yoga = input("Estilo de yoga preferido: ")
    return f"Yoga: {nombre}, {edad} años, nivel {nivel}, de {ciudad}, estilo {estilo_yoga}"