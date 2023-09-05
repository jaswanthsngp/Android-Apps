package com.example.kotlindemobasics
/*
A.Expression: It is any body in a program which produces one
output after performing some computation on set of statements.
variable/class declaration,assignment are not an expression

B. Statement: It is every statement to perform an independent action

C: Block: It is set of statements written in a body(means
 pair of open and closed curly bracket)to get solution of
one specific problem.It any variable declared inside a block
its scope will remain within that block

D: Scope of any variable:If we have nested blocks and the
 variables declared at the head of the block are visible
 throughout the block and any nested blocks, unless a
 variable with the same name declared at the head in the
 inner block. When a new declaration is effective throughout
  the inner block, the outer declaration becomes effective
   again at the end of the inner block. So, we can say that
    variables have nested scopes*/

fun main(args: Array<String>)
{
    //function as expression
    fxnAsExpression()

    //If as an expression must have else part
    println("inside if expression ")
    var result=if(5>0)
    {
        //direct value to return.it could be int,float string,char etc
        "hello inside if part of if as an expression"
    }
    else
    {
        //direct value to return.it could be int,float string,char etc
        678
    }
    print(result)

    //declaration and assignment as statement
    println("inside statements")
    var d:Int
    d=90
    println("the value is $d")

    //multiple statments separated by semi colon
    println("inside multiple statments")
    print("hey"); println("hello")

    //if as block
    println("inside if as a block")
    var c=80
    if(c==80)
    {   /*this if is getting 2 "c" variable woth values
    80 and 90 but inside the block preference is given to
    inner variable.

    the scope of this c is only inside the if block
    thus we can use any variable with name "c" outside this
    block again*/
        var c=90
        println("the value of inner C will be considered  "+c)
        println("cant ever access the outer C as it is called shadowing")
        print("i am in if block with condition c==80")
    }

}
fun fxnAsExpression()
{
    println("inside expression function")
    val a = 10
    val b = 5
    println(a+b)
}