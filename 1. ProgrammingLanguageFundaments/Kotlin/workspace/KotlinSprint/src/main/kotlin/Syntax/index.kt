package Syntax

fun sum(a: Int, b:Int): Int{ return a + b} // Simple Function
fun sumInOneLine(a: Int, b:Int) = a + b // In One Line
fun say() = println("Hello, Frenki!") // Without parameters

class Person(val name: String, var age: Int) { //<----------------------    Class
    fun greet() {
        println("Hi, my name is $name and I'm $age years old")
    }
}

//<--------------------------------------------------------------------     Animal -> Dog (open fun and override dun)
open class Animal(val name: String) {
    open fun makeSound() {
        println("Some sound")
    }
}

class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        println("Woof! Woof!")
    }
}
//<--------------------------------------------------------------------END

//<--------------------------------------------------------------------     Interface
interface Clickable {
    fun click()
}

class Button : Clickable {
    override fun click() {
        println("Button clicked")
    }
}
//<--------------------------------------------------------------------     Interface-END

data class User(val name: String, val age: Int) // Data Classes for storage the Data
//  Auto-Create the toString(), equals(), copy(), hashCode().

fun index(){
    //<--------------------------------------------------------------------     Var
    val name: String = "Alex" // non-change variable like ''final in Java
    var age: Int = 22 // changeble variable

    val city = "Chisinau" // Can use val when we init the var with data
    var count = 10
    //<--------------------------------------------------------------------     Var-END

    val person = Person("Alex", 23) // Using Person Class
    person.greet()

    val dog = Dog("Buddy") // Using Dog Class
    dog.makeSound() // Woof! Woof!

    val user = User("Alex", 23) // Using Data Class
    val newUser = user.copy(age = 24)

    //<-----------------------------------------------------------------    LIST
    val numbers = listOf(1, 2, 3) // неизменяемый список
    val mutableNumbers = mutableListOf(1, 2, 3) // изменяемый список
    mutableNumbers.add(4)
    //<-----------------------------------------------------------------    LIST
    val userMap = mapOf("name" to "Alex", "age" to 23)
    val mutableMap = mutableMapOf("name" to "Alex")
    mutableMap["age"] = 23
    //<-----------------------------------------------------------------    END

    //<-----------------------------------------------------------------    Cycle
    for (i in 1..5) {
        println(i)
    }
    var x = 5 // while
    while (x > 0) {
        println(x--)
    }
    //<-----------------------------------------------------------------    CycleEND

    //<-----------------------------------------------------------------    IF-ELSE
    val ageaa = 18
    val status = if (ageaa >= 18) "Adult" else "Minor"
    //<-----------------------------------------------------------------    IF-ELSE-END

    //<-----------------------------------------------------------------    WHEN
    val number = 3
    when (number) {
        1 -> println("One")
        2 -> println("Two")
        else -> println("Other number")
    }
    //<-----------------------------------------------------------------    WHEN-END

    //<-----------------------------------------------------------------    NULL-safety
    var name1: String? = null // переменная может быть null
    name1?.length // безопасный вызов
    val length2 = name1?.length ?: 0 // если name == null, то вернет 0
    //<-----------------------------------------------------------------    NULL-safetyEND

    //<-----------------------------------------------------------------    Coroutines
    import kotlinx.coroutines.*

    fun main() {
        GlobalScope.launch {
            delay(1000L)
            println("Hello from coroutine!")
        }
        println("Hello from main thread!")
        Thread.sleep(2000L) // Ждем, чтобы корутина успела выполниться
    }
    //<-----------------------------------------------------------------    Coroutines END

    //<-----------------------------------------------------------------    WithAndroid
    //Создание Activity
    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
        }
    }
    //Нахождение View и обработка кликов

    val button: Button = findViewById(R.id.myButton)
    button.setOnClickListener {
        Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show()
    }
    //Запуск новой Activity

    val intent = Intent(this, SecondActivity::class.java)
    startActivity(intent)
    //<-----------------------------------------------------------------    WithAndroid END

    //<-----------------------------------------------------------------    Jetpack Compose (современный UI-фреймворк)
    @Composable
    fun Greeting(name: String) {
        Text(text = "Hello, $name!")
    }

    @Preview
    @Composable
    fun PreviewGreeting() {
        Greeting("Alex")
    }
    //<-----------------------------------------------------------------    Jetpack Compose (современный UI-фреймворк) END
}