interface PersonInfoProvider {
    val providerInfo : String

    fun printInfo(person: Person) {
        println(providerInfo)
        person.printInfo()
    }
}
interface SessionInfoProvider {
    fun getSessionId(): String
}
open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {
    override val providerInfo: String
        get() = "BasicInfoProvider"

   protected open val sessionPrefix : String = "Session"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional info")
    }

    override fun getSessionId(): String {
        return sessionPrefix
    }
}
fun checkTypes(infoProvider: PersonInfoProvider) {
    if(infoProvider is SessionInfoProvider) {
        println("Session Provider")
    } else {
        println("Not a session")
    }
}
fun main() {
    val provider = BasicInfoProvider()
    //object expressions
    /*We can just create object directly and overide methods without creating new class*/
    val prov = object : PersonInfoProvider {
        override val providerInfo: String
            get() = "test"

    }
   // provider.sessionPrefix
    provider.printInfo(Person())
    println("-----------------------")
    checkTypes(provider)
    //provider.getSessionId()

    checkTypes(provider)

}
/*we can use companion objects to create obj of class which is private */