def registrar_participante():
    print("Registrando participante en Ciclismo")
    nombre = input("Nombre: ")
    edad = int(input("Edad: "))
    tipo_ciclismo = input("Tipo de ciclismo (montaña, ruta, urbano): ")
    ciudad = input("Ciudad: ")
    marca_bicicleta = input("Marca de bicicleta preferida: ")
    return f"Ciclismo: {nombre}, {edad} años, ciclismo {tipo_ciclismo}, de {ciudad}, bicicleta {marca_bicicleta}"
