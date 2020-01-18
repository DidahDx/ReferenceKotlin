//defining properites of the class using val
//and assigning default values
class Person(val name: String = "Name", val sona: String = "sona") {

    var NickName: String? = null
        set(value) {
            //defining a custom set
            field = value

            //defining new logic
            println("the name $value")
        }
        get() {
            println("returned the value $field")
            return field
        }

    //method
    fun PrintInfo() {
        //  val nicName=if (NickName!=null) NickName else "No nickname"
        //elvis operator
        val nicName = NickName ?: "No nickname"
        println("$name ($nicName) $sona")
    }
}

//for val only getters are generated
//for var setters and getters are generated
//visibility in kotlin is public by default
// other visibility (internal) (protected) (private)
//protected can only be accessed within that class or in subclasses