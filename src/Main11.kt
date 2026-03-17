fun outer(value: Int): () -> String {
    fun even(): String = "even"
    fun odd(): String = "odd"

    return if (value%2==0)::even else ::odd
}

fun outer2(value: Int): () -> String {
    fun even(): String = "even"
    fun odd(): String = "odd"

    return if (value % 2 == 0) ::even else ::odd
}

fun main() {
    val func = outer(5)
    println(func())   // ✔ 함수 호출하려면 func() 해야 함
}