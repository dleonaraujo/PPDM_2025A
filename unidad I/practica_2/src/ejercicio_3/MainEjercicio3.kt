package ejercicio_3

// Clase abstracta Shape
abstract class Shape {
    abstract fun calcularArea(): Double
    abstract fun calcularPerimetro(): Double

    fun imprimirResultados() {
        println("Área: ${calcularArea()}")
        println("Perímetro: ${calcularPerimetro()}\n")
    }
}

// Subclase Cuadrado
class Cuadrado(private val lado: Double) : Shape() {
    override fun calcularArea(): Double {
        return lado * lado
    }

    override fun calcularPerimetro(): Double {
        return 4 * lado
    }
}