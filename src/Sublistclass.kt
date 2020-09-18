class Sublistclass {

    fun recursivecall(listA: List<Int>, listB: List<Int>, start: Int, end: Int) {

        var samp = listA.subList(start, end)
        if (samp == listB) {
            println(samp)
            println("$listB is subset of $listA")
        } else if (end == listA.size) {
            println("Nothing matching")
        } else
            recursivecall(listA, listB, start + 1, end + 1)
    }

    fun reversestring(Str: String):String {
        var rev:String =""
    for(i in Str.length-1 downTo 0 )
       {
           rev= rev+Str[i]
        }
        return rev
      }

    fun calculate(a:Int,b:Int,func:(Int,Int)-> Unit){
        func(a,b)
        }

}




fun main() {
    val A = listOf(0, 10, 2, 1, 2, 3, 4, 5)
    val B = listOf(4, 5)
    println(Sublistclass().reversestring("hello pitchu"))
    if(A.size>B.size)
       Sublistclass().recursivecall(A, B, 0, B.size)
    if(B.size>A.size)
        Sublistclass().recursivecall(B, A, 0, B.size)
    else{
        if(A==B){println("")}
    }
    val lambdaadd ={x:Int,y:Int-> println(x+y)}
    val lambdadiff ={x:Int,y:Int-> println(x-y)}
    val lambdamul ={x:Int,y:Int-> println(x*y)}
    val lambdadiv ={x:Int,y:Int-> println(x/y)}
    Sublistclass().calculate(5,6,lambdaadd)
}


