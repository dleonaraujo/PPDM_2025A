fun main() {
    // Lista de opciones del menú
    val opciones = listOf("Suma", "Resta", "Multiplicación", "División", "Salir")

    // Bucle infinito para mantener el programa en ejecución hasta que el usuario decida salir
    while (true) {
        println("==== Menú ====")

        // Mostrar las opciones del menú con su índice correspondiente
        opciones.forEachIndexed { index, option ->
            println("${index + 1}. $option")
        }

        val eleccion = readEleccion() // Leer la opción elegida por el usuario

        // Opción para salir del programa
        if (eleccion == 5) {
            print("\nAdiós!")  // Mensaje de despedida
            break  // Salimos del bucle infinito, terminando el programa
        }

        // Leer el primer número
        val numero1: Double = readNumero(1)
        var numero2: Double = 0.0

        // Validación especial para la división (evitar división por cero)
        while (true) {
            numero2 = readNumero(2)  // Leer el segundo número
            if (eleccion == 4 && numero2 != 0.0 || eleccion != 4) { // Verifica que no sea una división por 0
                break  // Salimos del bucle si el número es válido
            }
            print("No puede dividir por 0. ")  // Mensaje de error en caso de división por cero
        }

        // Llamamos a la función calculadora para realizar la operación seleccionada
        calculadora(eleccion, numero1, numero2)
    }
}

// Función para leer la opción elegida por el usuario
fun readEleccion(): Int {
    while (true) {
        print("Elección: ")
        var eleccion: Int? = readLine()?.toIntOrNull()  // Leer entrada y convertir a Int

        if (eleccion != null) {
            if (eleccion in 1..5) {  // Validamos que esté en el rango de opciones válidas
                return eleccion  // Retornamos la elección válida
            } else {
                println("¡Su elección está fuera del rango!\n")  // Mensaje de error si el número no está en el rango
            }
        } else {
            println("¡El valor ingresado no es correcto!\n")  // Mensaje de error si la entrada no es numérica
        }
    }
}

// Función para leer un número del usuario
fun readNumero(i: Int): Double {
    while (true) {
        print("Ingrese el número $i: ")
        var numero: Double? = readLine()?.toDoubleOrNull()  // Leer entrada y convertir a Double

        if (numero != null) {
            return numero  // Retornamos el número válido
        } else {
            println("¡El valor ingresado no es correcto!\n")  // Mensaje de error si la entrada no es numérica
        }
    }
}

// Función que realiza la operación matemática según la opción elegida
fun calculadora(eleccion: Int, a: Double, b: Double) {
    val resultado = when (eleccion) {
        1 -> a + b  // Suma
        2 -> a - b  // Resta
        3 -> a * b  // Multiplicación
        4 -> a / b  // División (ya validada previamente para evitar división por cero)
        else -> 0   // Caso no válido (nunca debería ocurrir)
    }
    println("Resultado: $resultado")  // Imprimimos el resultado de la operación
}
