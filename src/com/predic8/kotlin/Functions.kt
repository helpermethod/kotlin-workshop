package com.predic8.kotlin

/**
 * @author Oliver Weiler (weiler@predic8.de)
 */

// 1. Declaration

// functions are declared using the `fun` keyword
fun greet() {
    println("Hello World!")
}

// parameters are defined using `Pascal Notation` and must be explicitly typed
fun add(x: Int, y: Int): Int {
    return x + y
}

// 2. Default values and named parameters
fun slice(s: String, begin: Int = 0, end: Int = s.length): String {
    return s.substring(begin, end)
}

// 3. Single expression functions

// body is defined after an `=` sign
// return type is inferred by the compiler
fun sub(x: Int, y: Int) = x - y

// 4. Return types

// functions with block body must specify a return type unless returning `Unit`

// 5. Varargs and spread operator

fun concat(vararg strings: String) = strings.joinToString(separator = "")

// 6. Local functions
fun fac(n: Int): Int {
    if (n < 0)
        throw IllegalArgumentException()

    fun fac(n: Int): Int = when(n) {
        0 -> 1
        else -> n * fac(n - 1)
    }

    return fac(n)
}

val sum = add(1, 2)

fun main(args: Array<String>) {
    greet()
    println("sum: $sum")

    val s = "Kotlin rocks";

    println("slice: ${slice(s, 0, 6)}")
    println("slice with default begin: ${slice(s, 7)}")
    // end is a named parameter
    println("slice with default end: ${slice(s, end = 6)}")

    println("sub: ${sub(4, 3)}")

    println("concat: ${concat("Kot", "lin")}")
    val nums = arrayOf("4", "5", "6")
    println("concat with spread: ${concat("1", "2", "3", *nums)}") // spread operator (*)

    println(fac(5000))
}