interface PersonInfoProvider {
    fun printInfo(person: Person)
}

//implementing an interface
class BasicInfo : PersonInfoProvider {
    override fun printInfo(person: Person) {
        person.PrintInfo()
    }
}

//using
fun main() {
    val provider=BasicInfo()

    provider.printInfo(Person())
}