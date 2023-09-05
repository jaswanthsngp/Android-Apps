/*Kotlin contains different kinds of operators.

Arithmetic operator
Relation operator
Assignment operator
Unary operator
Logical operator
Bitwise operator */
fun main(args: Array<String>)
{
    println("***** ARITHMETIC OPERATORS*******")
    println("     ")
   /* var a:Int = 20  //specify the data type
    var b: Int= 4 */

    var a= 20  //do not specify the data type
    var b= 4
    println("$a + $b directly using variable interpolation =  ${a + b}") //variable interpolation replace the variable with value with in the given string
    println("a + b directly using '+' operator of String class=" +(a + b))
    println("$a + $b directly using '+' operator of String class=" +(a + b))

    println("a + b using kotlin method = " + (a.plus(b)))
    println("a - b = " + (a - b))
    println("a - b using kotlin method = " + (a.minus(b)))
    println("a * b = " + (a.times(b)))
    println("a * b using kotlin method = " + (a.times(b)))
    println("a / b = " + (a / b))
    println("a / b using kotlin method = " + (a.div(b)))
    println("a % b = " + (a.rem(b)))
    println("a % b using kotlin method = " + (a.rem(b)))

    println("     ")
    println("***** RELATIONAL OPERATORS*******")
    println("     ")
    var c = 30
    var d = 40
    println("c > d = "+(c>d))
    println("c > d using kotlin method  " + (c.compareTo(d) >0))
    println("c < d = "+(c<d))
    println("c < d using kotlin method "+(c.compareTo(d) < 0))
     println("c >= d = "+(c>=d))
    println("c>=d using kotlin method  " + (c.compareTo(d)>=0))
    println("c <= d = "+(c<=d))
    println("c <= d using kotlin method "+(c.compareTo(d) <= 0))
    println("c == d = "+(c==d))
    println("c==d using kotlin method = " + (c.equals(b)))
    println("c == d using null safety operator "+((c?.equals(d) ?: (d === null))))  // question mark here means it could be NULL possible

    println("c != d = "+(!(c?.equals(d) ?: (d === null))))

    println("     ")
    println("***** CompoundAssignments*******")
    println("     ")
    var e = 10
    var f = 5
    e+=f
    println("e=+f using compound assignment " +e)
    //println("e=+f using kotlin method for compound assignment " +(e.plusAssign(f)>0))

    e-=f
    println("e=-f using compound assignment " +e)
   // println("e=+f using kotlin method for compound assignment " +e.minusAssign(f)>0))

    e*=f
    println("e*=f using compound assignment " +e)
    //println("e=+f using kotlin method for compound assignment " +e.timesAssign(f)>0))

    e/=f
    println("e/=f using compound assignment " +e)
    //println("e=+f using kotlin method for compound assignment " +e.divAssign(f)>0))

    e%=f
    println("e%=f using compound assignment " +e)
   // println("e=+f using kotlin method for compound assignment " +e.remAssign(f)>0)

    println("     ")
    println("***** Unary Operatots*******")
    println("     ")
    var g=9;
    println("unary pre (first ++ then print) increment is:  ${(++g)}")
    println("unary post (first print then ++)increment is:  ${(g++)}")
    println("unary pre(first -- then print) decrement is:  ${(--g)}")
    println("unary post(first print then --) decrement is:  ${(g--)}")
    println("unary pre increment is: " + (++g))
    println("unary post increment is: " + (g++))
    println("unary kotlin increment method is: " + (g.inc()))
    println("unary pre decrement is: " + (--g))
    println("unary post decrement is: " + (g--))
    println("unary decrement kotlin method is: " + (g.dec()))


    println("     ")
    println("***** Logical Operatots ( && !  ||*******")
    println("     ")
    var h=8;
    var i=67
    var j=34
    var k=false
    if(h<i && h<j)
    {
        println("using logical and $h is the smallest value")
    }
    if(i>h || i<j)
    {
        println("using logical or $i is the smallest value")
    }
    if(k.not())
    {
        println("it is logical not operator")
    }


    println("     ")
    println("***** shift Operators ( <<  >> <<< >>> ************* ")
    println("     ")
    println("5 signed shift left by 1 bit: " + 5.shl(1))
    println("10 signed shift right by 2 bits: : " + 10.shr(2))
    println("12 unsigned shift right by 2 bits:  " + 12.ushr(2))
    println("36 bitwise and 22: " + 36.and(22))
    println("36 bitwise or 22: " + 36.or(22))
    println("36 bitwise xor 22: " + 36.xor(22))
    println("14 bitwise inverse is: " + 14.inv())
}