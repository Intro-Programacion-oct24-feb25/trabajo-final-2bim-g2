def registrar_participante():
    print("Registrando participante en Básquetbol")
    nombre = input("Nombre: ")
    edad = int(input("Edad: "))
    posicion = input("Posición preferida: ")
    estatura = float(input("Estatura (en metros): "))
    ciudad = input("Ciudad: ")
    return f"Básquetbol: {nombre}, {edad} años, posición {posicion}, {estatura} m, de {ciudad}"