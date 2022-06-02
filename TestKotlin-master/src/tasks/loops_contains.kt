package tasks

fun main() {
    val email="snowbarsy_996@mail.ru"

    if(!email.contains('@')|| !email.contains('.'))
        println("Email no correct")
}