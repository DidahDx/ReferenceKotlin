interface PersonInfoProvider {
    val provider: String
    fun printInfo(person: Person) {
        //basic default implementation of the interface
        println(provider)
        person.PrintInfo()
    }
}

interface SessionInfoProvider{
    fun getSessionId():String
}


//implementing an interface
//adding open keyword in order to inherit from this class
open class BasicInfo : PersonInfoProvider, SessionInfoProvider {

    override val provider: String
        get() = "Basic"

    //not to be accessed outside
    protected open val sessionIdPrefix="12"

    override fun getSessionId(): String {
        return sessionIdPrefix
    }

    //overiding with a default implementation
    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("New statement")
    }

//    override fun printInfo(person: Person) {
//        person.PrintInfo()
//    }
}

//using
fun main() {
    val provider = BasicInfo()

    provider.printInfo(Person())
    println(provider.getSessionId())
    checkTypes(provider)
}

//checking the types of
fun checkTypes(infoProvider: PersonInfoProvider){
    if (infoProvider is SessionInfoProvider){
        println("$infoProvider is a session")

        //casting using keyword as
        (infoProvider as SessionInfoProvider).getSessionId()

        //smart casting as long as type is SessionInfoProvider
        infoProvider.getSessionId()


    }else{
        println("$infoProvider is not session")
    }
}