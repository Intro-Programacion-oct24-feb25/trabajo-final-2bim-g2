def registrar_participante():
    print("Registrando participante en Fútbol")
    nombre = input("Nombre: ")
    edad = int(input("Edad: "))
    posicion = input("Posición preferida: ")
    ciudad = input("Ciudad: ")
    equipo_favorito = input("Equipo favorito: ")
    return f"Fútbol: {nombre}, {edad} años, posición {posicion}, de {ciudad}, equipo favorito {equipo_favorito}"