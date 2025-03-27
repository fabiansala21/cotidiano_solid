package SRP

class Cliente(val nombre: String, val edad: Int)

class GuardarCliente {
    fun guardar(cliente: Cliente) {
        println("Guardando cliente en la base de datos: ${cliente.nombre}")
    }
}

class EdadCliente {
    fun mostrarEdad(cliente: Cliente) {
        println("La edad del cliente ${cliente.nombre} es: ${cliente.edad}")
    }
}

class EnviarCorreo {
    fun enviar(cliente: Cliente) {
        println("Enviando correo a ${cliente.nombre}")
    }
}

fun main() {
    val cliente = Cliente("Carlos", 28)
    val guardarCliente = GuardarCliente()
    val edadCliente = EdadCliente()
    val enviarCorreo = EnviarCorreo()

    guardarCliente.guardar(cliente)
    edadCliente.mostrarEdad(cliente)
    enviarCorreo.enviar(cliente)

}
