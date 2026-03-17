fun foo(name: String, ex: () -> Unit) {
    println(name)
    ex()
}

fun bar(param: Int, ex: () -> Unit) {
    println(param)
    ex()
}

fun main() {
    foo("abc") { println("Hello") }
    bar(1) { println("World") }
    bar(100) { println("Kotlin") } //
}