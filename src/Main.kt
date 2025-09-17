//fun main(){
//    val x :Int = 5
//    println(x)
//}
//fun main(){
//    val name:String="Danish Nawaz"
//    println("my name is $name")
//}
//fun main(){
//    val name:String="Danish Nawaz"
//    val age :Int= 21
//    val Rollno:Int=11222757
//    val Section:String="F1"
//    println("My name is $name")
//    println("Age $age")
//    println("Roll No . $Rollno")
//    println("Section $Section")
//
//}

// *count down*
//fun main(){
//    var num= 10
//    while (num >= 0){
//        println(num)
//        num = num - 1
//    }
//}
// The Table of Two
//fun main(){
//    var num = 2
//    while (num <=10){
//        println(2 * num )
//        num = num + 1
//    }
//}



// Arithmetic Operators
// Addition of two numbers
//fun main(){
//    val num1 = 10
//    val num2 = 20
//    println(num1 + num2 )
//}



// Multiplication of Two numbers

//fun main(){
//    val mul1 = 8
//    val mul2 = 4
//    println(mul1 * mul2)
//}


// division of two numbers

//fun main(){
//    val div1 = 100
//    val div2 = 20
//    println(div1 / div2)
//}



// Subtraction of two numbers


//fun main(){
//    val sub1= 10
//    val sub2 = 30
//    println(sub1 - sub2 )
//}


// Modulo operator

//fun main(){
//    val mol1 = 10
//    val mol2 = 3
//    println(mol1 % mol2)   // So , it will return remainder
//}


//fun main(){
//    println("Enter your numbers : ")
//    val input = readln()
//    val inputAsInteger= input.toIntOrNull()
////    val isEven = inputAsInteger !!  % 2 ==0
//    println("Your Input is $inputAsInteger")
//}


//when Expression
// Using when as an Expression

//fun main(array: Array<String>){
//    var number = 2
//
//    var provideNumber= when(number){
//        1 -> "One"
//        2 -> "Two"
//        3 -> "Three"
//        4 -> "Four"
//        else ->"Invalid Numbers"
//    }
//    println("The desired number will be $provideNumber")
//}

////Using when Without Expression
//fun main(){
//    var num= 8
//    when(num){
//        1 -> println("It is not rainy today")
//        2 -> println("very hot today")
//        3 -> println("Hotty day")
//        8 -> println("Hello , Good morning !!")
//        else -> println("Invalid numbers!!")
//    }
//}


// Multiple Statement of when Using Braces


//fun main(){
//    var num= 9
//
//    when(num){
//        1 -> {
//            println("Hello , Muskan I love you")
//            println("To kaisi ho ")
//        }
//        7 -> {
//            println("Hello , Danish Nawaz")
//            println("Good Night , EveryOne , definitely tomorrow We will reunite")
//        }
//        9 -> {
//            println("Hello , Bhai Log , Good night")
//            println("Sab thik hai  , Yaha pe !!")
//        }
//        else -> {
//            println("kuch v bol do last me!!")
//        }
//    }
//
//}

//fun main(args: Array<String>){
//    var i = 1
//    while (i<=5){
//        println(i)
//        i++
//    }
//}

//fun main(args: Array<String>){
//    while (true){
//        println("infinite loop")
//    }
//}


//fun main(){
//    var table = 1
//    while(table<=10){
//        println("2 * $table = ${2 * table}")
//        table = table + 1
//    }
//}

//fun main(){
//    for(i in 1..10){
//        println("2 * $i = ${2 * i}")
//    }
//}

//fun main(){
//    for(i in 1..100){
//        println(i)
//    }
//}


//fun main(){
//    for (tabeleofour in 1..10){
//        println("4 * $tabeleofour = ${4 * tabeleofour}")
//    }
//}



// do-while loop(Atlest runs once)

//fun main(){
//    var i = 1
//    do {
//        println(i)
//        i++
//    }while (i <=10)
//}
//


//fun main(){
//    var num = 9
//
//    do {
//        println(num)
//        num = num + 1
//    }while (
//        num<=8
//    )
//}


//fun main(){
//    println("Hello Bro !! Enter your numbers ")
//    var input= readln()
//    var inputAsInter=input.toIntOrNull()
//    println("The numbers are :- $inputAsInter")
//}



fun main(){
    println("Enter your numbers to check , Is it Even or Odd? ")

    val input= readln()
    val inputAsInteger= input.toIntOrNull()
    if (inputAsInteger !=null){
        val isEven= inputAsInteger % 2==0
        println("The Given input is $inputAsInteger , $isEven")
    }else{
        println(" GIven input is Invalid !! ")
    }
}