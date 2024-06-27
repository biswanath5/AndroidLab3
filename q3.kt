fun main() 
{
    val num1 = 45
    val num2 = 60
    var a = num1
    var b = num2

    while (b != 0) 
    {
        val temp = b
        b = a % b
        a = temp
    }

    println("GCD of $num1 and $num2 is $a")
}
