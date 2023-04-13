fun printString(list:List<String>,predicate:(String) -> Boolean) {
    list.forEach {
        if(predicate(it)) {
            println(it)
        }
    }
}

fun printString1(list:List<String>,predicate:((String) -> Boolean)?) {
    list.forEach {
        if(predicate?.invoke(it) === true) {
            println(it)
        }
    }
}
val predicate : (String) -> Boolean = {
    it.startsWith("K")
}

fun getPredicates() : (String) -> Boolean {
    return {it.startsWith("C")}
}
fun main() {
    val list = listOf<String>("Kotlin","Java","Javascript","C++")
    printString(list,{it.startsWith("K")})
    printString1(list,{it.startsWith("J")})
    printString(list,getPredicates())
    printString(list,predicate)
    printString1(list,null)
}

// For nullable values we need to use invoke
// we can use functions as return type as well as parameters in higher order functions