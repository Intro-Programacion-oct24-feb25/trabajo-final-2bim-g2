def registrar_participante():
    print("Registrando participante en Tenis")
    nombre = input("Nombre: ")
    edad = int(input("Edad: "))
    nivel = input("Nivel (principiante, intermedio, avanzado): ")
    ciudad = input("Ciudad: ")
    mano_habil = input("Mano hábil (derecha/izquierda): ")
    return f"Tenis: {nombre}, {edad} años, nivel {nivel}, de {ciudad}, mano hábil {mano_habil}"