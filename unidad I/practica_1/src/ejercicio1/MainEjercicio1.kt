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

fun readSalario(): Double {
    while(true) {
        print("Salario: ")
        var salario: Double? = readLine()?.toDoubleOrNull()
        if (salario != null) {
            if (salario >= 0.0) {
                return salario
            }
            else {
                println("!No puede tener un salario negativo!\n")
            }
        }
        else {
            println("!El valor ingresado, no es correcto!\n")
        }
    }
}
