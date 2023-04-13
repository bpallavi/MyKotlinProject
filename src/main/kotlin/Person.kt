class Person (val firstName:String = "Peter",val lastName:String = "Parker") //default values
{
    init {
        println("init 1")
    }
    constructor():this("pete","karl") {
        println("secondary constructor")
    }

    init {
        println("init 2")
    }

    var nickName:String?=null
        set(value) {
            field = value
            println("new nickname value $value") //this is setter
        }
        get() {
            println("get vakue is $field")
            return field
        }

    fun printInfo() {
        val nickNameToPrint = nickName ?:"no name"
        println("$firstName $lastName $nickNameToPrint")
    }
    //by default access modifiers is public, it can be private, internal-> same submodules,protected
}