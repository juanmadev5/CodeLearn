package com.jjgn.app.devlearn.data.course

import com.jjgn.app.devlearn.data.course.module.Module
import kotlinx.coroutines.flow.MutableStateFlow

// Curso Javascript
fun jsCourse(page: Int, _currentMState: MutableStateFlow<Module>): String {
    val module1 = when (page) {
        1 -> {
            """
                Bienvenidos al curso de Javascript: el lenguaje de programación más utilizado en el desarrollo web. En este emocionante viaje de aprendizaje, descubriremos cómo Javascript permite dar vida a nuestras páginas web, crear interactividad y potenciar la experiencia del usuario. Este curso te llevará paso a paso en el mundo del desarrollo web con Javascript. ¡Prepárate para adquirir nuevas habilidades y convertirte en un experto en la creación de aplicaciones web dinámicas e innovadoras!
            """.trimIndent()
        }

        2 -> {
            """
                Variables
                
                En JavaScript, una variable es un contenedor que puede almacenar diferentes tipos de datos, como números, cadenas de texto, booleanos, arreglos u objetos. Las variables pueden cambiar de valor durante la ejecución del programa.
                Ejemplo:

                // Declaración de variable
                Let edad;

                // Asignación de valor
                Edad = 25;

                // Uso de la variable
                Console.log(“Mi edad es: “ + edad); // Salida: “Mi edad es: 25”

                // Actualización del valor de la variable
                Edad = 30;
                Console.log(“Mi nueva edad es: “ + edad); // Salida: “Mi nueva edad es: 30”


                En este ejemplo, hemos declarado una variable llamada edad sin asignarle un valor inicial. Luego, le asignamos el valor 25, lo mostramos en la consola y finalmente actualizamos su valor a 30.

            """.trimIndent()
        }

        3
        -> {
            """
                Constantes:
                
                Una constante, como su nombre lo indica, es un tipo de variable que no puede cambiar su valor una vez que se ha asignado. Se declara usando la palabra clave const.
                Ejemplo:

                // Declaración de constante
                const pi = 3.1416;

                // Intento de actualizar el valor de la constante (esto dará un error)
                pi = 3.14; // Error: Assignment to constant variable.

            """.trimIndent()
        }

        4 -> {
            """
                Tipos de datos
                
                Existen varios tipos de datos que nos permiten representar y manipular diferentes tipos de información en nuestros programas. A continuación, los principales tipos de datos en JavaScript:
                
                Números (Numbers): Representan valores numéricos, ya sean enteros o decimales.
                Ejemplo:
                
                let edad = 30;
                let precio = 12.99; 

            """.trimIndent()
        }

        5 -> {
            """
                Cadenas de texto (Strings): Son secuencias de caracteres encerradas entre comillas (simples o dobles).
                Ejemplo:
                
                let nombre = "Juan";
                let mensaje = 'Hola, ¿cómo estás?'; 
                
                Booleanos (Booleans): Representan valores de verdadero o falso.
                Ejemplo:
                
                let esMayorEdad = true;
                let esEstudiante = false; 
            """.trimIndent()
        }

        6 -> {
            """
               Arreglos (Arrays): Son estructuras que nos permiten almacenar múltiples valores en una sola variable.
                Ejemplo:
                
                let colores = ["rojo", "verde", "azul"]; 
                let numeros = [1, 2, 3, 4, 5]; 
                
                Objetos (Objects): Son estructuras que nos permiten agrupar múltiples valores relacionados, representados en pares de clave-valor.
                Ejemplo:
                
                let persona = { 
                    nombre: "María",
                    edad: 25, 
                    ocupación: "ingeniera" }; 
            """.trimIndent()
        }

        7 -> {
            """
                Nulos (Null): Representa la ausencia intencional de un valor.
                Ejemplo:
                
                let valorNulo = null; 
                
                Indefinidos (Undefined): Representa el valor de una variable que no ha sido asignada.
                Ejemplo:
                
                let valorIndefinido;
                console.log(valorIndefinido); // Salida: undefined 
                
                Símbolos (Symbols): Son valores únicos e inmutables que se utilizan como identificadores para propiedades de objetos.
                Ejemplo: 
                const simbolo1 = Symbol();
                const simbolo2 = Symbol('descripcion');

            """.trimIndent()
        }

        8 -> {
            """
                Operadores 
                
                Operadores Aritméticos: Los operadores aritméticos se utilizan para realizar operaciones matemáticas en JavaScript.
                
                Suma (+): Suma dos valores.
                Resta (-): Resta el segundo valor del primero.
                Multiplicación (*): Multiplica dos valores.
                División (/): Divide el primer valor por el segundo.
                Módulo (%): Devuelve el resto de la división entre dos valores.

            """.trimIndent()
        }

        9 -> {
            """
                Ejemplo:
                
                Let num1 = 10;
                Let num2 = 3;
                Console.log(num1 + num2); // Salida: 13
                Console.log(num1 – num2); // Salida: 7
                Console.log(num1 * num2); // Salida: 30
                Console.log(num1 / num2); // Salida: 3.3333333333333335
                Console.log(num1 % num2); // Salida: 1

            """.trimIndent()
        }

        10 -> {
            """
                Operadores de Asignación
                
                Los operadores de asignación se utilizan para asignar valores a variables.
                
                Asignación (=): Asigna el valor del lado derecho al lado izquierdo.
                
                Operadores de asignación combinada: Realizan una operación y asignan el resultado a la variable.
                
                Ejemplo:
                Let x = 10;

                X = x + 5; // Equivalente a: x += 5;
                Console.log(x); // Salida: 15

                X = x * 2; // Equivalente a: x *= 2;
                Console.log(x); // Salida: 30


            """.trimIndent()
        }

        11 -> {
            """
                Operadores Lógicos
                
                Los operadores lógicos se utilizan para evaluar expresiones booleanas y devuelven un valor booleano (verdadero o falso).
                
                AND lógico (&&): Devuelve verdadero si ambas expresiones son verdaderas.
                OR lógico (||): Devuelve verdadero si al menos una de las expresiones es verdadera.
                NOT lógico (¡): Niega el valor de la expresión.
                
                Ejemplo:
                
                Let a = true;
                Let b = false;

                Console.log(a && b); // Salida: false (ambas expresiones no son verdaderas)
                Console.log(a || b); // Salida: true (al menos una de las expresiones es verdadera)
                Console.log(¡a);     // Salida: false (la negación de ‘a’ es false)


            """.trimIndent()
        }

        12 -> {
            """
                Estructura de Control
                
                Las estructuras de control en JavaScript son instrucciones que nos permiten tomar decisiones o repetir acciones según ciertas condiciones. Las principales estructuras de control son: if-else, switch y los bucles (for, while y do-while).

            """.trimIndent()
        }

        13 -> {
            """
                Estructura if-else
                
                La estructura if-else se utiliza para tomar decisiones condicionales. Si la condición dentro del if es verdadera, se ejecuta el bloque de código dentro del if; de lo contrario, se ejecuta el bloque de código dentro del else.
                Ejemplo:
                
                Let edad = 18;
                If (edad >= 18) {
                    Console.log(“Eres mayor de edad.”);
                } else {
                    Console.log(“Eres menor de edad.”);
                }

            """.trimIndent()
        }

        14 -> {
            """
                Estructura switch:
                
                La estructura switch se utiliza para realizar múltiples comparaciones en una variable y ejecutar diferentes bloques de código según el valor de la variable.
                
                Ejemplo:
                Let diaSemana = “lunes”;
                Switch (diaSemana) {
                    Case “lunes”:
                        Console.log(“Hoy es lunes.”);
                        Break;
                    Case “martes”:
                        Console.log(“Hoy es martes.”);
                        Break;
                    Default:
                        Console.log(“Hoy es otro día de la semana.”);
                }

            """.trimIndent()
        }

        15 -> {
            """
                Bucles:
                
                Los bucles nos permiten repetir un bloque de código mientras se cumpla una condición.
                Bucle for: Se ejecuta una serie de instrucciones un número determinado de veces.
                Ejemplo:
                
                For (let i = 1; i <= 5; i++) {
                    Console.log(“Iteración número “ + i);
                }

            """.trimIndent()
        }

        16 -> {
            """
               Bucle while: Repite un bloque de código mientras se cumpla una condición.
               
               Ejemplo:
               
               Let contador = 1;
               While (contador <= 5) {
                    Console.log(“Iteración número “ + contador);
                    Contador++;
               }
 
            """.trimIndent()
        }

        17 -> {
            """
               Bucle do-while: Es similar al bucle while, pero siempre se ejecuta al menos una vez antes de verificar la condición.
               
               Ejemplo:
               
               Let numero = 1;
               Do {
                    Console.log(“Número: “ + numero);
                    Numero++;
               } while (numero <= 5);
 
            """.trimIndent()
        }

        else -> {
            ""
        }
    }
    val module2 = when (page) {
        1 -> {
            """
                Funciones
                
                En JavaScript, una función es un bloque de código que realiza una tarea específica. Las funciones son una parte fundamental de la programación, ya que permiten dividir el código en tareas más pequeñas y reutilizables. Pueden recibir datos de entrada (parámetros), realizar operaciones con ellos y devolver un resultado (valor de retorno) si es necesario.

            """.trimIndent()
        }

        2 -> {
            """
                Sintaxis de una función:
                
                Para crear una función en JavaScript, utilizamos la palabra clave function, seguida del nombre de la función, paréntesis que pueden contener parámetros (opcional), y finalmente las llaves {} que contienen el cuerpo de la función con las instrucciones que serán ejecutadas.
                
                Ejemplo de una función sin parámetros y sin valor de retorno:
                
                Function saludar() {
                  Console.log(“¡Hola! Bienvenido/a.”);
                }
                
                Ejemplo de una función con parámetros y con valor de retorno:
                    
                Function sumar(num1, num2) {
                  Return num1 + num2;
                }
                 
            """.trimIndent()
        }

        3 -> {
            """
                 Llamando a una función:
                 
                 Para usar una función, la llamamos por su nombre seguido de paréntesis que contienen los valores de los parámetros si los requiere. Si la función tiene un valor de retorno, podemos almacenar ese valor en una variable o utilizarlo directamente.
                 
                 Ejemplo de llamada a la función saludar():
                 
                 Saludar(); // Llamando a la función sin parámetros
                    
                 Ejemplo de llamada a la función sumar():
                    
                 Let resultadoSuma = sumar(5, 3); // Llamando a la función con parámetros y almacenando el resultado
                 Console.log(“El resultado de la suma es: “ + resultadoSuma);

            """.trimIndent()
        }

        4 -> {
            """
                Funciones anónimas y de flecha:
                
                Además de las funciones tradicionales, en JavaScript también podemos crear funciones anónimas y funciones de flecha (introducidas en ES6).

                Ejemplo de función anónima:
                
                Let saludar = function() {
                  Console.log(“¡Hola! Bienvenido/a.”);
                };
                Saludar(); // Llamando a la función anónima
                
                Ejemplo de función de flecha:
                
                Const sumar = (num1, num2) => num1 + num2;
                Let resultadoSuma = sumar(5, 3);
                Console.log(“El resultado de la suma es: “ + resultadoSuma);


            """.trimIndent()
        }

        5 -> {
            """
                Funciones como objetos de primera clase:
                
                En JavaScript, las funciones son objetos de primera clase, lo que significa que pueden ser tratadas como cualquier otro objeto. Pueden ser asignadas a variables, pasadas como argumentos a otras funciones y también retornadas por otras funciones.
                
                Function operación(func, num1, num2) {
                  Return func(num1, num2);
                }
                Const suma = (a, b) => a + b;
                Const resta = (a, b) => a – b;
                Let resultadoSuma = operación(suma, 5, 3); // Llamando a la función con función como argumento
                Let resultadoResta = operación(resta, 5, 3);
                Console.log(“El resultado de la suma es: “ + resultadoSuma);
                Console.log(“El resultado de la resta es: “ + resultadoResta);

            """.trimIndent()
        }

        6 -> {
            """
                Las funciones son una característica poderosa de JavaScript que nos permiten escribir código modular, reutilizable y bien organizado. Son fundamentales en el desarrollo de aplicaciones y te ayudarán a crear programas más complejos y eficientes.
            """.trimIndent()
        }

        7 -> {
            """
                Arreglos
                
                Son estructuras de datos en JavaScript que nos permiten almacenar múltiples valores en una sola variable. Los elementos de un arreglo pueden ser de cualquier tipo de datos, como números, cadenas de texto, booleanos, objetos y hasta otros arreglos. Los arreglos son una parte fundamental de la programación, ya que nos permiten trabajar con conjuntos de datos de manera eficiente.

            """.trimIndent()
        }

        8 -> {
            """
                Declaración de un arreglo
                
                Para crear un arreglo en JavaScript, utilizamos corchetes [] y colocamos los elementos separados por comas.
                
                Ejemplo:
                
                let numeros = [1, 2, 3, 4, 5];
                let frutas = ['manzana', 'naranja', 'plátano']; 
                
                Acceso a elementos del arreglo: Los elementos del arreglo son accesibles mediante su índice, que es un número entero que comienza en 0 para el primer elemento, 1 para el segundo y así sucesivamente.
                
                Ejemplo:
                
                let frutas = ['manzana', 'naranja', 'plátano'];
                console.log(frutas[0]); // Salida: "manzana"
                console.log(frutas[1]); // Salida: "naranja"
                console.log(frutas[2]); // Salida: "plátano" 

            """.trimIndent()
        }

        9 -> {
            """
                Métodos de arreglo: 
                
                JavaScript proporciona varios métodos integrados para manipular arreglos de manera sencilla y eficiente. 
                Algunos de los métodos más comunes son:
                push(): Agrega elementos al final del arreglo.
                pop(): Elimina el último elemento del arreglo.
                shift(): Elimina el primer elemento del arreglo.
                unshift(): Agrega elementos al inicio del arreglo.
                splice(): Permite agregar, eliminar o reemplazar elementos en una posición específica del arreglo.
                slice(): Crea una copia de una porción del arreglo, sin modificar el arreglo original.
                concat(): Combina dos o más arreglos en uno nuevo.
                forEach(): Ejecuta una función proporcionada una vez por cada elemento del arreglo.
                map(): Crea un nuevo arreglo con los resultados de aplicar una función a cada elemento del arreglo.
                filter(): Crea un nuevo arreglo con todos los elementos que cumplan una condición dada.
 
            """.trimIndent()
        }

        10 -> {
            """
                Ejemplo de uso de algunos métodos de arreglo:
                
                let numeros = [1, 2, 3, 4, 5]; 
                numeros.push(6);
                console.log(numeros); // Salida: [1, 2, 3, 4, 5, 6] 
                numeros.pop(); console.log(numeros); // Salida: [1, 2, 3, 4, 5] let frutas = ['manzana', 'naranja', 'plátano']; 
                frutas.splice(1, 1, 'uva'); console.log(frutas); // Salida: ['manzana', 'uva', 'plátano'] 
 
            """.trimIndent()
        }

        11 -> {
            """
                Longitud del arreglo: Podemos obtener la cantidad de elementos en un arreglo utilizando la propiedad length.
                
                Ejemplo:
                
                let frutas = ['manzana', 'naranja', 'plátano']; 
                console.log(frutas.length); // Salida: 3 

            """.trimIndent()
        }

        12 -> {
            """
                Los arreglos son una herramienta poderosa y versátil en JavaScript. Nos permiten trabajar con conjuntos de datos de manera flexible y realizar diversas operaciones, como agregar o eliminar elementos, transformar datos y recorrer el arreglo para realizar tareas específicas. Con el uso adecuado de los métodos de arreglo, podemos optimizar nuestro código y mejorar su legibilidad y mantenibilidad.            """.trimIndent()
        }

        else -> {
            ""
        }
    }
    val module3 = when (page) {
        1 -> {
            """
                Programación Orientada a Objetos
                
                La orientación a objetos es un paradigma de programación que se basa en organizar y estructurar el código en torno a objetos. Un objeto es una entidad que combina datos (propiedades) y comportamientos (métodos) relacionados en una sola unidad. En JavaScript, puedes implementar la orientación a objetos utilizando prototipos o clases (introducidas en ES6).

            """.trimIndent()
        }

        2 -> {
            """
                Conceptos clave de la orientación a objetos:
                
                Clase: Una clase es una plantilla o plano que define la estructura y comportamiento de un objeto. Define las propiedades y métodos que tendrán los objetos que se creen a partir de ella.
                Objeto: Un objeto es una instancia de una clase. Es una entidad con sus propias características y comportamientos basados en la clase.
                Propiedades: Las propiedades son las variables que representan las características o atributos del objeto.
                Métodos: Los métodos son funciones que representan las acciones o comportamientos del objeto.

            """.trimIndent()
        }

        3 -> {
            """
                Clase
                
                Una clase es una plantilla que define la estructura y comportamiento de los objetos que se creen a partir de ella. En JavaScript, podemos utilizar la sintaxis de clases (introducida en ES6) para definir una clase.
                Ejemplo:
                class Persona { 
                   constructor(nombre, edad) { 
                        this.nombre = nombre; 
                        this.edad = edad; 
                   } 
                saludar() { 
                console.log(`Hola, mi nombre es $\{this.nombre} y tengo $\{this.edad} años.`); 
                   } 
                } 
                
                Crear objetos basados en la clase: Una vez que hemos definido la clase, podemos crear objetos basados en ella utilizando la palabra clave new.
                
                Ejemplo:
                
                let persona1 = new Persona('Juan', 30); 
                let persona2 = new Persona('María', 25); 

            """.trimIndent()
        }

        4 -> {
            """
                 Acceder a las propiedades y métodos del objeto: Podemos acceder a las propiedades y métodos de un objeto utilizando la notación de punto ..
                    
                 Ejemplo:
                 
                 console.log(persona1.nombre); // Salida: "Juan" 
                 console.log(persona2.edad); // Salida: 25 
                 persona1.saludar(); // Salida: "Hola, mi nombre es Juan y tengo 30 años." 
                 persona2.saludar(); // Salida: "Hola, mi nombre es María y tengo 25 años." 

            """.trimIndent()
        }

        5 -> {
            """
                Herencia: 
                
                La herencia es un concepto clave en la POO que permite que una clase (subclase) herede propiedades y métodos de otra clase (superclase). En JavaScript, se logra mediante la palabra clave extends.
                
                Ejemplo:
                
                class Estudiante extends Persona {
                  constructor(nombre, edad, curso) {
                    super(nombre, edad);
                    this.curso = curso;
                  }
                  mostrarCurso() {
                    console.log(`Soy estudiante y estoy en el curso $\{this.curso}.`);
                  }
                }
                let estudiante1 = new Estudiante('Ana', 20, 'Programación');
                estudiante1.saludar();    // Salida: "Hola, mi nombre es Ana y tengo 20 años."
                estudiante1.mostrarCurso(); // Salida: "Soy estudiante y estoy en el curso Programación."
                
                En este ejemplo, la clase Estudiante hereda de la clase Persona, lo que permite que los objetos basados en la clase Estudiante tengan tanto las propiedades y métodos de la clase Persona como las propias de la clase Estudiante.

            """.trimIndent()
        }

        6 -> {
            """
                    Objetos
                    
                    Los objetos son estructuras de datos en JavaScript que nos permiten almacenar múltiples valores relacionados en una sola entidad. Los objetos se componen de propiedades y métodos, que representan características y comportamientos respectivamente. Son una parte fundamental de la programación orientada a objetos (POO) en JavaScript.

            """.trimIndent()
        }

        7 -> {
            """
                Sintaxis de un objeto:
                
                En JavaScript, un objeto se define utilizando llaves {}. Dentro de las llaves, se especifican las propiedades y métodos del objeto, separados por comas.
                
                Ejemplo de un objeto con propiedades:
                
                Let persona = {
                  Nombre: ‘Juan’,
                  Edad: 30,
                  Ocupacion: ‘Ingeniero’
                };
 
            """.trimIndent()
        }

        8 -> {
            """
                Acceso a las propiedades del objeto:
                
                Podemos acceder a las propiedades de un objeto utilizando la notación de punto . o la notación de corchetes [].
                Ejemplo de acceso a propiedades:
                
                Console.log(persona.nombre);   // Salida: “Juan”
                Console.log(persona[‘edad’]);  // Salida: 30
                
            """.trimIndent()
        }

        9 -> {
            """
                Métodos en objetos:
                
                Los métodos son funciones que están dentro de un objeto. Representan los comportamientos asociados al objeto.
                
                Ejemplo de objeto con métodos:
                
                Let calculadora = {
                  Sumar: function(a, b) {
                    Return a + b;
                  },
                  Restar: function(a, b) {
                    Return a – b;
                  }
                };

                Console.log(calculadora.sumar(5, 3));  // Salida: 8
                Console.log(calculadora.restar(5, 3)); // Salida: 2

            """.trimIndent()
        }

        10 -> {
            """
                Objetos como parámetros y retornos:
                
                Los objetos pueden ser pasados como argumentos a funciones o ser retornados por ellas.
                
                Ejemplo de función que recibe un objeto como argumento:
                
                Function saludarPersona(persona) {
                  Console.log(`Hola, mi nombre es $\{persona.nombre} y tengo $\{persona.edad} años.`);
                }
                saludarPersona(persona); // Salida: “Hola, mi nombre es Juan y tengo 30 años.”

            """.trimIndent()
        }

        11 -> {
            """
                Objetos anidados:
                
                En JavaScript, los objetos también pueden contener otros objetos como propiedades, lo que se conoce como objetos anidados.
                
                Ejemplo de objeto anidado:
                
                Let persona = {
                  Nombre: ‘Juan’,
                  Edad: 30,
                  Direccion: {
                    Calle: ‘Av. Principal’,
                    Ciudad: ‘Ciudad de México’,
                    Pais: ‘México’
                  }
                };
                Console.log(persona.direccion.calle); // Salida: “Av. Principal”
 
            """.trimIndent()
        }

        12 -> {
            """
                Propiedades
                
                Las propiedades son las características o atributos que posee un objeto. Son pares clave-valor donde la clave (también conocida como nombre de propiedad) es una cadena que identifica la propiedad, y el valor es el dato que se asocia a esa clave. Las propiedades pueden contener cualquier tipo de dato, como números, cadenas de texto, booleanos, arreglos, objetos o incluso otras funciones.

            """.trimIndent()
        }

        13 -> {
            """
                Creación de un objeto con propiedades:
                
                Para crear un objeto con propiedades, se utiliza la sintaxis de llaves {} y se especifican las propiedades dentro de ellas.
                
                Ejemplo de objeto con propiedades:
                
                Let persona = {
                  Nombre: ‘Juan’,
                  Edad: 30,
                  Casado: false,
                  Hobbies: [‘leer’, ‘correr’, ‘cocinar’],
                  Direccion: {
                    Calle: ‘Av. Principal’,
                    Ciudad: ‘Ciudad de México’,
                    Pais: ‘México’
                  }
                };

            """.trimIndent()
        }

        14 -> {
            """
                Acceso a las propiedades del objeto:
                
                Podemos acceder a las propiedades de un objeto utilizando la notación de punto . o la notación de corchetes [].
                Ejemplo de acceso a propiedades:
                
                Console.log(persona.nombre);       // Salida: “Juan”
                Console.log(persona[‘edad’]);      // Salida: 30
                Console.log(persona.casado);       // Salida: false
                Console.log(persona.hobbies[0]);   // Salida: “leer”
                Console.log(persona.direccion.calle); // Salida: “Av. Principal”

            """.trimIndent()
        }

        15 -> {
            """
                Agregar o modificar propiedades:
                
                Podemos agregar nuevas propiedades o modificar el valor de propiedades existentes en un objeto simplemente asignando un valor a la clave correspondiente.
                
                Ejemplo de agregar o modificar propiedades:
                
                Persona.trabajo = ‘Ingeniero’;   // Agregar la propiedad ‘trabajo’
                Persona.edad = 31;               // Modificar el valor de la propiedad ‘edad’
                Console.log(persona.trabajo);   // Salida: “Ingeniero”
                Console.log(persona.edad);      // Salida: 31

            """.trimIndent()
        }

        16 -> {
            """
                Eliminar propiedades:
                
                Podemos eliminar una propiedad de un objeto utilizando el operador delete.
                
                Ejemplo de eliminar una propiedad:
                
                Delete persona.casado;
                Console.log(persona.casado);   // Salida: undefined

            """.trimIndent()
        }

        17 -> {
            """
                Métodos 
                
                Los métodos en JavaScript son funciones que están asociadas a un objeto. Estas funciones representan los comportamientos del objeto y pueden acceder y manipular las propiedades del mismo. Los métodos se definen dentro de un objeto y se utilizan para realizar tareas específicas relacionadas con el objeto.
                Creación de un método:
                
                Para crear un método en un objeto, simplemente se define una función dentro de dicho objeto.
                Ejemplo de objeto con método:
                
                Let persona = {
                  Nombre: ‘Juan’,
                  Edad: 30,
                  Saludar: function() {
                    Console.log(`Hola, mi nombre es $\{this.nombre} y tengo $\{this.edad} años.`);
                  }
                };

            """.trimIndent()
        }

        18 -> {
            """
                Llamada a un método:
                Para llamar a un método de un objeto, utilizamos la notación de punto . y colocamos el nombre del método seguido de paréntesis ().
                
                Ejemplo de llamada a un método:
                
                Persona.saludar(); // Salida: “Hola, mi nombre es Juan y tengo 30 años.”
 
            """.trimIndent()
        }

        19 -> {
            """
                Acceso a propiedades dentro de un método:
                
                Dentro de un método, podemos acceder a las propiedades del objeto utilizando la palabra clave this.
                
                Ejemplo de acceso a propiedades dentro de un método:
                
                Let persona = {
                  Nombre: ‘Juan’,
                  Edad: 30,
                  Saludar: function() {
                    Console.log(`Hola, mi nombre es $\{this.nombre} y tengo $\{this.edad} años.`);
                  }
                };
                Persona.saludar(); // Salida: “Hola, mi nombre es Juan y tengo 30 años.”
 
            """.trimIndent()
        }

        20 -> {
            """
                Uso de parámetros en un método:
                
                Los métodos también pueden recibir parámetros para realizar acciones específicas.
                Ejemplo de método con parámetros:
                
                Let calculadora = {
                  Sumar: function(a, b) {
                    Return a + b;
                  },
                  Restar: function(a, b) {
                    Return a – b;
                  }
                };
                Console.log(calculadora.sumar(5, 3));  // Salida: 8
                Console.log(calculadora.restar(5, 3)); // Salida: 2

            """.trimIndent()
        }

        21 -> {
            """
                Uso de objetos como parámetros y retornos:
                Los métodos pueden recibir objetos como parámetros y también pueden retornar objetos.

                Ejemplo de método con objeto como parámetro y retorno:
                Let persona = {
                  Nombre: ‘Juan’,
                  Edad: 30,
                  Presentarse: function(info) {
                    Return `Hola, soy $\{this.nombre}. $\{info}`;
                  }
                };
                Let informacionAdicional = {
                  Ocupacion: ‘Ingeniero’,
                  Ciudad: ‘Ciudad de México’
                };
                Let mensajePresentacion = persona.presentarse(`Soy $\{informacionAdicional.ocupacion} de $\{informacionAdicional.ciudad}.`);
                Console.log(mensajePresentacion); // Salida: “Hola, soy Juan. Soy Ingeniero de Ciudad de México.”

            """.trimIndent()
        }

        else -> {
            ""
        }
    }

    return when (_currentMState.value) {
        is Module.JSM1 -> module1
        is Module.JSM2 -> module2
        is Module.JSM3 -> module3
        else -> ""
    }
}