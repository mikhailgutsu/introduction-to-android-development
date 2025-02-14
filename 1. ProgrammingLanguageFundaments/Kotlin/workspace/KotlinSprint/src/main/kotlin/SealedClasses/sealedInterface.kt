package SealedClasses

//  Key Benefit: Unlike sealed class, sealed interface allows implementation across multiple files.
sealed interface Event

class ClickEvent(val x: Int, val y: Int) : Event
object IdleEvent : Event

fun handleEvent(event: Event) {
    when (event) {
        is ClickEvent -> println("Clicked at (${event.x}, ${event.y})")
        IdleEvent -> println("Idle event")
    }
}

fun main() {
    val event = ClickEvent(100, 200)
    handleEvent(event)  // Output: Clicked at (100, 200)
}
