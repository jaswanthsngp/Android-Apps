package com.example.kotlindemobasics

class P34PrimaryconstructorWithInitializerBlock(a:Int,b:Int)
{
    var rollno:Int=a
    var phoneno:Int=b
   init {
       println("inside init block")
        rollno=100
        phoneno=200
       println("roll no is $rollno")
       println("phone no is $phoneno")
   }
}
fun main() {
    var obj = P34PrimaryconstructorWithInitializerBlock(5, 10)
    println("after constructor call roll no is ${obj.rollno}")
    println("after constructor callphone no is ${obj.phoneno}")
}
