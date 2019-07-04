package ru.skillbranch.devintensive.model

import ru.skillbranch.devintensive.utils.Utils
import java.lang.NumberFormatException
import java.util.*

data class User (
    val id:String,
    var firstName:String?,
    var lastName:String?,
    var avatar:String?,
    var rating:Int = 0,
    var respect:Int = 0,
    val lastVisit:Date? = Date(),
    val isOnline:Boolean = false

)
{
    constructor(id: String, firstName: String?,lastName: String?) : this(
    id=id,
    firstName=firstName,
    lastName=lastName,
    avatar=null
    )
    constructor(id: String) : this(id, "John", "Doe")
    init {
        println("It's alive!\n " +
                "${if (lastName=="Doe") "His name is $firstName $lastName"
        else "And his name is $firstName $lastName"}\n ")
    }
companion object Factory{
    private var lastId : Int = -1
    fun makeUser(fullName:String?): User{
        val (firstName, lastName) = Utils.parseFullName(fullName)
  /*      when (firstName){
            "", " ", null -> {
                println("Недопустимое значение, fullName не может быть пустой строкой, пробелом или null")
                throw NumberFormatException("")
            }
            else -> {
                lastId++
                return User(id="$lastId", firstName=firstName, lastName=lastName)
            }
        } */
        lastId++
        return User(id="$lastId", firstName=firstName, lastName=lastName)


    }
}
    private fun getIntro()="""
        retyertyer
        rteyertyert   ....
        tryeyerty  ....
        rtyrtyetr!!!!
        $firstName $lastName
    """.trimIndent()

    fun printMe():Unit{
        println("""
    $id
    $firstName
    $lastName
    $avatar
    $rating
    $respect
    $lastVisit
    $isOnline
        """.trimIndent())

    }
}