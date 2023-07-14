fun main(){
    val car1=Car("Blue",40)
    val car2=Car("White")   //here secondary constructor is called which in turn calls the primary consructor
    println("Color of car is ${car1.color} and speed of car is ${car1.speed}")
    car1.speedUp()
    car1.speedUp()
    car1.speedDown()
}