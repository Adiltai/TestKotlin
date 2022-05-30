package tasks

fun main (){
    val user1=User("kirill",23)
    val user2=User("Olga",35)
    val maxAgeUser=getMaxAgeUser(user1,user2)

    println("Ползователь ${maxAgeUser.name} старше. Его возраст: ${maxAgeUser.age}")
}

fun getMaxAgeUser(user1: User, user2:User): User{
    return if(user1.age>user2.age)
        user1
    else
        user2
}

data class User(val name: String, val age:Int)