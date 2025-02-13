package Functions

// Kotlin allows overloading operators via extension functions:
class Point(val x: Int, val y: Int)

operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}


fun main()
{
    val p1 = Point(2, 3)
    val p2 = Point(4, 5)

    val resultPoint = p1 + p2
    println("(${resultPoint.x}, ${resultPoint.y})") // Output: (6, 8)
}