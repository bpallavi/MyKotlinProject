class FancyInforProvider : BasicInfoProvider() {
    override val sessionPrefix: String
        get() = "fancy sessionId"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Fancy info")
    }
}