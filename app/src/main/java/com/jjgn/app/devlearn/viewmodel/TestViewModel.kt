package com.jjgn.app.devlearn.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class TestViewModel @Inject constructor() : ViewModel() {
    // implementación pendiente

    private val _mCounter = MutableStateFlow(0)

    private val _cTest = MutableStateFlow(0)
    val cTest: StateFlow<Int>
        get() = _cTest

    fun setCurrentTest(testN: Int) {
        _cTest.value = testN
    }

    // Ejercicios de Kotlin

    val ktTask1 = "println(\"Hola mundo\")"

    val ktTask2 = """
        val nombre: String = "Juan"
        println(nombre)
    """.trimIndent()

    val ktTask3 = """
        val a = 2
        val b = 2
        println(a+b)
    """.trimIndent()

    val ktTask4 = """
        val añosExperiencia = 2
        if (añosExperiencia >= 2) {
            println("Contratado")
        } else {
            println("No contratado")
        }
    """.trimIndent()

    val ktTask5 = """
        val dia = 2
        when (dia) {
            1 -> println("Lunes")
            2 -> println("Martes")
            3 -> println("Miercoles")
            4 -> println("Jueves")
            5 -> println("Viernes")
            6 -> println("Sabado")
            7 -> println("Domingo")
        }
    """.trimIndent()

    val ktTask6 = """
        fun sumar(a: Int, b: Int) {
            println(a+b)
        }
    """.trimIndent()

    val ktTask7 = """
        fun multiplicar(a: Int, b: Int) {
            println(a*b)
        }
    """.trimIndent()

    val ktTask8 = """
        val num = arrayOf(1, 2, 3, 4, 5)
        println(num[2])
    """.trimIndent()

    val ktTask9 = """
        interface Reproducible {
            fun reproducir()
            fun detener()
            fun pausar()
        }
        class Musica : Reproducible {
            override fun reproducir() {
                println("Reproduciendo música...")
            }
            override fun detener() {
                println("Deteniendo reproducción de música.")
            }
            override fun pausar() {
                println("Pausando música")
            }
        }
    """.trimIndent()

    // Ejercicios de Python

    val pyTask1 = """
        print("Hola mundo")
    """.trimIndent()

    val pyTask2 = """
        numCadena = "22"
        numero = int(numCadena)
    """.trimIndent()

    val pyTask3 = """
        if edad > 18:
            print("Contratado")
        else:
            print("No contratado")
    """.trimIndent()
    val pyTask4 = """
        colores = ["rojo", "verde", "azul"]
    """.trimIndent()

    // Ejercicios de Javascript

    val jsTask1 = """
        const id = 123
    """.trimIndent()
    val jsTask2 = """
        let indefValue;
    """.trimIndent()

    val jsTask3 = """
        if (edad > 18) {
            Console.log("Contratado")
        } else {
            Console.log("No contratado")
        }
    """.trimIndent()

    val jsTask4 = """
        Function saludar() {
            Console.log("Hola mundo")
        }
    """.trimIndent()

    val jsTask5 = """
        let colores = ["rojo", "verde", "azul"]
    """.trimIndent()

    // Ejercicios de Java

    val jvTask1 = """
        System.out.print("Hola mundo")
    """.trimIndent()

    val jvTask2 = """
        if (edad > 18) {
            System.out.print("Contratado");
        } else {
            System.out.print("No contratado");
        }
    """.trimIndent()

    val jvTask3 = """
        public class Persona {
            String nombre;
            String apellido;
            int edad;
        }

    """.trimIndent()

    fun mCounterSum() {
        _mCounter.value++
    }
}