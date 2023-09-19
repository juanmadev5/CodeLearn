package com.jjgn.app.devlearn.data.course

import com.jjgn.app.devlearn.data.course.module.Module
import kotlinx.coroutines.flow.MutableStateFlow

/**
 * Curso Kotlin
 * */
fun ktCourse(page: Int, _currentMState: MutableStateFlow<Module>): String {
    val module1 = when (page) {
        1 -> {
            """
            ¡Bienvenido al emocionante mundo de la programación en Kotlin!
            
            En este curso de programación en lenguaje Kotlin, te embarcarás en un viaje fascinante hacia el dominio de uno de los lenguajes más modernos y poderosos del desarrollo de software. Kotlin, respaldado por JetBrains, ha ganado rápidamente popularidad en la comunidad de programadores debido a su elegante sintaxis, su facilidad de aprendizaje y su compatibilidad con Java.
            """.trimIndent()
        }

        2 -> {
            """
                Variables
                
                Empezemos con las variables. Una variable es un contenedor que almacena un valor en la memoria durante la ejecución de un programa. Puedes pensar en ellas como cajas etiquetadas donde guardas diferentes valores.
            """.trimIndent()
        }

        3 -> {
            """
                En Kotlin, se utiliza la palabra clave "var" para declarar una variable mutable, es decir, su valor puede cambiar a lo largo del programa. 
                Por ejemplo:  

                var edad = 25
                
                // cambiamos el valor de la variable y lo imprimimos.
                edad = 26
                println(edad)

                Si deseas declarar una variable cuyo valor no puede cambiar, se utiliza la palabra clave "val" para declarar una variable inmutable.
                Por ejemplo:  
                
                val nombre =  “auto”
           """.trimIndent()
        }

        4 -> {
            """
                Tipos de datos básicos
                
                Kotlin es un lenguaje de programación estáticamente tipado, lo que significa que cada variable debe tener un tipo de dato específico. 
            """.trimIndent()
        }

        5 -> {
            """
                Algunos tipos de datos básicos en Kotlin son:
                
                Números enteros
                - Int: representa enteros de 32 bits.
                - Long: representa enteros de 64 bits.
                - Short: representa enteros de 16 bits.
                - Byte: representa enteros de 8 bits.

            """.trimIndent()
        }

        6 -> {
            """
                Números de punto flotante:
                - Float: representa números de punto flotante de 32 bits.
                - Double: representa números de punto flotante de 64 bits
                
                Booleano:
                - Boolean: representa un valor de verdadero o falso (true o false).
                
                Caracteres:
                - Char: representa un solo carácter Unicode.
                
                Cadena de texto:
                - String: representa una secuencia de caracteres.
            """.trimIndent()
        }

        7 -> {
            """
                Al declarar una variable, puedes especificar su tipo explícitamente o dejar que el compilador infiera el tipo automáticamente según el valor asignado. 
                Por ejemplo:
                
                // Declaración explícita de una variable de tipo Int.
                var edad: Int = 25
                
                // El compilador infiere que es de tipo String.	
                var nombre = "Juan" 
            """.trimIndent()
        }

        8 -> {
            """
                Conversión y casting de tipos
                
                La conversión y el casting de tipos en Kotlin se refieren a la capacidad de cambiar el tipo de datos de una variable a otro tipo compatible. Esto es útil cuando necesitas realizar operaciones o asignaciones que requieren tipos de datos específicos. En Kotlin, existen dos formas comunes de realizar la conversión y el casting de tipos: la conversión explícita y el casting seguro.
            """.trimIndent()
        }

        9 -> {
            """
                1. Conversión explícita: 
                
                La conversión explícita implica cambiar el tipo de datos de una variable utilizando funciones y métodos proporcionados por el lenguaje. 
                En Kotlin, puedes utilizar las siguientes funciones de conversión explícita:
                
                toByte(): convierte un valor a tipo Byte.
                toShort(): convierte un valor a tipo Short.
                toInt(): convierte un valor a tipo Int.
                toLong(): convierte un valor a tipo Long.
                toFloat(): convierte un valor a tipo Float.
                toDouble(): convierte un valor a tipo Double.
                toChar(): convierte un valor a tipo Char.
                toString(): convierte un valor a tipo String. 
             
            """.trimIndent()
        }

        10 -> {
            """
               Ejemplo de conversión
               
               val numeroInt: Int = 42
                
               // Conversión explícita de Int a Long
               val numeroLong: Long = numeroInt.toLong() 
                
               En este ejemplo, utilizamos la función toLong() para convertir la variable numeroInt de tipo Int a tipo Long.
           """.trimIndent()
        }

        11 -> {
            """
                2. Casting seguro: 
                
                El casting seguro se utiliza cuando necesitas convertir un objeto a un subtipo más específico en una jerarquía de clases. Puedes utilizar el operador as? para realizar un casting seguro. Si la conversión no es posible, el resultado será null. 
                
            """.trimIndent()
        }

        12 -> {
            """
                Ejemplo de cómo realizar un casting seguro: 

                val animal: Animal = Perro()
                
                // Casting seguro de Animal a Perro
                val perro: Perro? = animal as? Perro 

                En este ejemplo, Animal es una clase base y Perro es una subclase. Utilizamos el operador as? para realizar un casting seguro de animal a Perro. Si animal no es una instancia de Perro, la variable perro se establecerá en null. Recuerda que cuando realices conversiones o castings de tipos, es importante asegurarte de que sean compatibles para evitar posibles errores en tiempo de ejecución.
            """.trimIndent()
        }

        13 -> {
            """
                Operadores

                En Kotlin, los operadores son símbolos o palabras clave que se utilizan para realizar operaciones en variables y valores. Hay varios tipos de operadores disponibles en Kotlin, que se dividen en categorías como operadores aritméticos, operadores de asignación, operadores de comparación, operadores lógicos y más.

            """.trimIndent()
        }

        14 -> {
            """
                Breve descripción de cada tipo de operador:
                
                1. Operadores aritméticos:
                + (suma): se utiliza para sumar dos valores.
                - (resta): se utiliza para restar un valor de otro.
                * (multiplicación): se utiliza para multiplicar dos valores.
                / (división): se utiliza para dividir un valor entre otro.
                % (módulo): se utiliza para obtener el resto de una división.

                2. Operadores de asignación:
                = (asignación): se utiliza para asignar un valor a una variable.
                +=, -=, *=, /=, %= (asignación compuesta): se utilizan para realizar una operación y asignar el resultado a la variable.

            """.trimIndent()
        }

        15 -> {
            """
                3. Operadores de comparación:
                == (igual a): se utiliza para verificar si dos valores son iguales.
                != (no igual a, distinto de): se utiliza para verificar si dos valores son diferentes
                .> (mayor que): se utiliza para verificar si un valor es mayor que otro.
                < (menor que): se utiliza para verificar si un valor es menor que otro.
                >= (mayor o igual que): se utiliza para verificar si un valor es mayor o igual que otro.
                <= (menor o igual que): se utiliza para verificar si un valor es menor o igual que otro.

                

            """.trimIndent()
        }

        16 -> {
            """
                4. Operadores lógicos:
                && (y lógico): se utiliza para verificar si ambas condiciones son verdaderas.
                || (o lógico): se utiliza para verificar si al menos una de las condiciones es verdadera.
                ! (negación lógica): se utiliza para invertir el valor de una condición.
                5. Operadores de incremento y decremento:
                ++ (incremento): se utiliza para aumentar en 1 el valor de una variable.
                -- (decremento): se utiliza para disminuir en 1 el valor de una variable.
            """.trimIndent()
        }

        17 -> {
            """
                Estructuras de control
                
                Las estructuras de control en Kotlin son herramientas que te permiten controlar el flujo de ejecución de un programa. Te permiten tomar decisiones y repetir bloques de código según ciertas condiciones. 

            """.trimIndent()
        }

        18 -> {
            """
                Las estructuras de control fundamentales en Kotlin son las siguientes:

                1. Estructuras condicionales: 
                
                La estructura if-else te permite tomar decisiones basadas en una condición. Si la condición es verdadera, se ejecuta un bloque de código; de lo contrario, se ejecuta otro bloque de código.
                Ejemplo:
                
                val edad = 18
                if (edad >= 18) {
                    println("Eres mayor de edad.")
                } else {
                    println("Eres menor de edad.")
                }

            """.trimIndent()
        }

        19 -> {
            """
                La estructura when es similar a un switch en otros lenguajes de programación. Permite evaluar múltiples casos y ejecutar el bloque de código correspondiente al caso que coincida.
                Ejemplo: 
                
                val diaSemana = 3
                when (diaSemana) {    
                    1 -> println("Lunes")    
                    2 -> println("Martes")    
                    in 3..5 -> println("Días de semana")    
                    else -> println("Fin de semana")
                }
                
                Después de -> se puede agregar {} para realizar multiples acciones.

            """.trimIndent()
        }

        20 -> {
            """
                2. Estructuras de repetición:

                La estructura for se utiliza para iterar sobre una secuencia de elementos, como rangos, listas o matrices.
                Ejemplo:

                for (i in 1..5) {
                    println(i)
                }

            """.trimIndent()
        }

        21 -> {
            """
                La estructura while se utiliza para repetir un bloque de código mientras se cumpla una condición.

                var contador = 0
                while (contador < 5) {
                    println("Contador: $\contador")
                    contador++
                }

            """.trimIndent()
        }

        22 -> {
            """
                La estructura do-while es similar a while, pero garantiza que el bloque de código se ejecute al menos una vez, incluso si la condición inicial es falsa.

                var numero = 1
                do {
                    println(numero)
                    numero++
                } while (numero <= 5)

            """.trimIndent()
        }

        23 -> {
            """
                Estas son algunas de las estructuras de control básicas en Kotlin. Con estas herramientas, puedes controlar el flujo de tu programa, realizar acciones condicionales y repetir bloques de código según tus necesidades.
            """.trimIndent()
        }

        24 -> {
            """
                Funciones y modularidad básica
                
                Las funciones y la modularidad básica son conceptos fundamentales en la programación que te permiten organizar y reutilizar tu código de manera eficiente. En Kotlin, puedes definir tus propias funciones para encapsular un bloque de código y darle un nombre. Esto te permite llamar y ejecutar ese bloque de código en diferentes partes de tu programa. Además, puedes organizar tus funciones en módulos o archivos separados para mejorar la modularidad de tu código.
            """.trimIndent()
        }

        25 -> {
            """
                Aquí tienes una descripción más detallada:

                1. Funciones:
                
                Una función es un bloque de código con un nombre que se puede llamar y ejecutar en cualquier parte de un programa.
                En Kotlin, puedes definir funciones utilizando la palabra clave fun, seguida del nombre de la función, los parámetros (si los hay) y el tipo de retorno (si corresponde).
            """.trimIndent()
        }

        26 -> {
            """
                Puedes especificar los parámetros de una función dentro de los paréntesis (), y si no hay parámetros, los paréntesis pueden estar vacíos.
                Puedes utilizar la palabra clave return para devolver un valor desde una función.
            """.trimIndent()
        }

        27 -> {
            """
                Aquí tienes un ejemplo de cómo definir y llamar una función en Kotlin:

                fun saludar(nombre: String) {
                    println("¡Hola, $\nombre!")
                }
                
                // Llamada a la función saludar
                saludar("Juan") 

            """.trimIndent()
        }

        28 -> {
            """
                Modularidad básica:

                La modularidad se refiere a la capacidad de dividir tu código en módulos o archivos separados, cada uno con una responsabilidad específica.
                En Kotlin, puedes definir funciones y clases en diferentes archivos y paquetes para organizar y estructurar tu código de manera más clara y mantenible.
                Puedes utilizar la declaración package al comienzo de un archivo para especificar el paquete al que pertenece ese archivo.
                Puedes importar funciones y clases de otros archivos utilizando la declaración import.
                
                
            """.trimIndent()
        }

        29 -> {
            """
                Aquí tienes un ejemplo básico de cómo puedes estructurar tus funciones en diferentes archivos:
                
                
                Archivo1.kt
                package com.ejemplo

                fun funcion1() {
                    // Código de la función 1
                }
                
                Archivo2.kt
                package com.ejemplo

                fun funcion2() {
                    // Código de la función 2
                }
                
                
                Main.kt
                package com.ejemplo

                import com.ejemplo.funcion1
                import com.ejemplo.funcion2

                fun main() {
                    funcion1()
                    funcion2()
                }

            """.trimIndent()
        }

        30 -> {
            """
                En este ejemplo, las funciones funcion1 y funcion2 se definen en archivos separados, pero se pueden importar y utilizar en el archivo Main.kt.

                La modularidad y las funciones te permiten organizar y reutilizar tu código de manera efectiva. Al dividir tu código en módulos y definir funciones claras, puedes mejorar la legibilidad, el mantenimiento y la escalabilidad de tus programas Kotlin.
            """.trimIndent()
        }

        31 -> {
            """
                Manejo de errores
                
                El manejo de errores, también conocido como manejo de excepciones, es una técnica utilizada en la programación para controlar y responder a situaciones inesperadas o errores que pueden ocurrir durante la ejecución de un programa. Kotlin proporciona un mecanismo de manejo de errores basado en excepciones que te permite capturar y manejar los errores de manera efectiva. Aquí tienes una descripción de cómo funciona el manejo de errores en Kotlin:
            """.trimIndent()
        }

        32 -> {
            """
                1. Excepciones:

                Una excepción es un objeto que representa una condición anormal o un error que ocurre durante la ejecución de un programa.
                En Kotlin, las excepciones se dividen en dos tipos: excepciones verificadas (checked exceptions) y excepciones no verificadas (unchecked exceptions).
                Las excepciones verificadas son aquellas que el compilador obliga a capturar o declarar. Ejemplos de excepciones verificadas en Kotlin son IOException y SQLException.
                Las excepciones no verificadas son aquellas que no es necesario capturar o declarar explícitamente. Ejemplos de excepciones no verificadas en Kotlin son NullPointerException y IndexOutOfBoundsException.
            """.trimIndent()
        }

        33 -> {
            """
                2. Bloque try-catch:

                Puedes utilizar un bloque try-catch para capturar y manejar excepciones en Kotlin.
                El código que puede generar una excepción se coloca dentro del bloque try.
                Si ocurre una excepción dentro del bloque try, el flujo de ejecución salta al bloque catch correspondiente.
                En el bloque catch, puedes manejar el error de diferentes formas, como mostrar un mensaje de error, tomar medidas correctivas o registrar información de depuración.
            """.trimIndent()
        }

        34 -> {
            """
                Ejemplo:
                
                try {
                    // Código que puede generar una excepción
                    val resultado = dividir(10, 0)
                    println("Resultado: $\resultado")
                } catch (ex: Exception) {
                    // Manejo de la excepción
                    println("Se produjo un error: $\{message}")
                }

            """.trimIndent()
        }

        35 -> {
            """
                3. Bloque finally:

                Opcionalmente, puedes utilizar un bloque finally junto con el bloque try-catch.
                El bloque finally se ejecuta siempre, independientemente de si se produce una excepción o no.
                Puedes utilizar el bloque finally para realizar tareas de limpieza, como cerrar archivos o liberar recursos, que deben realizarse sin importar si ocurrió una excepción.
            """.trimIndent()
        }

        36 -> {
            """
                Ejemplo: 
                
                try {
                    // Código que puede generar una excepción
                    abrirArchivo()
                } catch (ex: IOException) {
                    // Manejo de la excepción de E/S
                    println("Error de E/S: $\message")
                } finally {
                    // Tareas de limpieza
                    cerrarArchivo()
                }

            """.trimIndent()
        }

        37 -> {
            """
                Estos son solo conceptos básicos del manejo de errores en Kotlin. Además del bloque try-catch, Kotlin proporciona características adicionales, como la declaración throw para lanzar excepciones manualmente y la posibilidad de crear tus propias clases de excepción personalizadas. El manejo de errores es esencial para garantizar una ejecución segura y controlada de tus programas, y te permite responder adecuadamente a situaciones inesperadas.
            """.trimIndent()
        }

        38 -> {
            """
               La programación funcional es un paradigma de programación que se basa en el uso de funciones puras, inmutabilidad y expresiones funcionales. En Kotlin, puedes utilizar conceptos de programación funcional para escribir código más conciso, modular y fácil de razonar. 
            """.trimIndent()
        }

        39 -> {
            """
                Aquí tienes una descripción básica de los elementos de la programación funcional en Kotlin:
                
                1. Funciones puras:

                Una función pura es una función que siempre produce el mismo resultado para los mismos valores de entrada y no tiene efectos secundarios.
                En Kotlin, puedes escribir funciones puras que no dependan de ningún estado mutable externo y solo utilicen los valores pasados como argumentos y las variables locales definidas dentro de la función.
                Ejemplo:
                
                fun sumar(a: Int, b: Int): Int {
                    return a + b
                }

            """.trimIndent()
        }

        40 -> {
            """
                2. Inmutabilidad:

                La inmutabilidad se refiere a la incapacidad de modificar un objeto una vez que se ha creado.
                En Kotlin, puedes declarar variables como val en lugar de var para hacerlas inmutables, lo que significa que no se pueden cambiar después de la asignación inicial.
                Al utilizar la inmutabilidad, evitas los efectos secundarios y haces que tu código sea más predecible y seguro.
                Ejemplo:
                
                val pi = 3.14159
            """.trimIndent()
        }

        41 -> {
            """
                3. Expresiones lambda:

                Las expresiones lambda son funciones anónimas que se pueden utilizar para crear funciones de forma concisa.
                En Kotlin, puedes utilizar la sintaxis de expresiones lambda con el operador -> para definir una función de forma compacta.
                Ejemplo:
                
                val multiplicar: (Int, Int) -> Int = { a, b -> a * b }

            """.trimIndent()
        }

        42 -> {
            """
                4. Funciones de orden superior:

                Las funciones de orden superior son funciones que pueden aceptar otras funciones como argumentos o devolver funciones como resultados.
                En Kotlin, puedes utilizar funciones de orden superior para abstraer comportamientos comunes y mejorar la reutilización de código.
                Ejemplo:
                
                fun operar(a: Int, b: Int, funcion: (Int, Int) -> Int): Int {
                    return funcion(a, b)
                }

                val resultado = operar(5, 3, { a, b -> a + b })

            """.trimIndent()
        }

        43 -> {
            """
                5. Funciones de extensión:

                Las funciones de extensión te permiten agregar funciones a clases existentes sin modificar su código fuente.
                En Kotlin, puedes definir funciones de extensión utilizando la sintaxis nombreClase.nombreFuncion().
                Ejemplo:
                
                fun String.duplicar(): String {
                    return this + this
                }

                val texto = "Hola"
                val resultado = texto.duplicar() // "HolaHola"

            """.trimIndent()
        }

        44 -> {
            """
                Estos son solo conceptos básicos de la programación funcional en Kotlin. La programación funcional fomenta el uso de funciones como ciudadanos de primera clase y promueve la composición de funciones y la inmutabilidad. Al utilizar estos conceptos, puedes escribir código más modular, conciso y fácil de entender.
            """.trimIndent()
        }

        else -> {
            ""
        }
    }
    val module2 = when (page) {
        1 -> {
            """
                En este módulo nos centraremos en las funciones y los arreglos. Exploraremos cómo trabajar con funciones más avanzadas y cómo utilizar arreglos para almacenar y manipular conjuntos de datos.
            """.trimIndent()
        }

        2 -> {
            """
                1. Funciones avanzadas:

                Parámetros predeterminados: En Kotlin, puedes asignar valores predeterminados a los parámetros de una función. Esto permite llamar a la función sin proporcionar valores para esos parámetros, ya que utilizarán sus valores predeterminados.
                Ejemplo:
                
                fun saludar(nombre: String = "Usuario") {
                    println("¡Hola, $\nombre!")
                }

                saludar() // Salida: ¡Hola, Usuario!
                saludar("Juan") // Salida: ¡Hola, Juan!

            """.trimIndent()
        }

        3 -> {
            """
                Parámetros nombrados: 
                
                Puedes utilizar parámetros nombrados para llamar a una función especificando el nombre del parámetro y su valor correspondiente. Esto es útil cuando tienes una función con múltiples parámetros y deseas especificar solo algunos de ellos.
            """.trimIndent()
        }

        4 -> {
            """
                Ejemplo:
                
                fun calcularVolumen(ancho: Int, alto: Int, profundidad: Int) {
                    // Cálculo del volumen
                }
                calcularVolumen(ancho = 10, profundidad = 5, alto = 3)
            """.trimIndent()
        }

        5 -> {
            """
                2. Arreglos:

                Los arreglos son estructuras de datos que te permiten almacenar y acceder a múltiples elementos del mismo tipo en una sola variable.
                En Kotlin, puedes crear arreglos utilizando la función arrayOf() y especificando los elementos que deseas almacenar.
            """.trimIndent()
        }

        6 -> {
            """
                Ejemplo:
                
                val numeros = arrayOf(1, 2, 3, 4, 5)

                Puedes acceder a los elementos de un arreglo utilizando el índice correspondiente entre corchetes [ ]. El índice comienza en cero.
                
                val primerNumero = numeros[0]

                
            """.trimIndent()
        }

        7 -> {
            """
                Los arreglos son mutables, lo que significa que puedes modificar los elementos almacenados en ellos.
                Ejemplo:
                
                numeros[2] = 10

            """.trimIndent()
        }

        8 -> {
            """
                También existen otras funciones y propiedades útiles para trabajar con arreglos, como size para obtener el tamaño del arreglo, forEach para iterar sobre los elementos y indices para acceder a los índices válidos del arreglo.
                Ejemplo:
                
                numeros.forEach { numero ->
                    println(numero)
                }

            """.trimIndent()
        }

        else -> {
            ""
        }
    }
    val module3 = when (page) {
        1 -> {
            """
                La orientación a objetos es un paradigma de programación que se basa en la creación de objetos y su interacción para resolver problemas. En Kotlin, puedes utilizar la orientación a objetos para crear clases, objetos, herencia y polimorfismo.
            """.trimIndent()
        }

        2 -> {
            """
                1. Clases y objetos:

                En Kotlin, puedes crear clases utilizando la palabra clave class. Una clase es una plantilla o un plano que define propiedades y comportamientos de un tipo de objeto.
                Puedes crear objetos o instancias de una clase utilizando el operador new o simplemente llamando al constructor de la clase.
            """.trimIndent()
        }

        3 -> {
            """
                Ejemplo:
                
                class Persona {
                    var nombre: String = ""
                    var edad: Int = 0

                    fun saludar() {
                        println("¡Hola, soy $\nombre!")
                    }
                }

                val persona = Persona()
                persona.nombre = "Juan"
                persona.edad = 25
                persona.saludar()

            """.trimIndent()
        }

        4 -> {
            """
                2. Herencia:

                En Kotlin, puedes crear jerarquías de clases utilizando la herencia. Una clase puede heredar propiedades y comportamientos de otra clase utilizando la palabra clave :.
                La clase que se hereda se denomina clase base o superclase, y la clase que hereda se denomina clase derivada o subclase.
            """.trimIndent()
        }

        5 -> {
            """
                Ejemplo:
                
                open class Animal {
                    open fun hacerSonido() {
                        println("El animal hace un sonido.")
                    }
                }

                class Perro : Animal() {
                    override fun hacerSonido() {
                        println("El perro hace 'guau guau'.")
                    }
                }

                val perro = Perro()
                perro.hacerSonido()

            """.trimIndent()
        }

        6 -> {
            """
                3. Polimorfismo:

                El polimorfismo te permite tratar objetos de diferentes clases de manera uniforme.
                En Kotlin, puedes lograr el polimorfismo mediante la creación de funciones o propiedades en una superclase y sobrescribiéndolas en las subclases según sea necesario.
            """.trimIndent()
        }

        7 -> {
            """
                Ejemplo:
                
                open class Figura {
                    open fun dibujar() {
                        println("Dibujando una figura genérica.")
                    }
                }

                class Circulo : Figura() {
                    override fun dibujar() {
                        println("Dibujando un círculo.")
                    }
                }

                class Cuadrado : Figura() {
                    override fun dibujar() {
                        println("Dibujando un cuadrado.")
                    }
                }

                val figuras = arrayOf(Circulo(), Cuadrado())
                for (figura in figuras) {
                    figura.dibujar()
                }

            """.trimIndent()
        }

        8 -> {
            """
                Modificadores de acceso:

                Los modificadores de acceso en Kotlin te permiten controlar la visibilidad y el alcance de las propiedades y funciones de una clase.
                Los modificadores de acceso más comunes son public, private, protected e internal.
                
                public: Accesible desde cualquier parte del código.
                private: Accesible solo dentro de la misma clase.
                protected: Accesible dentro de la misma clase y sus subclases.
                internal: Accesible dentro del mismo módulo.
            """.trimIndent()
        }

        9 -> {
            """
                Ejemplo: 
                
                class Persona {
                    public var nombre: String = ""
                    private var edad: Int = 0
                    protected var direccion: String = ""
                    internal var telefono: String = ""
                }

            """.trimIndent()
        }

        10 -> {
            """
                Interfaces:

                Una interfaz en Kotlin define un conjunto de propiedades y funciones que una clase puede implementar.
                Las interfaces se utilizan para establecer un contrato que una clase debe seguir.
                Puedes implementar múltiples interfaces en una clase y proporcionar implementaciones para sus funciones.
            """.trimIndent()
        }

        11 -> {
            """
                Ejemplo:
                
                interface Reproducible {
                    fun reproducir()
                    fun detener()
                }

                class Musica : Reproducible {
                    override fun reproducir() {
                        println("Reproduciendo música...")
                    }

                    override fun detener() {
                        println("Deteniendo reproducción de música.")
                    }
                }

            """.trimIndent()
        }

        12 -> {
            """
                Sobrecarga de operadores:

                Kotlin permite sobrecargar operadores, lo que significa que puedes proporcionar implementaciones personalizadas para operadores como +, -, *, /, entre otros.
                Para sobrecargar un operador, debes definir una función con el nombre especial correspondiente al operador.
            """.trimIndent()
        }

        13 -> {
            """
                Ejemplo:
                
                data class Punto(val x: Int, val y: Int) {
                    operator fun plus(punto: Punto): Punto {
                        return Punto(x + punto.x, y + punto.y)
                    }
                }

                val punto1 = Punto(2, 3)
                val punto2 = Punto(4, 5)
                val suma = punto1 + punto2

            """.trimIndent()
        }

        else -> {
            ""
        }
    }

    return when (_currentMState.value) {
        is Module.KTM1 -> module1
        is Module.KTM2 -> module2
        is Module.KTM3 -> module3
        else -> ""
    }
}