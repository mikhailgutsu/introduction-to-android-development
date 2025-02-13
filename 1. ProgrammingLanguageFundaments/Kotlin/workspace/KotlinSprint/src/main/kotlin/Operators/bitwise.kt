package Operators

fun bitwise(){
    val p = 5  // 0101 in binary
    val q = 3  // 0011 in binary

    println(p and q)  // Bitwise AND -> 1 (0001)
    println(p or q)   // Bitwise OR -> 7 (0111)
    println(p xor q)  // Bitwise XOR -> 6 (0110)
    println(p.inv())  // Bitwise NOT -> -6 (two's complement)
    println(p shl 1)  // Left shift -> 10 (1010)
    println(p shr 1)  // Right shift -> 2 (0010)
}