package org.example

//  Encapsulation – hiding implementation details | скрытие деталей реализации;
//  Inheritance – creating new classes based on existing ones | создание новых классов на основе существующих
//  Polymorphism – the ability to use objects of different classes through a single interface | возможность использовать объекты разных классов через один интерфейс;
//  Abstraction – highlighting the main characteristics of an object | выделение главных характеристик объекта.

/* ClassesAndObjects in KT
*/
import abstraction.Boat
import classAndObject.Car

/* Encapsulation in KT
*/ import encapsulation.Person
   import encapsulation.Employee

/* Inheritance in KT
*/ import inheritance.Circle
   import inheritance.Vehicle
   import inheritance.Dog


/* Polymorphism in KT
*/ import polymorphism.playWithAnimal
   import polymorphism.Animal
   import polymorphism.Cat

fun main() {
    /* ------------------------------------------------------ ClassesAndObjects in KT
    */ val BMW = Car("BMW", 45)
    BMW.accelerate(120)
    BMW.brake()

    /* ------------------------------------------------------ Encapsulation in KT
    */ val person = Person("Alexey", 30)
    val employee = Employee("Yvan", 25, "DEV")

    println("Access to public: ${person.publicInfo}")
    person.showPublicInfo()

    // println(person.privateInfo)          // ERROR
    // person.showPrivateInfo()             // ERROR

    // println(person.protectedInfo)        // ERROR
    // person.showProtectedInfo()           // ERROR

    println("Access to internal: ${person.internalInfo}")
    person.showInternalInfo()

    println("\nAccess from Employee:")
    employee.showProtectedFromParent()
    employee.showInternalFromParent()

    /* ------------------------------------------------------ Inheritance in KT
    */ val myCar = inheritance.Car("Model S", "Tesla")
    myCar.drive()

    println("-----")

    // Shape & Circle
    val myCircle = Circle("Circle", 5.5)
    myCircle.draw()

    println("-----")

    // Animal & Dog
    val myDog = Dog("Labrador")
    myDog.bark()

    println("-----")

    val vehicles: List<Vehicle> = listOf(inheritance.Car("Mustang", "Ford"), inheritance.Car("Civic", "Honda"))
    for (v in vehicles) {
        v.drive()
    }

    val dog: Animal = polymorphism.Dog()
    val cat: Animal = Cat()

    playWithAnimal(dog) // Output: Woof!
    playWithAnimal(cat) // Output: Meow!

    val car = abstraction.Car("Tesla")
    val boat = Boat("Yacht")

    car.displayInfo()
    car.move()  // Output: Tesla moves on wheels

    boat.displayInfo()
    boat.move()  // Output: Yacht moves on water

}