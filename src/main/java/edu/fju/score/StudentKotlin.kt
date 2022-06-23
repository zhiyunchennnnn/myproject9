package edu.fju.score

open class StudentKotlin(var name :String, var math :Int, var english:Int) {
    fun getAverage(){
        println(name+" "+math+" "+english+" "+(math+english)/2)
    }
}
class GraduateStudent(name: String,math: Int,english: Int,var thesis:Int):StudentKotlin(name,math,english){

    fun print(){
        println(name+" "+math+" "+english+" "+" "+thesis+" "+(math+english)/2)
    }
}

fun main() {
    val s = StudentKotlin("Joan",75,60)
    val t = StudentKotlin("Jane",66,59)
    val w = GraduateStudent("Cindy",78,66,67)
    s.getAverage()
    t.getAverage()
    w.getAverage()
    w.print()
}