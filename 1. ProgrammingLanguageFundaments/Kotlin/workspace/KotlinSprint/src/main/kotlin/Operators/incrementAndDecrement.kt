package Operators

fun incrementAndDecrement(){
    var num = 5

    num++ // equivalent to num = num + 1 (postfix increment)
    num-- // equivalent to num = num - 1 (postfix decrement)

    println(num) // 5

    println(++num) // prefix increment (increments before use) -> 6
    println(num--) // postfix decrement (uses then decrements) -> 6
    println(num)   // 5

}