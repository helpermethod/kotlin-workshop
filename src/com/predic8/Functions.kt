package com.predic8

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

// 5. Varargs

fun concat(vararg parts: String) = parts.joinToString(separator = "")

val sum = add(1, 2)

fun main(args: Array<String>) {
    greet()
    println(sum)

    val s = "Kotlin rocks";

    println(slice(s, 0, 6))
    println(slice(s, 7))
    // end is a named parameter
    println(slice(s, end = 6))

    println(concat("Kot", "lin"))
}