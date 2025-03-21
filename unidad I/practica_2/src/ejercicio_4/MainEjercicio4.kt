// Clase abstracta Material
abstract class Material(
    val titulo: String,
    val autor: String,
    val anioPublicacion: Int
) {
    abstract fun mostrarDetalles()
}

// Subclase Libro
class Libro(
    titulo: String,
    autor: String,
    anioPublicacion: Int,
    private val genero: String,
    private val numeroPaginas: Int
) : Material(titulo, autor, anioPublicacion) {

    override fun mostrarDetalles() {
        println("Libro: $titulo | Autor: $autor | Año: $anioPublicacion | Género: $genero | Páginas: $numeroPaginas")
    }
}

// Subclase Revista
class Revista(
    titulo: String,
    autor: String,
    anioPublicacion: Int,
    private val issn: String,
    private val volumen: Int,
    private val numero: Int,
    private val editorial: String
) : Material(titulo, autor, anioPublicacion) {

    override fun mostrarDetalles() {
        println("Revista: $titulo | Autor: $autor | Año: $anioPublicacion | ISSN: $issn | Volumen: $volumen | Número: $numero | Editorial: $editorial")
    }
}

// Data class Usuario
data class Usuario(val nombre: String, val apellido: String, val edad: Int)

