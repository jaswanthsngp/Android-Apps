package com.example.kotlindemobasics
/*Nested class:this is the static data member of the class
static means it can be directly called with the name of outer
 class. but to access data members of inner class ,we have to make its object
name  */
class P28NestedClasses {
    var name = "swift"
    fun outerDisplay() {
        println("outer class diplay methos,value of name is $name")
    }

    class Engine {
        var cc: Int = 0
        fun innerDisplay() {
            /*static nested class can only access the static data
             members of the outer class.name of outer cant be
             accessed from static inner class as static is
             independent of object but data members are dependent
             on object */
            println("inner class diplay method,value of and cc is $cc")
        }
    }
}

fun main()
{
    //A. accessing outer class other data memebers
    var outerObj=P28NestedClasses()
    outerObj.name="suzuki"
    outerObj.outerDisplay();

    //B. creating object of nested class present inside
    // outer class.as static data member of a class can
    // be directly called with class name

    var innerObj=P28NestedClasses.Engine()
    innerObj.cc=500
    innerObj.innerDisplay()

    //directly be called without creating reference.
    P28NestedClasses.Engine().innerDisplay()
}