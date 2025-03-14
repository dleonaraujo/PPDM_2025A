fun main (){
    val opciones = listOf("piedra", "papel", "tijera")
    
    println("Elija una Opcion")
    
    opciones.forEachIndexed { index, opcion ->
        println("$index: $opcion")
    }
    
    print("Su opcion: ")

    val jugador = readLine()?.toIntOrNull()

    if (jugador == null || jugador !in 0..2) {
        println("¡Opción no válida!")
        return
    }

    val opcionJugador = opciones[jugador]
    val opcionBot = opciones[Random.nextInt(3)]

    println("Usted eligió: $opcionJugador")
    println("La computadora eligió: $opcionBot")

    val resultado = when {
        opcionJugador == opcionComputadora -> "Empate!"
        (opcionJugador == "piedra" && opcionBot == "tijera") ||
        (opcionJugador == "papel" && opcionBot == "piedra") ||
        (opcionJugador == "tijera" && opcionBot == "papel") -> "Victory!"
        else -> "GAME OVER"
    }

    println(resultado)
}
