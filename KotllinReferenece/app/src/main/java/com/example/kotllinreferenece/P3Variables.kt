/* Variables must be declared before use otherwise compile time error
* In Kotlin, variables are declared using two types –
Immutable using val keyword
Mutable using var keyword

*/
fun main(args:Array<String>)
{
    val name:String="neha"    //cant modified as val is immutable and name is a direct reference to object
    val lastName="sharma"

    var name1:String="riya"   //can be modified as var is mutable
    var lastName1="singh"

    /*Let us try to modify the values
        name="priya"   it will give me CTE as name cant be modified as it is val type  */

    /*but we can assign value of another variable to it that is why it is not called constant */
            val name2 =name1  //where name is var type
            val lastName2=lastName   //where lastName is val type

    /*var string=1
    string="hey"   //CTE as in first linethe string variable is infereed as int and then you cant assign it string,no matter if it is of var type
    */

    val languages= mutableListOf("hey")
    languages.add("hello")  /* As this list is mutable in nature ,it will increase the number of values in the object
     as 2 .As val is independent of the content present in the object so no CTE. CTE will only come if you try to
     assign new object to "languages". */

    /*val city=listOf("india")
    city.add("china") it will give CTE as list is immutable in nature .
     city=mutableListOf("goa")  CTE*/


    //$ symbol is called variable interpolation
    println("names value using $ symbol i.e. $name ")
    println("names value using $ symbol with optional curly bracket i.e. ${name} ")
    println("names value using $ symbol with needed curly nracket as you are applying some operation on this valuei.e. ${name+"hey"} ")
}