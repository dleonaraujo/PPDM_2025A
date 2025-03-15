fun main(){
    val opciones = listOf("suma","resta","multiplicacion","division","salir")
    println("====Elija su opcion====")

    opciones.forEachIndexed{index,option ->
        println("${index+1}. $option")
    }

    val eleccion = readEleccion()
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

