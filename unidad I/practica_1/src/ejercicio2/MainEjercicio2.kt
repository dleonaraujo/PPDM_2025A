import kotlin.random.Random

fun main() {
    val opciones = listOf("piedra", "papel", "tijera")

    while (true) {
        println("\nElija una opción:")
        opciones.forEachIndexed { index, opcion ->
            println("$index: $opcion")
        }
        println("3: Salir")

        print("Su opción: ")
        val jugador = readLine()?.toIntOrNull()

        if (jugador == 3) {
            println("¡Gracias por jugar!")
            break
        }

        if (jugador == null || jugador !in 0..2) {
            println("¡Opción no válida! Intente de nuevo.\n")
            continue
        }

        val opcionJugador = opciones[jugador]
        val opcionBot = opciones[Random.nextInt(3)]

        println("Su eleccion: $opcionJugador")
        println("Bot: $opcionBot")

        val resultado = when {
            opcionJugador == opcionBot -> "¡Empate!"
            (opcionJugador == "piedra" && opcionBot == "tijera") ||
            (opcionJugador == "papel" && opcionBot == "piedra") ||
            (opcionJugador == "tijera" && opcionBot == "papel") -> "¡Ganaste!"
            else -> "GAME OVER"
        }

        println(resultado)
    }
}
