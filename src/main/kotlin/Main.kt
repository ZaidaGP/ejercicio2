import Serie
import VideoJuegos

fun main(args: Array<String>) {


    var series = arrayOf<Serie>()

    var videoJuego = arrayOf<VideoJuegos>()

    val serie1 = Serie("Anne whit an e", 3,"Romance","Nextflix")
    val serie2 = Serie("Better Call Saul","Nextflix")
    val serie3 = Serie("Gambito de Dama","Netflix" )
    val serie4 = Serie("Breaking Bad", "Netflix")
    val serie5 = Serie("The Big Bang Theory","HBO MAX")

    series = series.plus(serie1)
    series = series.plus(serie2)
    series = series.plus(serie3)
    series = series.plus(serie4)
    series = series.plus(serie5)

    var ser1 = serie4.entregar()
    var ser2= serie2.entregar()



    var contador: Int = 0
    for (i in series.indices){

        if(series[i].isEntregado()){
            contador++
            series[i].devolver()
        }

    }
    println(contador)

    val videoJ1 = VideoJuegos("Poe", 20)
    val videoJ2 = VideoJuegos("Snake", 10)
    val videoJ3 = VideoJuegos("Busca Minas", 8)
    val videoJ4 = VideoJuegos("Clash Royal", 20,"matansa","SuperCell")
    val videoJ5 = VideoJuegos("Spiner 3D", 7)

    videoJuego = videoJuego.plus(videoJ1)
    videoJuego = videoJuego.plus(videoJ2)
    videoJuego = videoJuego.plus(videoJ3)
    videoJuego = videoJuego.plus(videoJ4)
    videoJuego = videoJuego.plus(videoJ5)


    var video = videoJ1.entregar()
    var video2 = videoJ3.entregar()



    var contador2: Int = 0
    for (i in videoJuego.indices){

        if(videoJuego[i].isEntregado()){
            contador2++
            videoJuego[i].devolver()
        }


    }
        println(contador2)

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}