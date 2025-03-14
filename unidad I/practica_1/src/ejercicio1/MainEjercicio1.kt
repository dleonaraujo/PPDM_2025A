package ejercicio1

fun main () {
    println("!Bienvenido!")
    println("Ingrese los siguientes datos")

    var puntuacion: Int = readPuntacion()
    var salario: Double = readSalario()

    print("Nivel de rendimiento: ${determinarRendimiento(puntuacion)}")
    println("Cantidad de dinero recibido: ${salario*(puntuacion.toDouble()/10)}")
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

fun determinarRendimiento(puntuacion: Int): String{
    var nivel: String = when(puntuacion){
        in 0..3 -> "Inaceptable"
        in 4..6 -> "Aceptable"
        in 7..10-> "Meritorio"
        else -> "Error no identificado"
    }
    return nivel
}