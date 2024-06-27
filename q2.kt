fun main() 
{
    val a = 152
    var b: Int
    var c: Int
    var d = 0

    b = a

    while (b != 0) {
        c = b % 10
        d += Math.pow(c.toDouble(), 3.0).toInt()
        b /= 10
    }

    if (d == a)
        println("$a is an Armstrong number")
    else
        println("$a is not an Armstrong number")
}
