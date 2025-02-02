def registrar_participante_fut():
    print("Registrando participante Fútbol")
    nombre = input("Nombre: ")
    edad = int(input("Edad: "))
    posicion = input("Posición preferida: ")
    ciudad = input("Ciudad: ")
    equipo_favorito = input("Equipo favorito: ")
    return f"Registrar participante Fútbol\nNombre: {nombre}\nEdad: {edad}\nPosición: {posicion}\nCiudad: {ciudad}\nEquipo favorito: {equipo_favorito}"