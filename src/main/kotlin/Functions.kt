fun main() {
    val list = listOf("Java","Kotlin","Jacascript","CPP", null,null)

    list.filterNotNull().
        take(3).
        filter {
            it.startsWith("K")
        }.
        map{
            it.length
    }.
    forEach {
        println(it)
    }
}
