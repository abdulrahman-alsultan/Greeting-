fun main(){
    var message = "Hello user, welcome to my program!"
    println("Enter your name: ")
    var name = readLine()
    message = message.replace("user", name.toString())
    print(message)
}