package OCP

interface Envio {
    fun enviar(archivo: String)
}

class EnvioFTP : Envio {
    override fun enviar(archivo: String) {
        println("Enviando archivo por FTP: $archivo")
    }
}

class EnvioHTTP : Envio {
    override fun enviar(archivo: String) {
        println("Enviando archivo por HTTP: $archivo")
    }
}

fun main() {
    val envio1: Envio = EnvioFTP()
    val envio2: Envio = EnvioHTTP()

    envio1.enviar("documento.txt")
    envio2.enviar("imagen.jpg")
}