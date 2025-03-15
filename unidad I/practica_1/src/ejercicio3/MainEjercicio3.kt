fun main(){
    val opciones = listOf("Suma", "Resta", "Multiplicación", "Division", "Salir")
    while(true){
        println("==== Menú ====")

        opciones.forEachIndexed { index, option ->
            println("${index+1}. $option")
        }

        val eleccion = readEleccion()

        // Retirando al usuario
        if (eleccion == 5){
            print("\nAdios!")
            break
        }

        val numero1: Double = readNumero(1)
        var numero2: Double = 0.0
        while(true) {
            numero2 = readNumero(2)
            if (eleccion == 4 && numero2 != 0.0 || eleccion != 4){
                break
            }
            print("No puede dividir por 0. ")
        }

        calculadora(eleccion, numero1, numero2)
    }
}

fun readEleccion(): Int {
    while(true){
        print("Eleccion: ")
        var eleccion: Int? = readLine()?.toIntOrNull()
        if (eleccion != null) {
            if (eleccion in 1..5){
                return eleccion
            }
            else {
                println("¡Su eleccion está fuera del rango!\n")
            }
        }
        else {
            println("¡El valor ingresado, no es correcto!\n")
        }
    }
}

fun readNumero(i: Int): Double {
    while(true) {
        print("Ingrese el numero $i: ")
        var numero: Double? = readLine()?.toDoubleOrNull()
        if (numero != null) {
            return numero
        }
        else {
            println("!El valor ingresado, no es correcto!\n")
        }
    }
}

fun calculadora(eleccion: Int, a: Double, b: Double){
    val resultado = when (eleccion) {
        1 -> a + b
        2 -> a - b
        3 -> a * b
        4 -> a / b
        else -> 0
    }
    println("Resultado: $resultado")
}