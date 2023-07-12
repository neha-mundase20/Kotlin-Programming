import java.util.Scanner

// 'fun' is the keyword to create a function
// main() is the entry point to the program
fun main(){
    var userName:String="Neha"
    println("Hello $userName")

    var intMaxValue:Int= Int.MAX_VALUE  //retreives the maximum value present in the integer
    var intMinValue:Int= Int.MIN_VALUE

    println("$intMaxValue")
    println("$intMinValue")

    var number1:Float=2.5f //while mentioning float specify it by writing 'f'
    var number2:Double=2.5
    println("$number1")
    println("$number2")

    var number:Int=150

    if(number>100 && number<200){
        println("Number lies between 100 and 200")
    }
    else if (number>=200){
        println("Number is greater than or equal to 200")
    }
    else{
        println("Number is out of bounds")
    }

    //Instead of switch case we use here when statement
    when(number){
        150-> println("Number is 150")
        else-> println("Number is not 150")
    }

    var text: String? = "Name"

    //println(text.length)  ->  This shows an error why because as the text can store a null
    //value we can't calculate the length if the value is null. Hence we need to first
    //perform a null check

    if(text!=null){
        println(text.length)
    }
    else {
        println("The value is null")
    }

    val sc=Scanner(System.`in`)

    println("1.Convert from degree to kelvin scale")
    println("2.Convert from kelvin to degree scale")
    val choice:Int= sc.nextInt()
    //val choice:Int= readLine()!!.toInt()

    when(choice){
        1-> {
            println("Enter the temperature in degrees:")
            var temp=sc.nextDouble()
            println("The temperature in kelvin scale is :"+ degToKelvin(temp))
        }
        else->{
            println("Enter the temperature in kelvin:")
            var temp=sc.nextDouble()
            println("The temperature in degree scale is :"+ kelvinToDeg(temp))
        }
    }
}

fun degToKelvin(temp:Double):Double{
    val kelvinTemp=temp+273.15
    return kelvinTemp
}

fun kelvinToDeg(temp:Double):Double{
    val degreeTemp=temp-273.15
    return degreeTemp
}
