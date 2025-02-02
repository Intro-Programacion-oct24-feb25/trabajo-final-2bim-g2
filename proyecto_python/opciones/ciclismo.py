def registrar_participante_ci():
    print("Registrando participante Ciclismo")
    nombre = input("Nombre: ")
    edad = int(input("Edad: "))
    tipo_ciclismo = input("Tipo de ciclismo (montaña, ruta, urbano): ")
    ciudad = input("Ciudad: ")
    marca_bicicleta = input("Marca de bicicleta preferida: ")
    return f"Registrar participante Ciclismo\nNombre: {nombre}\nEdad: {edad}\nCiclismo:{tipo_ciclismo}\nCiudad: {ciudad}\nMarca de bicicleta favorita: {marca_bicicleta}"