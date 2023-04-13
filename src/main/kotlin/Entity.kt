import java.util.*;
enum class EntityType {
    EASY,MEDIUM,HARD,HELP;



    fun formattedType() {
        name.lowercase()
    }
}
/*class Entity(val id:String, val name: String) {
    override fun toString(): String {
        return "id:$id name:$name"
    }
}*/


object EntityFactory {
    fun create(type:EntityType):Entity {
        val id = UUID.randomUUID().toString()
        val name = when(type) {
            EntityType.EASY -> type.name
            EntityType.MEDIUM -> type.formattedType()
            EntityType.HARD -> type.formattedType()
            EntityType.HELP -> TODO()
        }
        return when(type) {
            EntityType.EASY -> Entity.Easy("id","name")
            EntityType.MEDIUM -> Entity.Medium("id1","name1", 20F)
            EntityType.HARD -> TODO()
            EntityType.HELP -> Entity.Help
        }
    }
}

/*Sealed classes and interfaces represent restricted class hierarchies that provide more control over inheritance.
**
All direct subclasses of a sealed class are known at compile time. */
/*They are like enums to some extent.
* A sealed class is abstract by itself, it cannot be instantiated directly and can have abstract members.
* **/
sealed class Entity() {
    object Help : Entity() {
        val name = "help"
    }
    data class Easy(val id: String, val name: String) :Entity()
    data class Medium(val id: String, val name: String, val value:Float): Entity ()
    /** data class is like pojo, they have equals, hashcode and tostring method by default and we can ovveride those
     * **/

}

/**
 * Extension methods and properties can be defined. say for medium i can create an additionla method as below
 * **/

fun Entity.Medium.printInfo() {
    println("id is $id")
}

//extension of property
val Entity.Medium.info: String
    get() = "test"

fun main() {
    var entity = EntityFactory.create(EntityType.EASY)
    var entity2 = EntityFactory.create(EntityType.MEDIUM)
    if(entity2 is Entity.Medium) {
        entity2.printInfo()
        entity2.info
    }
    println(entity)
}