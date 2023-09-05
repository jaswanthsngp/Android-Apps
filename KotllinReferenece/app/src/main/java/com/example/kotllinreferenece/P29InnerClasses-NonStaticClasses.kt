package com.example.kotlindemobasics
/* Inner classes: these are the non static nested classes.
* Written by writing keyword "inner" in front of it*/
class P29InnerClassesNonStaticClasses
{
    var name="swift"
    fun outerDisplay()
    {
println("display method of outer class $name")
    }
    inner class Look
    {
        var noOfSeats=5
        fun InnerDisplay()
        {
            println("display method of inner class $noOfSeats")
        }
    }
}

fun main()
{
    var outerObj=P29InnerClassesNonStaticClasses()
    outerObj.name="jaguar"
    outerObj.outerDisplay()

    /*non static inner class cant be accessed directly. to
    access it,we can only do it with the object of outer class */
    var outerObj1=P29InnerClassesNonStaticClasses()
    var innerObj=outerObj1.Look()
    innerObj.noOfSeats=90
    innerObj.InnerDisplay()

    //OR another way is doing it directly
    P29InnerClassesNonStaticClasses().Look().InnerDisplay()

}