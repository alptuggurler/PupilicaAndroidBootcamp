package com.example.bootcamp.paket.odevler

fun main() {

    val  fahrenheit = celsiusToFahrenheit(32.5)
    println("32.5 Celsius = $fahrenheit Fahrenheit")

    val perimeter = rectanglePerimeter(5.0, 3.0)
    println("Rectangle Perimeter: $perimeter")

    val factorialResult = factorial(5)
    println("5! = $factorialResult")

    finderA("Merhaba")

    val sum = sumOfInteriorAngles(5)
    println("İç açıların toplamı: $sum")

    val salary = salaryCalculator(25)
    println("Maaş: $salary")

    val internetOverage = internetOverageCalculator(200,250)
    println("İnternet Ücreti: $internetOverage")

}