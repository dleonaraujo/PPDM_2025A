import kotlin.random.Random

fun main() {
    while (true) {
        val jugador = obtenerOpcionUsuario()
        if (jugador == 3) {
            println("¡Gracias por jugar!")
            break
        }

        val resultado = jugarRonda(jugador)
        println(resultado)
    }
}

/** Muestra las opciones disponibles y obtiene la elección del usuario */
fun obtenerOpcionUsuario(): Int {
    val opciones = listOf("piedra", "papel", "tijera")

    println("\nElija una opción:")
    opciones.forEachIndexed { index, opcion ->
        println("$index: $opcion")
    }
    println("3: Salir")

    while (true) {
        print("Su opción: ")
        val entrada = readLine()?.toIntOrNull()
        if (entrada in 0..3) return entrada ?: 3  // Devuelve la opción si es válida
        println("¡Opción no válida! Intente de nuevo.")
    }
}

/** Ejecuta una ronda de juego y devuelve el resultado */
fun jugarRonda(jugador: Int): String {
    val opciones = listOf("piedra", "papel", "tijera")
    val opcionJugador = opciones[jugador]
    val opcionBot = opciones[Random.nextInt(3)] // Genera una elección aleatoria para la computadora

    println("Usted eligió: $opcionJugador")
    println("La computadora eligió: $opcionBot")

    return determinarResultado(opcionJugador, opcionBot)
}

/** Determina el resultado del enfrentamiento entre jugador y computadora */
fun determinarResultado(opcionJugador: String, opcionBot: String): String {
    return when {
        opcionJugador == opcionBot -> "Empate"
        (opcionJugador == "piedra" && opcionBot == "tijera") ||
        (opcionJugador == "papel" && opcionBot == "piedra") ||
        (opcionJugador == "tijera" && opcionBot == "papel") -> "Ganaste"
        else -> "Perdiste"
    }
}
