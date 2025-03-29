package ejercicio_3
import kotlin.math.PI

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

// Subclase Rectángulo
class Rectangulo(private val base: Double, private val altura: Double) : Shape() {
    override fun calcularArea(): Double {
        return base * altura
    }

    override fun calcularPerimetro(): Double {
        return 2 * (base + altura)
    }
}

// Subclase Círculo
class Circulo(private val radio: Double) : Shape() {
    override fun calcularArea(): Double {
        return PI * radio * radio
    }

    override fun calcularPerimetro(): Double {
        return 2 * PI * radio
    }
}

fun main() {
    val cuadrado = Cuadrado(5.0)
    println("Cuadrado:")
    cuadrado.imprimirResultados()

    val rectangulo = Rectangulo(4.0, 7.0)
    println("Rectángulo:")
    rectangulo.imprimirResultados()

    val circulo = Circulo(3.0)
    println("Círculo:")
    circulo.imprimirResultados()
}