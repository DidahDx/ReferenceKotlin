//companion
class Entity private constructor(val id:String){

    //renaming to Factory
    companion object Factory: IdProvider{
        override fun getId(): String {
            return "12"
        }

        const val id="id"
        fun create()=Entity(getId())
    }
}

interface IdProvider{
    fun getId():String
}


fun main(){
    val entity= Entity.Factory.create()
    println(Entity.id)
}