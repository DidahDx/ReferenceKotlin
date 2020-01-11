val name: String = "Test"
var gate: String? = null // nullable string
var age = 123   //type inference

fun main() {
    println(name)
    println(age)

    if (gate != null) {
        println(gate)
    }

    // when similar to switch in java
    when (gate) {
        null -> println("Hey")
        else -> println(gate)
    }

    val greeting = if (gate!=null) gate else "hey"
    println(greeting)
}