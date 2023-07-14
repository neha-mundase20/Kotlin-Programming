class Car constructor(color:String="Blue"/* default values are passed when no value is provided*/,speed:Int=40){  //this is how a primary constructor is created
    // these are called parameters which are passed in the brackets

    //variables
    //properties of the object

    var color:String=color
    var speed:Int=speed

    constructor(color:String):this(color,speed=40)   //secondary constructor is automatically called when if less number of parameters are passed
    //it assigns default values to all the rest parameters by calling the primary constructor

    // methods/functions
    fun speedUp(){
        speed=speed+10;
        println("Speed of Car is $speed")
    }
    fun speedDown(){
        speed=speed-10;
        println("Speed of Car is $speed")
    }
}