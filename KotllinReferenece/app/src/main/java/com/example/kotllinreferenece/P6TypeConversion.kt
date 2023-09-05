package com.example.kotlindemobasics
/* Type Conversion:One smaller data type can be assigned to
 another larger data type implicitly but Kotlin does not
 support implicit type conversion. example: An integer value
  can not be assigned to long data type.But kotlin has
  helper function which explicitly perform type conversion.
 */
fun main(args:Array<String>) {
    var a = 100
    /* var b:Long=a   //this line will give type mismatch
    error i.e. found long but required int.*/

    //correction to line 11 error is using "toLong()" method:
    var b: Long = a.toLong()
    //we have 8 helper function parallel to each of the data type
    print("the type conversion happened using helper function")
    print(" long type $b  and int type $a")

    print("convert long type 75 to int:   " + (75L.toLong()))
    println("259 to byte: " + (259.toByte()))
    println("50000 to short: " + (50000.toShort()))
    println("21474847499 to Int: " + (21474847499.toInt()))
    println("10L to Int: " + (10L.toInt()))
    println("22.54 to Int: " + (22.54.toInt()))
    println("22 to float: " + (22.toFloat()))
    println("65 to char: " + (65.toChar()))
    println("454545454 to char: " + (454545454.toChar()))
    println("A to Int: " + ('A'.toInt()))
}