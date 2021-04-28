import kotlin.random.Random

fun main(args: Array<String>) {
    println("Hello World!")


    // VIDEO 1

    var num1 = 0
    num1++

    val num2 = 0
    // num2++

    var lista1 = mutableListOf(1,2,3,4,5)

    val lista2 = mutableListOf(6,7,8,9,10)


    val num3 : Int? = 1

    // val num4 = num3 + num2 Esto no me deja xq num3 es de tipo INT? que es distinto del tipo INT

    if (num3 != null) {
        val num4 = num3 + num2
    } else {
        println("No puedo hacer la operación xq num3 es null")
    }

    num3?.let { // Si num3 no es un null, ejecuta el siguiente código
        val num4 = it + num2
    } ?: run {
        println("No puedo hacer la operación xq num3 es null")
    }

    when (num3) {
        0 -> println("Valor 0")
        1 -> {
            println("Valor 1")
            println(":)")
        }
        null -> {
            println("Valor nulo")
            println(":(")
        }
        else -> {
            println("Cualquier otra cosa")
        }
    }

    // Quiero tener un variable num4 que sea la suma de num3 y num2.
    // En caso de que num3 sea null, entonces multiplicamos num2 * num2

    // Método Java style - old school
    var num4 = 0
    if (num3 != null) {
        num4 = num2  + num3
    } else {
        num4 = num2 * num2
    }
    println("el resultado es $num4")

    val num5 = if (num3 != null) {
        println("Esto no afecta al resutlado.")

        num2  + num3
    } else {
        println("estoy en el else")
        num2 * num2
    }

    println("el resultado es $num5")


    var num6 = if (num3 != null) num2 + num3 else num2 * num2


    var num7 = when (num3) {
        0 -> "Valor 0"
        1 -> "Valor 1"
        null -> "Valor nulo"
        else -> "Cualquier otra cosa"
    }
    println(num7)

    // Que sería igual a :
    println(when (num3) {
        0 -> "Valor 0"
        1 -> "Valor 1"
        null -> "Valor nulo"
        else -> "Cualquier otra cosa"
    })


    // Video 2

    // Suma en num8 numeros aleatorios hasta que llegue a 100 (incluido)
    var condicionCumplida = false
    var num8 = 0

    while (!condicionCumplida) {
        num8 += Random.nextInt(10)
        if (num8 >= 100) condicionCumplida = true
        println(num8)
    }

    // Equivalente a los anterior
    num8 = 0
    while (num8 <= 100) {
        num8 += Random.nextInt(10)
        println(num8)
    }

    num8 = 0
    do { // Muy parecido a lo anterior pero forzando la entrada una vez
        num8 += Random.nextInt(10)
        println(num8)
    } while (num8 <= 100)

    repeat(10) {
        println("Estoy en la repetición $it")
    }

    num8 = 0
    for (i in 0..20) {
        println("Estoy en la repetición $i")
        num8 += Random.nextInt(10)
        if (num8 > 100) break
    }


    // Crear lista vacia sin parámetros. Te fuerza a especificar tipo
    var listVacia = listOf<Int>()

    // Crear lista con parámetros. No te fuerza a especificar tipo
    val listNumeros = listOf(1,2,3,4)

    // Una lista mutable nos permite añadir y eliminar elementos
    val listNumerosMutable = mutableListOf(1,2,3,4)
    listNumerosMutable.add(5)


    // Podemos transformar una lista no mutable en una COPIA de la lista mutable.
    var copiaListaVacia = listVacia.toMutableList()
    copiaListaVacia.add(1)
    copiaListaVacia.add(2)
    copiaListaVacia.add(3)
    listVacia = copiaListaVacia
    println(listVacia)

    // Para leer lso elementos de una lista se hace :
    copiaListaVacia[0]


    // Para eliminar un elemento
    copiaListaVacia.remove(2) // Nos elemina al 2 xq eliminamos a un elemento que es un 2
    println(copiaListaVacia)
    copiaListaVacia.removeAt(1) // Nos elimina al 3 xq está en la segunda posición.
    println(copiaListaVacia)


    val listaPalabras = mutableListOf("Uno", "Dos", "Tres")
    listaPalabras.remove("Dos") // Nos elemina al "Dos" xq eliminamos a un elemento que es un "Dos"
    println(listaPalabras)
    listaPalabras.removeAt(1) // Nos elimina al 3 xq está en la segunda posición.
    println(listaPalabras)

    listaPalabras.forEach {
        println(it)
    }

    copiaListaVacia.forEach { numero ->
        println(numero)
    }

    val listaPalabrasLargas = mutableListOf("Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete")
    // Quiero que me escriba los elementos cuyo nunmero de caracteres es par.
    listaPalabrasLargas.forEach { numero ->
        if (numero.length % 2 == 0) println(numero)
    }
    for (palabra  in listaPalabras){
        if (palabra.length % 2 == 0) println(palabra)
    }

    // Quiero que me escriba los elementos cuya posición es PAR.
    listaPalabrasLargas.forEachIndexed { posicion, elemento ->
        if (posicion % 2 == 0) println(elemento)
    }
    for (posicion  in listaPalabras.indices){
        if (posicion % 2 == 0) println(listaPalabras[posicion])
    }

    println("*******")

    // Quiero que me escriban todos los elementos cuyo nombre contiene una letra "a"
    listaPalabrasLargas.forEach { numero ->
        if (numero.contains("a")) println(numero)
    }

    println("*******")

    // Quiero que me escriban todos los elementos cuyo nombre contiene una letra "o" y no está ni en la primera ni en la última posición
    listaPalabrasLargas.forEachIndexed { posicion, numero ->
        if (numero.contains("o") && posicion != 0 && posicion != listaPalabrasLargas.lastIndex) println(numero)
    }


    // Llamar a una función
    miFuncion1()
    miFuncion2(1)
    miFuncion3(null)
    miFuncion4(1,2)
    miFuncion5(1,2)
    miFuncion5(miVariable2 = 1,miVariable1 = 2)
    miFuncion6()
    miFuncion6(1)
    miFuncion6(miVariable2 = 2)


    escribeEsto(1)
    escribeEsto("uno")


    // Clases
    val nombreCompleto = NombreCompleto("Carlos", "Tena")
    val persona = Persona(nombreCompleto)
    persona.edad = 30
    persona.setDni("12345678B")
    println(persona.toString())

    val profesor = Profesor( NombreCompleto("Alfredo", "XI"), 111111L)
    profesor.numeroLicencia
    println(profesor.toString())
    profesor.saluda()

    val secretario = Secretario(NombreCompleto("Rodolfo", "V"))
    secretario.saluda()
    secretario.apuntaCita()


    val alumno=Alumno(NombreCompleto("Sergio","Bláquez"))
    println(alumno.toString())
    println(alumno.llegarTarde())


    println("Empezamos con la lista")
    val lista = listOf(profesor, secretario)
    lista.forEach {
        it.saluda()
    }


    println("\nEjercicio olimpiadas: \n")

    val esgrima1=Esgrima("Rodolfo")
    val esgrima2=Esgrima("Santiago")
    val esgrima3=Esgrima("Pepe")

    val maraton1=Maraton("Ana")
    val maraton2=Maraton("Pedro")
    val maraton3=Maraton("María")

    val natacion1=Natacion("Jorge")
    val natacion2=Natacion("Laura")
    val natacion3=Natacion("Juan")

    val listaDeportes= listOf(esgrima1,esgrima2,esgrima3,maraton1,maraton2,maraton3,natacion1,natacion2,natacion3)
    listaDeportes.forEach {
        it.hacerDoporte()
    }
    val listaNumeros= mutableListOf<Int>()

    for(i in 0..100){

        listaNumeros[i]= Random.nextInt(0,100)

    }
    var sumatorio=0
    listaNumeros.forEach {
        sumatorio+=it
    }

    val listaFinal=mutableListOf<Int>()
    println("La media es de ${sumatorio/100}")
    for(j in 0..100){
        if(listNumeros.get(j)<sumatorio/100)
            listaFinal.add(listaNumeros.get(j))
    }
    listaFinal.forEach {
        println(it)
    }
}

fun miFuncion1() {
    println("Soy la función1")
}

fun miFuncion2(miVariable : Int) {
    println("Soy la función2 $miVariable")
}

fun miFuncion3(miVariable : Int?) {
    println("Soy la función3 $miVariable")
}

fun miFuncion4(miVariable1 : Int, miVariable2 : Int) {
    println("Soy la función4 y sumo ${miVariable1 + miVariable2}")
}

fun miFuncion5(miVariable1 : Int, miVariable2 : Int) : Int {
    println("Soy la función4 y devuelvo cosas")
    return miVariable1 + miVariable2
}

fun miFuncion6(miVariable1 : Int = 0, miVariable2 : Int = 0) : Int {
    println("Soy la función4 y devuelvo cosas")
    return miVariable1 + miVariable2
}

fun escribeEsto(numero: Int){
    println("El numero es $numero")
}

fun escribeEsto(texto: String){
    // No tiene xq parecerse a escribeEsto(numero: Int)
    println("El numero es $texto")
}


// La clase más pequeña posible.
// El open se añade al heredar.
open class Persona(var nombreCompleto : NombreCompleto){
    // edad var es pública, no pongo restricciones a que lo cambien.
    var edad = 18
    // dni no es publica, quiero asegurarme que toda DNI tiene 8 cifras y acaba en una letra
    private var dni : String? = null

    fun setDni(dni: String) {
        if (dni.length == 9 && dni[dni.length-1].isLetter()) {
            this.dni = dni
        }
    }

    override fun toString(): String {
        return "Soy ${nombreCompleto.nombre} con DNI $dni"
    }
}

class NombreCompleto(var nombre: String, var apellido:String)

// La herencia - Me quedo con tode lo que hace el padre más lo que yo quiera añadir
class Profesor(nombre : NombreCompleto, var numeroLicencia: Long) : Persona(nombre), PuedeSaludar {
    override fun saluda() {
        println("Soy el profesor y te digo Hello.")
    }

    override fun toString(): String {
        return "Soy ${nombreCompleto.nombre} y su número de licencia es $numeroLicencia"
    }
}

class Alumno(nombre: NombreCompleto):Persona(nombre){

    override fun toString(): String {
        return "Soy ${nombreCompleto.nombre} y he \"copiado\" ${Random.nextInt(0, 100)} veces"
    }

    fun llegarTarde():String{
        return "He llegado ${Random.nextInt(1,5)} minutos tarde"
    }
}


class Secretario(nombre : NombreCompleto) : Persona(nombre), PuedeSaludar {
    override fun saluda() {
        println("Soy el secreatrio y te digo Hola.")
    }
    fun apuntaCita() {
        println("Ok, cita apuntada")
    }

}

interface PuedeSaludar {
    fun saluda()
}
//Ejercicio Herencia e Interfaz



abstract class Participante(var nombre: String){

    override fun toString(): String {
        return "Soy el participante $nombre"
    }
    abstract fun hacerDoporte()
}

class Esgrima(nombre: String): Participante(nombre){
    override fun hacerDoporte() {
        println(super.toString()+" y yo pego espadazos")
    }


}

class Maraton(nombre: String): Participante(nombre){

    override fun hacerDoporte() {
        println(super.toString()+" y yo corro durante mucho rato")
    }

}

class Natacion(nombre: String): Participante(nombre){

    override fun hacerDoporte() {
        println(super.toString()+" y ... chof chof chof ...")
    }

}



