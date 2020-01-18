//defining properites of the class using val
class Person(val name:String,val sona:String){

    init {
        println("init 1")
    }

    //secondary constructor with default values
    constructor():this("Name","sona"){
        println("Secondary con")
    }

    init {
        println("init 2")
    }

}