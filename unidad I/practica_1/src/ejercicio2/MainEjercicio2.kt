fun main (){
    val opciones = listOf("piedra", "papel", "tijera")
    
    println("Elija una Opcion")
    
    opciones.forEachIndexed { index, opcion ->
        println("$index: $opcion")
    }
    
    print("Su opcion: ")
}
