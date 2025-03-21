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
    
}
