https://pl.kotl.in/oGWOCKXjz

val f:String?=null
fun main(args: Array<String>) 
{
    val name:String
    name="Steve"
    val obj=Person()
    obj.display(name)
    
    val l:Int?=f?.length ?:0
	
    println("$name,$l")
    println("${name.length},${name.capitalize()}") 
    println(getName())
	println(square(4))
    println(cube(2))
    println(four(2))
    info("RG",10)
    VarArgFun(2,3,4,5,6,7,8,9)
}
// //Type 1 of functions
fun getName():String
{
    return "AR"
} 
//Type 2 of functions
fun square(number:Int):Int
{
    return number*number
}
//Type 3
fun cube(number:Int)=number*number*number
//Type 4
fun four(number:Int):Int=number*number*number*number
//Type 5
fun info(name:String,grade:Int)
{
    println("Name:$name, Grade:$grade")
}
class Person
{
    fun display(name:String)
    {
        println(name)
    }
}
fun VarArgFun(vararg number:Int)
{
    println(number.size)
    for(x in number)
    {
        print("$x ")
    }
}