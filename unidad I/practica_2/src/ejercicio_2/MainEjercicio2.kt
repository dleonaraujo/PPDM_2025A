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

}
