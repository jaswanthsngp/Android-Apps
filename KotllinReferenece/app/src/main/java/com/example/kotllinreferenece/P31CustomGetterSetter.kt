package com.example.kotlindemobasics
/*customised getter setter: it has parameterised class,
where we are passing wrgument at the time of class
declaration */
class P31CustomGetterSetter(name:String,rollno:Int)
{
    var name=name
    /*get()   //defining getter
    {
        return name.toString()
    } */
    var rollno=rollno  //defining setter
        set(value)
    {
        field=if(value>31)value else 0   //take int type value as toll no is inferred as int type
    }

    fun display()
    {
        println("inside display method")
        println(" name is ${name}")
        println(" name is ${rollno}")

    }
}
fun main()
{
    var obj=P31CustomGetterSetter("riya",31)
    println(" name is ${obj.name}")
    println(" name is ${obj.rollno}")
    obj.display()
    println()

}

