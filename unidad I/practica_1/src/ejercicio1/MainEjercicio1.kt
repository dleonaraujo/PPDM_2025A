package ejercicio1

fun main () {

}

fun readPuntacion(): Int {
    while(true){
        print("Puntuacion: ")
        var puntuacion: Int? = readLine()?.toIntOrNull()
        if (puntuacion != null) {
            if (puntuacion >= 0 || puntuacion <= 10){
                return puntuacion
            }
            else {
                println("¡Su puntacion está fuera del rango!\n")
            }
        }
        else {
            println("¡El valor ingresado, no es correcto!\n")
        }
    }
}