
//inheriting from BasicInfo()
class FancyInfoProvider :BasicInfo() {
    //overriding properties
    override val sessionIdPrefix: String
        get() = "Fancy Session"

    override val provider: String
        get() = "Fancy"

    //overriding methods
    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Fancy print")
    }
}


fun main(){
    val fanProvider= FancyInfoProvider()
   println(fanProvider.provider)
    println(fanProvider.getSessionId())
    fanProvider.printInfo(Person())
}