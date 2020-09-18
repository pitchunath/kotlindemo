class Armstrongnumber {

   fun armstrong(num:Int){

       var sum = 0
       var n = 0
       var numreplica =num
       var numlist = mutableListOf<Int>()
       while(numreplica!=0){
           var remainder=numreplica%10
           numlist.add(remainder)
           numreplica /= 10
       }
       numlist.forEach(){
           sum += (Math.pow(it.toDouble(), (numlist.size).toDouble())).toInt()
       }
       if(sum==num)
           println("yes it is ")
       else
           println("no it is not")
   }
}
fun main(){
    var lambda :(String,String)-> String ={s1,s2 -> (StringBuilder().append(s1).append(s2)).toString()}
    println(lambda("hello","pitchu"))
    println(Armstrongnumber().armstrong(153))
}
