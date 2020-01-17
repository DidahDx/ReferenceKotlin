fun main() {
    println("test " + getGreeting() + " " + someGreeting())
    sayHello()
    hello("World")
    hello("where is the", "World")
    makingArrays()

    val list=listOf("cars","sffs","guys")
    sayHello(list)
    sayHello("HEY","list","car","bmw","cat")
}

fun getGreeting(): String {
    return "Function call"
}

//Unit is used when fun does not return anything
fun sayHello(): Unit {
    println("Hello")
}

//passing a collection
fun sayHello(greeting:List<String>){
    greeting.forEach {items->
        println(" HEY $items")
    }
}

//using vararg
fun sayHello(hey:String,vararg greeting: String){
    greeting.forEach {items->
        println(" HEY $items")
    }
}

fun hello(customGreeting: String) {
    println("Hello $customGreeting")
}

//fun using string template
fun hello(greeting: String, customGreeting: String) = println("$greeting $customGreeting")

//single expression of fun and type inference
fun someGreeting() = "Hi"

//arrays and list
fun makingArrays() {
    //replacing arrayOf with listOf works similar to array
    val things = arrayOf("cars", "books", "table", "pen")
    val thingsList = listOf("cars", "books", "table", "pen","list","container")
    println(things.size)
    println(thingsList.size)
    println(things.iterator())

    for (t in things) {
        println(t)
    }

    things.forEach { println(it) }
    thingsList.forEach { println(it) }

    things.forEachIndexed { index, thing -> println("$thing is at index $index")  }


    //maps
    val map= mapOf(1 to "a", 2 to "e", 3 to "l")
    map.forEach { (key, value) -> println("$key -> $value")  }

}