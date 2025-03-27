package OCP

interface Grafica {
    fun dibujar()
}

class GraficaBarras : Grafica {
    override fun dibujar() {
        println("Dibujando gráfica de barras")
    }
}

class GraficaLineas : Grafica {
    override fun dibujar() {
        println("Dibujando gráfica de líneas")
    }
}

fun main() {
    val grafica1: Grafica = GraficaBarras()
    val grafica2: Grafica = GraficaLineas()

    grafica1.dibujar()
    grafica2.dibujar()
}