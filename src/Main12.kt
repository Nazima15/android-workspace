import com.sun.tools.javac.tree.TreeInfo.args

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}
fun main(){
    printAll()
    printAll("hello")
    printAll("hello","world")
    printAll("1", "2", "3", "4", "5", "6", "7", "8", "9")
}