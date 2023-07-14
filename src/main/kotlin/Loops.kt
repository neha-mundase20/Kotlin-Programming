fun main(){

    // 'for' loop has auto-increment feature

    for (i in 1..10){
        println("i = "+ "$i")
    }
    for (i in 1 until 10){  //here the end value is not included in the range
        println("i = "+ "$i")
    }
    for (i in 10 downTo 1){  //downTo is used for reverse counting
        println("i = "+ "$i")
    }
    for (i in 1..10 step 2){  //step provides the stepsize i.e. gaps in the looping
        println("i = "+ "$i")
    }
    for (i in 0..10 step 4){
        println("i = "+ "$i")
    }

//    var number:Int=20
//    while(number>0){
//        println(number)
//        number--
//    }

    var number:Int=20
    do{
        println(number--)
    }while (number>20)   //do-while runs atleast once coz it checks the condition after execution

    //continue skips that respective iteration and break keyword breaks the entire loop

    //while(number>0) println(number--)
}