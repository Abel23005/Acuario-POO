package acuario

fun construirAcuarioV1() {
    val miAcuario = Acuario()
    miAcuario.imprimirTamano()
    miAcuario.alto = 60
    miAcuario.imprimirTamano()
}

fun construirAcuarioV2() {
    val acuario1 = Acuario()
    acuario1.imprimirTamano()

    val acuario2 = Acuario(ancho = 25)
    acuario2.imprimirTamano()

    val acuario3 = Acuario(alto = 35, largo = 110)
    acuario3.imprimirTamano()

    val acuario4 = Acuario(ancho = 25, alto = 35, largo = 110)
    acuario4.imprimirTamano()
}

fun construirAcuarioV3() {
    val acuario5 = Acuario(numeroDePeces = 29)
    acuario5.imprimirTamano()
    val volumen = acuario5.ancho * acuario5.largo * acuario5.alto / 1000
    println("Volumen: ${volumen} l")
}

fun construirAcuarioV4() {
    val acuario = Acuario(numeroDePeces = 29)
    acuario.imprimirTamano()
    acuario.volumen = 70
    acuario.imprimirTamano()
}
fun crearPeces() {
    val tiburon = Tiburon()
    val pezPayaso = PezPayaso()

    println("Tiburón: ${tiburon.color}")
    println("Pez Payaso: ${pezPayaso.color}")
}

fun main() {
    crearPeces()
}

