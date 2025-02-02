def registrar_participante_ba():
    print("Registrando participante Básquetbol")
    nombre = input("Nombre: ")
    edad = int(input("Edad: "))
    posicion = input("Posición preferida: ")
    estatura = float(input("Estatura (en metros): "))
    ciudad = input("Ciudad: ")
    return f"Registrar participante Básquetbol\nNombre: {nombre}\nEdad: {edad}\nPosición preferida: {posicion}\nEstatura: {estatura}\nCiudad: {ciudad}"