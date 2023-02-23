fun main(){
    names()
    city()
    number1()
println(popular())
}
fun names(){
    var arrays =arrayOf("hello","bye","bonjour","baby")
    println( arrays.contentToString())
}
fun city() {
    var cities = arrayOf("harare", "mombai", "dodoma", "jakarta")
    println(cities.map { it.capitalize()})
}
    fun number1() {
        var numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
        var sum = numbers[1] + numbers[4]
        println(sum)
       println(numbers.indexOf(158))
        numbers.sort()
       for (num in numbers)
           println(num)
    }
    fun popular(): String {
        val names = arrayOf("kigali", "mombasa", "nairobi")
        return names.contentToString()
    }












