infix fun Int.diff(other: Int) :Int{
    return if(this>other) this-other else other-this
}
fun main(){
    val r1=1 diff 2 //1.diff(2)

    val r2=3 diff 3
    val r3=-1 diff 10
}