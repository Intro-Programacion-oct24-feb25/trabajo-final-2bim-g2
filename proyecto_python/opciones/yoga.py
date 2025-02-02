def registrar_participante_yo():
    print("Registrando participante Yoga")
    nombre = input("Nombre: ")
    edad = int(input("Edad: "))
    nivel = input("Nivel (principiante, intermedio, avanzado): ")
    ciudad = input("Ciudad: ")
    estilo_yoga = input("Estilo de yoga preferido: ")
    return f"Registrar participante Yoga\nNombre: {nombre}\nEdad: {edad}\nNivel: {nivel}\nCiudad: {ciudad}\nEstilo: {estilo_yoga}"