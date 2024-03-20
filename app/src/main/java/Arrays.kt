

fun main () {


    val weekDays = arrayOf("lunes","martes","jueves","viernes","sabado","domingo")
    val weekDays2 = arrayOf("lunes","viernes","jueves","miercoles","sabado","domingo")

    val igualDays = weekDays.filter { it in weekDays2 }.toTypedArray()

    igualDays.forEach { println(it) }
}

