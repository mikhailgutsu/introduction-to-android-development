package SealedClasses

//  A sealed class is declared using the sealed keyword.
sealed class Vehicle {
    class Car(val brand: String) : Vehicle()
    class Bike(val type: String) : Vehicle()
}
//  Vehicle is a sealed class.
//  Car and Bike are subclasses of Vehicle.

//  Key Feature: Unlike normal classes, sealed classes restrict subclassing. All subclasses must be defined in the same file.