class Stringconcat {

    fun countNumberString(str: String) {

        val splittedString = str.trim().splitToSequence(' ')
            .filter{it.isNotEmpty()}.toList()
        println(splittedString)
        println(splittedString.groupBy { it }
            .mapValues { it.value.count() })
}

}
fun main (args:Array<String>){
    val str = "Hi this is pitchu hi for all from pitchu"
    Stringconcat().countNumberString(str)
}