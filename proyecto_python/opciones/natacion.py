def registrar_participante_na():
    print("Registrando participante Natación")
    nombre = input("Nombre: ")
    edad = int(input("Edad: "))
    nivel = input("Nivel (principiante, intermedio, avanzado): ")
    ciudad = input("Ciudad: ")
    estilo_favorito = input("Estilo favorito: ")
    return f"Registrar participante Natación\nNombre: {nombre}\nEdad: {edad}\nNivel: {nivel}\nCiudad: {ciudad}\nEstilo favorito: {estilo_favorito}"