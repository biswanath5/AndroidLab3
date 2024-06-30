//Functions
//Q1
fun main()
{
    println("Larger number is ")
    println(Larger(67,72))
}

fun Larger(a:Int,b:Int):Int
{
    if(a>b){
        return a
    }
    else{
        return b
    }
}

//Q2
fun main() 
{
    val list = listOf(23, 34, 45, 56)
    println("The sum of the list is: ${sumOfList(list)}")
}
fun sumOfList(numbers: List<Int>): Int 
{
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    return sum
}



//Q3
fun main() {
    isPalindrome("rohit")
    isPalindrome("markram")
}

fun isPalindrome(str: String){
    if (str.length <= 1) 
    {
        println("Yes, $str is a palindrome")
    }
    if (str.first() != str.last()) 
    {
        println("No, $str is not a palindrome")
    }
    else
    {
        println("Yes, $str is a palindrome")
    }
}

//Q4
fun main()
{
    println("Factorial is ")
    println(fact(8))
}

fun fact(a:Int):Int
{
    if (a==0)
    {
        return 1
    }
    return a*(fact(a-1))
}

//CLASSES
//Q1
fun main()
{
    val account = BankAccount("ABCDB6", 25000.0)
    account.withdraw(2000.0)
    account.deposit(6000.0)
    println("Account number: ${account.accountNumber}, Balance: ${account.ckbalance()}")
}

class BankAccount(val accountNumber: String, var balance: Double)
{
    fun deposit(amt:Double)
    {
        balance = balance + amt
    }
    
    fun withdraw(amt:Double)
    {
        if (balance >= amt) 
        {
            balance = balance - amt
        } 
        else 
        {
            println("Insufficient balance")
        }
    }
    
    fun ckbalance():Double
    {
        return balance
    }
}

//Q2
interface Drawable 
{
    fun drawInfo()
}

class Square(val side: Double) : Drawable 
{
    override fun drawInfo() 
    {
        println("Square with side length $side")
    }
}

class Triangle(val base: Double, val height: Double) : Drawable 
{
    override fun drawInfo() 
    {
        println("Triangle with base $base and height $height")
    }
}

fun main() 
{
    val square = Square(6.0)
    square.drawInfo()

    val triangle = Triangle(4.0, 7.0)
    triangle.drawInfo()
}

//Q3
abstract class Shape 
{
    abstract fun area(): Double
    abstract fun perimeter(): Double
}

class Rectangle(val width: Double, val height: Double) : Shape() 
{
    override fun area(): Double 
    {
        return width * height
    }
    override fun perimeter(): Double 
    {
        return 2 * (width + height)
    }
}

class Circle(val radius: Double) : Shape() 
{
    override fun area(): Double 
    {
        val pi = 3.141592653589793
        return pi * radius * radius
    }

    override fun perimeter(): Double 
    {
        val pi = 3.141592653589793
        return 2 * pi * radius
    }
}

fun main() 
{
    val rectangle: Shape = Rectangle(6.0, 4.0)
    val circle: Shape = Circle(7.0)
    
    println("Rectangle:")
    println("Area: ${rectangle.area()}")
    println("Perimeter: ${rectangle.perimeter()}")
    println()
    println("Circle:")
    println("Area: ${circle.area()}")
    println("Perimeter: ${circle.perimeter()}")
    println()
}

