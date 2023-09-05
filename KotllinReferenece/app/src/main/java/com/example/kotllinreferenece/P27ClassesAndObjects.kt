package com.example.kotlindemobasics
import java.util.*
/*classes in Kotlin: The class declaration consist of class name,
class header and class body enclosed with curly braces.
-->Main should be written outside the class to execute the code.

Syntax:
    class className (class header)
    {
    property
    member function
    }
1. Class header: header consist of parameters and constructors of a
 class
2.the header and the class body is optional; if there is nothing in
 between curly braces then class body can be omitted.
        Syntax:
            class class_Name
3.If we want to provide a constructor, we need to write keyword
"constructor" just after the class name.

        Syntax:
            class className constructor(parameters)
             {
                 property
                 member function
            }
*/
class P27ClassesAndObjects {
    var name:String="abc"    //properties must be initialised otherwise CTE
    var rollno:Int=0
//Making one program asking the values to user and assign
    fun assignAndDisplay(name:String,rollno:Int)
    {
        this.name=name
        this.rollno=rollno
        println("the name you enetered is $name and roll no is $rollno")
    }

/*In Kotlin, we can create multiple objects of a class. An object
consists of :
1. State : It is represented by attributes of an object. It also
reflects the properties of an object.
2.Behavior : It is represented by methods of an object. It also
reflects the response of an object with other objects.
3.Identity : It gives a unique name to an object and enables one
object to interact with other objects. */

}

//Main should be outside the class body
fun main(args:Array<String>)
{

    //for first object named "obj"
    var obj = P27ClassesAndObjects()
    println("let us first print the default values")
    println("default valus of obj name is ${obj.name}")
    println("default valus of obj roll no is ${obj.rollno}")
    println()
    println("let us ask the values of name and roll no to user and pass as an arg to method")
    var sc=Scanner(System.`in`)
    println("Enter your name:   ")
    var name=sc.next()
    println("Enter your rollno:   ")
    var rollno=sc.nextInt()
    obj.assignAndDisplay(name,rollno)
    println()

    //for creating multiple objects , name of secind object is "obj1"
    println("let us create another object")
    var obj1 = P27ClassesAndObjects()
    obj1.name="riya"   //name given here
    println("default valus of obj1 name is ${obj1.name} and roll no is ${obj1.rollno}")
}