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

// Interfaz IBiblioteca
interface IBiblioteca {
    fun registrarMaterial(material: Material)
    fun registrarUsuario(usuario: Usuario)
    fun prestarMaterial(usuario: Usuario, material: Material)
    fun devolverMaterial(usuario: Usuario, material: Material)
    fun mostrarMaterialesDisponibles()
    fun mostrarMaterialesReservadosPorUsuario(usuario: Usuario)
}

// Clase Biblioteca
class Biblioteca : IBiblioteca {
    private val materialesDisponibles = mutableListOf<Material>()
    private val usuarios = mutableMapOf<Usuario, MutableList<Material>>()

    override fun registrarMaterial(material: Material) {
        materialesDisponibles.add(material)
        println("Material registrado: ${material.titulo}")
    }

    override fun registrarUsuario(usuario: Usuario) {
        if (usuario !in usuarios) {
            usuarios[usuario] = mutableListOf()
            println("Usuario registrado: ${usuario.nombre} ${usuario.apellido}")
        } else {
            println("El usuario ya está registrado.")
        }
    }

    override fun prestarMaterial(usuario: Usuario, material: Material) {
        if (materialesDisponibles.contains(material)) {
            usuarios[usuario]?.add(material)
            materialesDisponibles.remove(material)
            println("Préstamo exitoso: ${usuario.nombre} ha tomado '${material.titulo}'")
        } else {
            println("Material no disponible para préstamo.")
        }
    }

    override fun devolverMaterial(usuario: Usuario, material: Material) {
        if (usuarios[usuario]?.contains(material) == true) {
            usuarios[usuario]?.remove(material)
            materialesDisponibles.add(material)
            println("Devolución exitosa: '${material.titulo}' regresado por ${usuario.nombre}")
        } else {
            println("El usuario no tiene este material en préstamo.")
        }
    }

    override fun mostrarMaterialesDisponibles() {
        println("\nMateriales disponibles en la biblioteca:")
        if (materialesDisponibles.isEmpty()) {
            println("No hay materiales disponibles.")
        } else {
            materialesDisponibles.forEach { it.mostrarDetalles() }
        }
    }

    override fun mostrarMaterialesReservadosPorUsuario(usuario: Usuario) {
        println("\nMateriales reservados por ${usuario.nombre} ${usuario.apellido}:")
        val materialesUsuario = usuarios[usuario]
        if (materialesUsuario.isNullOrEmpty()) {
            println("No tiene materiales reservados.")
        } else {
            materialesUsuario.forEach { it.mostrarDetalles() }
        }
    }
}

