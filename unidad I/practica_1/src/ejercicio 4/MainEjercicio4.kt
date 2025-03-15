import kotlin.random.Random

fun main() {
    var vidas = 5  // Cantidad de intentos disponibles
    val numeroAleatorio = Random.nextInt(1, 31)  // Número secreto aleatorio

    println("Bienvenido al juego! Tienes $vidas intentos para adivinar el número.")

    while (vidas > 0) {
        val numero = readNumero()  // Pedimos un número al usuario

        if (numero == numeroAleatorio) {
            println("GANASTE! El número era $numeroAleatorioss")
            return
        }

        vidas--  // Reducimos una vida
        println("Te quedan $vidas vidas.")

        if (vidas == 0) {
            println("Te quedaste sin intentos! El número era $numeroAleatorio.")
            return
        }

        println(partida(numeroAleatorio, numero))  // Imprime la pista
    }
}

// Función para leer un número dentro del rango 1-30
fun readNumero(): Int {
    while (true) {
        print("Ingrese un número del 1 al 30: ")
        val numero = readLine()?.toIntOrNull()

        if (numero != null && numero in 1..30) {
            return numero
        } else {
            println("Número inválido! Debe estar entre 1 y 30.")
        }
    }
}

// Función que da pistas sobre el número secreto
fun partida(numeroAleatorio: Int, numero: Int): String {
    return when {
        numero > numeroAleatorio -> "Pista: El número es menor."
        numero < numeroAleatorio -> "Pista: El número es mayor."
        else -> "¡GANASTE!"
    }
}

