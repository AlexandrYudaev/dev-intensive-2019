package ru.skillbranch.devintensive.extension

import ru.skillbranch.devintensive.model.User
import ru.skillbranch.devintensive.model.UserView
import ru.skillbranch.devintensive.utils.Utils
import java.util.*

fun User.toUserView() : UserView{
    val nickname = Utils.transliteration("$firstName $lastName")
    val initials = Utils.toInitials(firstName, lastName)
    val status = if(lastVisit == null) "Ни разу не был" else if (isOnline) "Online"
                else "Последний раз был ${lastVisit.humanizeDiff()}"
    return UserView(
        id,
        fullName = "$firstName $lastName",
        nickName = nickname,
        initials = initials,
        avatar = avatar,
        status = status)
}
private fun Date.humanizeDiff(date:Date = Date()) : String {
    //todo
   // if(Date-Date()>=366* DAY) return "более чем через год" else if (Date-Date()<=-366* DAY) return "более года назад"
  //  else {}
    return "гармонизованная дата"
}