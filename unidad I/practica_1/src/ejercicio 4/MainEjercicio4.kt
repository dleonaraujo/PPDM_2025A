fun main (){
    //Integrando la cantidad de vidas
    var vidas: Int = $
    // Leyendo numero del 1 al 30
    val numero: Int = readNumero()
}

fun readNumero(): Int {
    while (true) {
        print("Ingrese un numero del 1 al 30: ")
        var numero: Int? = readLine()?.toIntOrNull()  // Leer entrada y convertir a Int

        if (numero != null) {
            if (numero in 1..30) {  // Validamos que esté en el rango de opciones válidas
                return numero  // Retornamos la elección válida
            } else {
                println("¡Su numero está fuera del rango!\n")  // Mensaje de error si el número no está en el rango
            }
        } else {
            println("¡El valor ingresado no es correcto!\n")  // Mensaje de error si la entrada no es numérica
        }
    }
}