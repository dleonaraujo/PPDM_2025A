package ejercicio1  // Definimos el paquete donde se encuentra el programa

fun main() {
    println("¡Bienvenido!")  // Mensaje de bienvenida
    println("Ingrese los siguientes datos")  // Solicitud de datos al usuario

    var puntuacion: Int = readPuntacion()  // Llamamos a la función para leer la puntuación del usuario
    var salario: Double = readSalario()  // Llamamos a la función para leer el salario del usuario

    // Imprimimos el nivel de rendimiento determinado por la puntuación
    println("Nivel de rendimiento: ${determinarRendimiento(puntuacion)}")
    // Calculamos e imprimimos la cantidad de dinero recibido basada en la puntuación y el salario
    println("Cantidad de dinero recibido: ${salario * (puntuacion.toDouble() / 10)}")
}

// Función para leer la puntuación del usuario asegurando que esté en el rango de 0 a 10
fun readPuntacion(): Int {
    while (true) {
        print("Puntuacion: ")
        var puntuacion: Int? = readLine()?.toIntOrNull()  // Leer la entrada y convertirla a Int

        if (puntuacion != null) {
            if (puntuacion in 0..10) {  // Validamos que esté dentro del rango permitido
                return puntuacion  // Retornamos la puntuación válida
            } else {
                println("¡Su puntuación está fuera del rango!\n")  // Mensaje de error si está fuera del rango
            }
        } else {
            println("¡El valor ingresado no es correcto!\n")  // Mensaje de error si la entrada no es numérica
        }
    }
}

// Función para leer el salario del usuario asegurando que sea un valor positivo
fun readSalario(): Double {
    while (true) {
        print("Salario: ")
        var salario: Double? = readLine()?.toDoubleOrNull()  // Leer la entrada y convertirla a Double

        if (salario != null) {
            if (salario >= 0.0) {  // Validamos que no sea negativo
                return salario  // Retornamos el salario válido
            } else {
                println("¡No puede tener un salario negativo!\n")  // Mensaje de error si el salario es negativo
            }
        } else {
            println("¡El valor ingresado no es correcto!\n")  // Mensaje de error si la entrada no es numérica
        }
    }
}

// Función para determinar el nivel de rendimiento basado en la puntuación
fun determinarRendimiento(puntuacion: Int): String {
    var nivel: String = when (puntuacion) {
        in 0..3 -> "Inaceptable"  // Si la puntuación está entre 0 y 3
        in 4..6 -> "Aceptable"  // Si la puntuación está entre 4 y 6
        in 7..10 -> "Meritorio"  // Si la puntuación está entre 7 y 10
        else -> "Error no identificado"  // Caso por defecto (esto nunca debería ejecutarse)
    }
    return nivel  // Retornamos el nivel de rendimiento
}
