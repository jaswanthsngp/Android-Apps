package com.example.kotlindemobasics
/*loops
* A. while loop (syntax same as that of java)
* B. do while loop (syntax same as that of java)
* C. for loop: for loop is used to traverse through any
 data structure which provides an iterator.
  -->iterator: its something which gets initialised from the
  first value in collection,range,array or string and
  increment automatically
 Syntax:
        for(item in collection) {
       // code to execute
          }
In Kotlin, for loop is used to iterate through the
*following because all of them provides iterator.
-->Range
-->Array
-->String
-->Collection
*/
fun main(args:Array<String>)
{
    //A. While loop
    println("inside while loop")
    var a:Int=0
    while(a<10)
    {
        println("hello while ${a+1}")
        a++
    }
    println()



    //B. do-while loop
    println("inside do-while loop")
    var a1:Int=0
    do
    {
        println("hello do while ${a1+1}")
        a1++
    }while(a1<10)
    println()


    //C. For loop using Range
    /*in this,"in" operator is used to check value lies within the Range or not.It includes the range i.e.6 . */
    println("inside for loop using range loop")
    for (i in 1..6)
        print("hello tange for $i ")
    println()



    //C1 Iterate through range to jump using "step" 3 steps:
    println("inside for loop with __ jumps using range")
    for (i in 1..10 step 3) //step is a keyword to increment by more than 1 value
           println("hello range for with 3 jumped values  $i ")
    println()



    // C2.Iterate through range in reverse order
    /*for(i in 5..1 ) it will act as not true condition of
     for loop and will never enter in the loop */
        //to print in reverse , we have downTo keyword
    println("inside for loop using range to traverse in reverse ")
    for (i in 5 downTo 1)
        println("hello range for in reverse order $i ")
    println()



    /*C3. Iterate through Range from top to down with using
    downTo and step 3 */
    println("inside for loop using range in reverse order with jumps")
    for(i in 10 downTo 1 step 3)
        println("hello range for in reverse order with 3 jumps $i ")
        println()

    /*D. For loop in arrays array is created by calling
    "arrayOf() method where as many arguments you will pass
     that will act as the elements of the array */
    println("inside for loop over array to access element directly ")
    var arr= arrayOf("A","B","C","D","E")
    for(A in arr)  //or for(A:String in arr)  mentioning the data type specifically
    {
        println("in the array fetch the value directly  $A")
    }
    println()

    /*D1 Traverse an array with using index property */
    println("inside for loop over array to access element based on index")
    var arr1= arrayOf(1,2,3,4,5,6)
    for(A in arr.indices)  //or for(A:String in arr)  mentioning the data type specifically
    {
        println("in the array get value on the basis of index ${arr1[A]}")
    }
    println()


    /*D.2 Traverse an array using withIndex() Library Function: */
    println("inside for loop over array to access on the basis of index-value pair using withIndex()")
    var planets = arrayOf("Earth", "Mars", "Venus", "Jupiter", "Saturn")
    for ((index,value) in planets.withIndex()) {
        println("Element at $index th index is $value")
    }
    println()

   /* E. Iterate through string using for loop .here are
   following ways to traverse the string:
    -->Without using Index property
    -->With Using Index property
    -->Using withIndex Library Function*/
    var n = "hello"
    var n1 = "hey girl"

    // E1. traversing string without using index property
    for (alphabet in n)
        println("$alphabet ")
    println()

    // E.2 traversing string with using index property
    for (i in n1.indices)
        println(n1[i]+" ")
    println(" ")

    // E.3 traversing string using withIndex() library function
    for ((index,value) in n.withIndex()) //index ,value are keywords
        println("Element at $index th index is $value")



    //F. traverse the list(collection) using for loop.
    var c = listOf(1,2,3,"listOf", "mapOf", "setOf")
    for (ele in c) {
        println(ele)
    }


    //G. for loop using until, it excludes the last value
    for(i in 1 until 5)
    println(i)








}