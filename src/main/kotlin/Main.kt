fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

class Baraja {
    var palos_posibles = listOf("c", "r", "p", "t")
    var numeros_posibles = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13)
}

class Mano (size : Int) {
    var maximoCartas = 3
    var listaCartas = mutableListOf<Carta>()

    constructor():this(3){

    }


}