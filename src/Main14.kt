fun foo(i:Int, ex:(Int)->Int):Int {
    return ex(i)
}
fun bar1(i:Int) = -i
fun main(){
// 변수에 저장하기
    val f1 = ::bar1 // 이미 정의된 함수. 타입 추론
    val f2:(Int)->Int = ::bar1 // 타입 지정
    val f3:(Int)->Int = { it + 10 } // 람다식
    foo(1, fun(i:Int):Int{return i-1}) // 익명함수
    foo(1) { it + 10 } // 람다식
    foo(1, ::bar1) // 이미 정의된 함수
}
