package ejercicio_2

class Producto(private var precio: Double, private var descuento: Double) {

    // Getter para obtener el precio
    fun getPrecio(): Double {
        return precio
    }

    // Setter para establecer el precio con validación
    fun setPrecio(nuevoPrecio: Double) {
        if (nuevoPrecio >= 0) {
            precio = nuevoPrecio
        } else {
            println("Error: El precio no puede ser negativo.")
        }
    }

    // Getter para obtener el descuento
    fun getDescuento(): Double {
        return descuento
    }

    // Setter para establecer el descuento con validación
    fun setDescuento(nuevoDescuento: Double) {
        if (nuevoDescuento in 0.0..100.0) {
            descuento = nuevoDescuento
        } else {
            println("Error: El descuento debe estar entre 0 y 100%.")
        }
    }

    // Metodo para calcular el precio final después de aplicar el descuento
    fun calcularPrecioFinal(): Double {
        return precio - (precio * (descuento / 100))
    }
}

fun main() {
    val producto = Producto(200.0, 10.0) // Precio inicial: 200, Descuento: 10%

    println("Precio original: ${producto.getPrecio()} USD")
    println("Descuento aplicado: ${producto.getDescuento()}%")
    println("Precio final: ${producto.calcularPrecioFinal()} USD")

    producto.setPrecio(300.0)  // Modificar el precio
    producto.setDescuento(20.0)  // Modificar el descuento
    println("\nPrecio actualizado: ${producto.getPrecio()} USD")
    println("Descuento actualizado: ${producto.getDescuento()}%")
    println("Nuevo precio final: ${producto.calcularPrecioFinal()} USD")
}
