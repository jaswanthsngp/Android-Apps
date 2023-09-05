import java.util.Scanner;
//It will be telling about how to take input and print something
fun main(args:Array<String>)
{

    /*to print on console without going to next line use print() and to feed new line left corner we use println() */
    print("Hello, Geeks! ")
    println("This is Kotlin tutorial.")


    /*input is the basic operation performed to flow byte streams from input device.
    * There are two ways to take input :
    * 1. using readLine() (compatible with String data type but you can convert String to any other data type(if compatible) using predefined methods) method
    * 2. using Scanner class (when user give I/P other than String, you need to use Scanner class.*/

    //A. readLine()
    //1. by defaylt consider it String type
    print("Enter text using readLine() method: ")
    var a = readLine()   //by default always consider String type input
    println("You entered: $a")

    /*2. converting given String given by user to int data type if compatible. Putting "!!" at the end of
    readLine() method becomes mandatory which ensures that the input cant be NULL.because if its is sure
     that it cant be a null string ,only then it can be converted to other data types *
     */
    println("enter the integer type value")
    var a1=readLine()!!
    println("convert string to int:  "+ (a1.toInt()))
    println("convert string to int:  "+ (a1.toFloat()))
    println("convert string to int:  "+ (a1.toLong()))
    println("convert string to int:  "+ (a1.toDouble()))
    println("convert string to int:  "+ (a1.toShort()))
    println("convert string to int:  "+ (a1.toByte()))
    println("convert string to int:  "+ (a1.toBoolean()))  //default value

    /* B. using Scanner class
    1. first declare a variable ("b" in this case)which will be ready to take input as it is open for
    System.input , it should be of val type if you will be taking different data types otherwise var type
    will work*
    2. The data type of variable must be declared in this
    to give surity that you already know you want to get
    specific type of data./
     */

    //CASE1: var type b
    var b=Scanner(System.`in`)    //b is pointing to object of Scanner class which is ready to take input
    println("enter the text using Scanner class ")

    println("enter the int data:    ")
    var c:Int=b.nextInt();       //c holding integer type data given by user,where b is holding Scanner object and it is of var type.
    println("user has entered int value:   "+c)

    println("enter the float data:    ")
    var d:Float=b.nextFloat()     //d is holding float type data given by user,where b is holding Scanner object and it is of var type.
    println("user has entered float value:   "+d)

    //CASE 2: val type b1
    val b1=Scanner(System.`in`)
    println("enter the text using Scanner class:   ")

    println("enter the int data:    ")
    var c1:Int=b1.nextInt();       //c holding integer type data given by user,where b is holding Scanner object and it is of var type.
    println("user has entered int value:   "+c1)

    println("enter the float data:    ")
    var d1:Float=b1.nextFloat()     //d is holding float type data given by user,where b is holding Scanner object and it is of var type.
    println("user has entered float value:   "+d1)

    println("enter the byte data:    ")
    var e1:Byte=b.nextByte()     //d is holding float type data given by user,where b is holding Scanner object and it is of var type.
    println("user has entered  byte value:   "+e1)

    println("enter the short data:    ")
    var f1:Short=b.nextShort()     //d is holding float type data given by user,where b is holding Scanner object and it is of var type.
    println("user has entered short value:   "+f1)

    println("enter the long data:    ")
    var g1:Long=b.nextLong()     //d is holding float type data given by user,where b is holding Scanner object and it is of var type.
    println("user has entered long value:   "+g1)

    println("enter the double data:    ")
    var h1:Double=b.nextDouble()     //d is holding float type data given by user,where b is holding Scanner object and it is of var type.
    println("user has entered double value:   "+h1)
}