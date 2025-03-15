fun main(){
    val opciones = listOf("suma","resta","multiplicacion","division","salir")
    while (true) {
        println("====Elija su opcion====")

        opciones.forEachIndexed { index, option ->
            println("${index + 1}. $option")
        }

        val eleccion = readEleccion()
        if (eleccion == 5) {
            print("\nAdios!")
            break
        }
    }

}

// Función para leer la puntuación del usuario asegurando que esté en el rango de 0 a 10
fun readEleccion(): Int {
    while (true) {
        print("Eleccion: ")
        var eleccion: Int? = readLine()?.toIntOrNull()  // Leer la entrada y convertirla a Int

        if (eleccion != null) {
            if (eleccion in 1..5) {  // Validamos que esté dentro del rango permitido
                return eleccion  // Retornamos la puntuación válida
            } else {
                println("¡Su eleccion está fuera del rango!\n")  // Mensaje de error si está fuera del rango
            }
        } else {
            println("¡El valor ingresado no es correcto!\n")  // Mensaje de error si la entrada no es numérica
        }
    }
}

fun calculadora(eleccion: Int, a: Double,b: Double) {
    val resultado = when {
        1 -> a + b
        2 -> a - b
        3 -> a * b
        4 -> 
    }
}