var name:String="test"
val greet:String?=null
//Variables

/*fun sayHello(item:String,list: List<String>) {
    println("hello $item")
}*/

fun sayHello(item:String,vararg items:String) {
    println("hello $item")
    items.forEach { item -> println(item) }
}

fun sayHelloWorld (item:String) = println("hello $item")

fun main(args: Array<String>) {
    println("Hello World!")

    when(greet) {
        null -> println("hi")
        else -> println("helloooo")
    }
    //println("Program arguments: ${args.joinToString()}")
    //var name:String="test"
    val greeting = if(greet!=null)name else "Hi"
    val interestingThing = arrayOf("Kotlin","Java","Comics")
    println(name)
    println(greet)
    println(greeting)
    sayHello("ppb",*interestingThing) // cant pass it like hence we use spread operator
    sayHelloWorld("rit")

   // val interestingThing = listOf("Kotlin","Java","Comics")
    println(interestingThing[0])
    interestingThing.forEach{ interestingThing -> println(interestingThing) }
    /*val map = mapOf("a" to 1,"b" to 2)
    println(map["a"])
    map.forEach { t, u -> println("$t -> $u")  }
    //to modify collection we need to use mutable collection
    val mutableListE = mutableListOf("Kotlin","Java","Comics")
    mutableListE.add("Test");
    mutableListE.forEach{ interestingThing -> println(interestingThing) }*/
    // there is something called vararg which allows to take n no of parameneters
   // val person = Person("test","hi"); this wont call secondary constructor
    val person = Person();
    person.firstName
    person.lastName
    person.printInfo()
}

