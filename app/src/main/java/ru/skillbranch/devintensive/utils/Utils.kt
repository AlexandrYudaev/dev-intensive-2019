package ru.skillbranch.devintensive.utils

object Utils {
    fun  parseFullName(fullName:String?):Pair<String?, String?> {
        val parts: List<String>? = fullName?.split(" ")
        val firstName = parts?.getOrNull(0)
        val lastName = parts?.getOrNull(1)

        when (firstName) {
            "", " ", null -> return Pair(null, null)
            else -> {
               when (lastName) {
                   "", " " -> return Pair(firstName, null)
                   else -> return Pair(firstName, lastName)
               }
            }

        }
    }

    fun transliteration(payload: String, divider: String = " "): String {
        //todo
       return payload
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return "A A"
    }
}