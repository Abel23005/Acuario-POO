package acuario

import kotlin.math.PI

open class Acuario(
    open var largo: Int = 100,
    open var ancho: Int = 20,
    open var alto: Int = 40
) {
    open var volumen: Int
        get() = (ancho * alto * largo) / 1000
        set(valor) {
            if (ancho * largo > 0) {
                alto = (valor * 1000) / (ancho * largo)
            }
        }

    open val forma: String = "rectángulo"
    open val agua: Double
        get() = volumen * 0.9  // 90%

    constructor(numeroDePeces: Int) : this() {
        val tanqueCm3 = (numeroDePeces * 2000 * 1.1).toInt()
        if (largo * ancho > 0) {
            alto = (tanqueCm3 / (largo * ancho))
            if (alto <= 0) alto = 10
        }
    }

    fun imprimirTamano() {
        println("Forma: $forma")
        println("Ancho: $ancho cm  Largo: $largo cm  Alto: $alto cm")
        println("Volumen: $volumen l  Agua: $agua l")
    }
}

class TanqueTorre(
    override var alto: Int,
    var diametro: Int
) : Acuario(ancho = diametro, largo = diametro, alto = alto) {

    override var volumen: Int
        get() = ((ancho / 2.0) * (largo / 2.0) * alto / 1000.0 * PI).toInt()
        set(valor) {
            alto = ((valor * 1000.0 / PI) / ((ancho / 2.0) * (largo / 2.0))).toInt()
        }

    override val agua: Double
        get() = volumen * 0.8

    override val forma: String = "cilindro"
}
