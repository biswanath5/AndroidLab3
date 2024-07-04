//COLLECTIONS
//Q1
fun main() 
{
    val list = listOf(23, 34, 45, 56)
    val reversed = reverse(list)
    println(reversed)  
}

fun reverse(list: List<Int>): List<Int> 
{
    val reverse = mutableListOf<Int>()
    for (i in list.indices.reversed()) {
        reverse.add(list[i])
    }
    return reverse
}

//Q2
fun main() 
{
    val list = listOf(23,34,45,56)
    val filtered = removeLessThan(list, 44)
    println(filtered)  
}

fun removeLessThan(list: List<Int>, n: Int): List<Int> 
{
    return list.filter { it >= n }
}

//Q3
fun main() 
{
    val list = listOf("abhishek", "nitish", "cummins","klaasen")
    val lengths = mapStringLengths(list)
    println(lengths)  
}

fun mapStringLengths(list: List<String>): Map<String, Int> 
{
    val result = mutableMapOf<String, Int>()
    for (str in list) 
    {
        result[str] = str.length
    }
    return result
}

//Q4
fun main() 
{
    val list1 = listOf(23,34)
    val list2 = listOf(23,34,45,56)
    val result = isSubset(list1, list2)
    println(result)  
}

fun isSubset(subset: List<Int>, superset: List<Int>): Boolean 
{
    for (element in subset) 
    {
        if (element !in superset) 
        {
            return false
        }
    }
    return true
}

//Q5
fun main() 
{
    val persons = listOf(
        Person("Cummins",31),
        Person("Klaasen",32),
        Person("Abhishek",23),
        Person("Nitish",21)
    )
    val sorted = sortPersons(persons)
    for (person in sorted) 
    {
        println("Name: ${person.name}, Age: ${person.age}")
    }
}

class Person(val name: String, val age: Int)
fun sortPersons(persons: List<Person>): List<Person> 
{
    val persons2 = persons.toMutableList()
    for (i in 0 until persons2.size - 1) 
    {
        for (j in 0 until persons2.size - i - 1) 
        {
            val p1 = persons2[j]
            val p2 = persons2[j + 1]
            if (p1.age > p2.age || (p1.age == p2.age && p1.name > p2.name)) 
            {
                persons2[j] = p2
                persons2[j + 1] = p1
            }
        }
    }

    return persons2
}

//NULL SAFETY
//Q1
fun main() 
{
    val str: String? = null
    val str1:String = "Hyd"
    val length = getLength(str)
    val length1 = getLength(str1)
    println(length)  
    println(length1)
}

fun getLength(str: String?): Int = str?.length ?: -1

//Q2
fun main() 
{
    val list = listOf(23,34, null, 45, null, null)
    val filtered = list.filterNotNull()
    println(filtered) 
}

//Q3
fun main() 
{
    val str: String? = "David Warner"
    UpperCase(str)  
}

fun UpperCase(str: String?) 
{
    str?.let {
        println(it.uppercase())
    } ?: println("String is null")
}

//Q4
fun main() 
{
    val user = User("Bhuvi", "bhuviii15@srh.in")
    UserDetails(user)  
}

data class User(val name: String?, val email: String?)
fun UserDetails(user: User) 
{
    if (user.name == null || user.email == null) 
    {
        println("Incomplete User")
    } else 
    {
        println("Name: ${user.name}, Email: ${user.email}")
    }
}

//Q5
fun main() 
{
    val list: List<Any> = listOf(31, "Warner", 15, "Bhuvi", 4, "Abhi", 7, 9, "Henriques")
    val strings = filter(list)
    println(strings)  
}

fun filter(list: List<Any>): List<String> 
{
    val result = mutableListOf<String>()
    for (element in list) 
    {
        (element as? String)?.let { result.add(it) }
    }
    return result
}





