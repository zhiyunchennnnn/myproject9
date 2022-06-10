package edu.fju

class StudentKotlin(val name:String,var math :Int, var english:Int) {
    fun getAverage(){
        println(name+" "+math+" "+english+" "+(math+english)/2)
    }
}

fun main() {
    val s = StudentKotlin("Candy",75,60)
    val t = StudentKotlin("Jane",66,59)
    s.getAverage()
    t.getAverage()
}