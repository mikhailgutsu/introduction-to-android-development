package oCollections

//  Collections in Kotlin also include maps (key-value pairs). You can apply similar functions to them.
fun main()
{
    val students = mapOf("Alice" to 90, "Bob" to 80, "Charlie" to 70)

    // Get only students with scores above 75
    val topStudents = students.filter { it.value > 75 }
    println(topStudents) // Output: {Alice=90, Bob=80}

    // Increase each student's score by 5
    val updatedScores = students.mapValues { it.value + 5 }
    println(updatedScores) // Output: {Alice=95, Bob=85, Charlie=75}
}