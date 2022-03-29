import Entregable

class VideoJuegos : Entregable {

    var titulo : String = ""
    var horas_estimadas : Int = 10
    var entregado : Boolean = false
    var genero : String = ""
    var compannia : String = ""

    override fun entregar() {
        entregado = true
    }

    override fun devolver() {
        entregado = false
    }

    override fun isEntregado(): Boolean {
        return entregado
    }
    constructor()

    constructor(titulo_p : String, horas_estimadas_p :Int){
        titulo = titulo_p
        horas_estimadas = horas_estimadas_p
    }

    constructor(titulo : String, horas_estimadas : Int, genero : String, compannia : String){
        this.titulo = titulo
        this.horas_estimadas = horas_estimadas
        this.genero = genero
        this.compannia = compannia
    }

}