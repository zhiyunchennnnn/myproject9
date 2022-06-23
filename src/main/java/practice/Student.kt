package practice

open class Student (var name: String , var english: Int,var math:Int){
    init {
        //println("Testing")
    }
    fun print(){
        //println(name + "\t" +english + "\t" + math)
        println("$name\t$english\t$math\t${getAverage()}")
    }
    fun getAverage() = (english+math)/2
}

fun main(){
    val stu = Student("Jack",66,56)
    stu.print()
}
