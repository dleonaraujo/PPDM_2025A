import kotlin.random.Random

fun main (){
    //Integrando la cantidad de vidas
    var vidas: Int = $
    // Generando Numero aleatorio
    val NumeroAleatorio = Random.nextInt(1,31)
    val numero: Int = readNumero()
}

fun readNumero(): Int {
    while (true) {
        print("Ingrese un numero del 1 al 30: ")
        var numero: Int? = readLine()?.toIntOrNull()  // Leer entrada y convertir a Int

        if (numero != null) {
            if (numero in 1..30) {
                return numero
            } else {
                println("¡Su numero está fuera del rango!\n")  // Mensaje de error si el número no está en el rango
            }
        } else {
            println("¡El valor ingresado no es correcto!\n")  // Mensaje de error si la entrada no es numérica
        }
    }
}