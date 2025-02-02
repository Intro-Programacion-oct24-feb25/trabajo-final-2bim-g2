def registrar_participante_na():
    print("Registrando participante en Natación")
    nombre = input("Nombre: ")
    edad = int(input("Edad: "))
    nivel = input("Nivel (principiante, intermedio, avanzado): ")
    ciudad = input("Ciudad: ")
    estilo_favorito = input("Estilo favorito: ")
    return f"Natación: {nombre}, {edad} años, nivel {nivel}, de {ciudad}, estilo {estilo_favorito}"