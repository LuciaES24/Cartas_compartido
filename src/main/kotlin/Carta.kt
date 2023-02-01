import kotlin.random.Random
class Carta(numero: Int, palo:Char) {
    var numero = numero
        set(valor){
            if (valor>0 && valor<=13){
                field = valor
            }else{
                println("Número erróneo")
            }
        }
        get():Int{
            return field
        }
    var palo = palo
        set(valor){
            if (valor=='c' || valor == 'p' || valor == 'r' || valor == 't'){
                field = valor
            }else{
                println("Palo erróneo")
            }
        }
        get(){
            return field
        }

    constructor(otraCarta: Carta):this(otraCarta.numero, otraCarta.palo){}

    fun mostrar_carta(){
        var paloMostrar = ""
        when {
            palo ==  'c' -> paloMostrar = "Corazones"
            palo == 'r' -> paloMostrar = "Rombos"
            palo == 't' -> paloMostrar = "Tréboles"
            palo == 'p' -> paloMostrar = "Picas"
        }
        when(numero){
            in 2..10-> println("$numero de $paloMostrar")
            1 -> println("As de $paloMostrar")
            11 -> println("Jack de $paloMostrar")
            12 -> println("Reina de $paloMostrar")
            13 -> println("Rey de $paloMostrar")
        }
    }

    fun palo_aleatorio (): Char{
        val l = listOf<Char>('c', 'p', 't', 'r')
        return (l.get((0..3).random()))
    }

    fun numeroAPalo(n:Int):Char{
        val l = listOf<Char>('C', 'P', 'R', 'T')
        if (n>=0 && n<=3)
            return(l.get(n) )
        else return l.get(0)
    }
    fun compararCarta(otraCarta : Carta):Int {
        /*
        var numero2 = this.numero
        var palo2 = this.palo*/
        if (this.numero > otraCarta.numero) {
            print("La carta mayor es: ")
            this.mostrar_carta()
            return -1
        } else if (this.numero < otraCarta.numero) {
            print("La carta mayor es: ")
            otraCarta.mostrar_carta()
            return 1
        } else {//número iguales
            if (this.palo > otraCarta.palo) {
                print("La carta mayor es: ")
                this.mostrar_carta()
                return -1
            } else {
                print("La carta mayor es: ")
                otraCarta.mostrar_carta()
                return 1
            }
        }
    }
}

