import Entregable
class Serie : Entregable {



    var titulo : String = ""
    var num_temporadas : Int = 3
    var entregado : Boolean = false
    var genero: String = ""
    var creador : String = ""

    override fun devolver(){
        entregado = false
    }

    override fun isEntregado(): Boolean {
        return entregado
    }

    override fun entregar(){
        entregado = true
    }

    constructor()

    constructor(titulo_p :String, num_temporadas_p : Int, genero_p : String, creador_p: String){

        titulo = titulo_p
        num_temporadas = num_temporadas_p
        genero = genero_p
        creador= creador_p

    }
    constructor(titulo: String, creador : String){
        this.titulo = titulo
        this.creador = creador
    }

}