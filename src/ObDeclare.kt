import java.util.*

//object declaration
object ObDeclare {
    fun create(type:EntityFactory): Entities {
        val id=UUID.randomUUID().toString()
        val name=when(type){
            EntityFactory.EASY -> type.getFormattedName()
            EntityFactory.MEDIUM -> type.getFormattedName()
            EntityFactory.HARD -> type.getFormattedName()
        }
        return Entities(id, name)
    }
}

enum class EntityFactory{
    EASY,MEDIUM,HARD;
    
    fun getFormattedName()=name.toLowerCase().capitalize()
}


class Entities(val id: String, val name: String) {
    override fun toString(): String {
        return "id:$id  name:$name"
    }
}

fun main() {
    val entity = ObDeclare.create(EntityFactory.EASY)
    println(entity)
    val entityMedium = ObDeclare.create(EntityFactory.MEDIUM)
    println(entityMedium)
}