fun main()
{
    val string = "muchasgraciasaficionestoesparavosotrossiuuuu"
    val letter = 'a'
    var count = 0

    for (i in 0..string.length - 1) {
        if (letter == string[i]) {
            ++count
        }
    }

    println("Frequency of '$letter' in '$string' is $count")
}

