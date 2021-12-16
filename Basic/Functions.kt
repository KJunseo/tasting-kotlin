// 기본형
fun sum(a: Int, b: Int): Int { // 함수이름(매개변수 이름: 매개변수 타입): 함수 반환 타입
    return a + b
}

// 표현식
// 반환 타입이 추론되어서 생략가능
fun sum(a: Int, b: Int) = a + b

// 값 반환 x
// Unit은 반환 구문이 없다는 걸 나타낸다. 자바의 void라고 볼 수 있지만 차이점이 존재한다고 한다.
// Unit은 생략가능하다.
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun printSum(a: Int, b: Int): {
    println("sum of $a and $b is ${a + b}")
}
