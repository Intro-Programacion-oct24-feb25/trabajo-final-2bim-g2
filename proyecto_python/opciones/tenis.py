def registrar_participante_te():
    print("Registrando participante Tenis")
    nombre = input("Nombre: ")
    edad = int(input("Edad: "))
    nivel = input("Nivel (principiante, intermedio, avanzado): ")
    ciudad = input("Ciudad: ")
    mano_habil = input("Mano hábil (derecha/izquierda): ")
    return f"Registrar participante Tenis\nNombre: {nombre}\nEdad: {edad}\nNivel: {nivel}\nCiudad: {ciudad}\nMano hábil {mano_habil}"