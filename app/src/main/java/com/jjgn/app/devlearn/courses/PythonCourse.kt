package com.jjgn.app.devlearn.courses

import androidx.lifecycle.MutableLiveData
import com.jjgn.app.devlearn.states.Module

// Curso Python
fun pyCourse(page: Int, _currentMState: MutableLiveData<Module>): String {
    val module1 = when (page) {
        1 -> {
            """
                Python es un lenguaje de programación interpretado, de alto nivel, y generalmente considerado como un lenguaje fácil de aprender y utilizar. Fue creado por Guido van Rossum y lanzado por primera vez en 1991. Desde entonces, ha ganado una gran popularidad en la comunidad de desarrollo debido a su sintaxis simple y legible, lo que lo convierte en una excelente opción tanto para principiantes como para programadores experimentados.
            """.trimIndent()
        }

        2 -> {
            """
                1. Variables
                
                Las variables son contenedores en los que puedes almacenar y manipular datos en Python. Puedes pensar en ellas como etiquetas que se les asignan a valores para referenciarlos más adelante. 
                
                Por ejemplo:
                
                nombre = "Juan"
                edad = 25
                
                Puedes imprimir estos valores usando print()
                
                print("Mi nombre es ", nombre)
                print("Tengo ", edad, "años")

            """.trimIndent()
        }
        3 -> {
            """
                Tipos de datos
                
                Números:
                - int: Enteros (por ejemplo, 1, 100, -10).
                - float: Punto flotante o número decimal (por ejemplo, 3.14, -0.5, 2.0).
                
                Booleanos:
                - bool: Representa los valores de verdad Verdadero (True) o Falso (False).
                
                Cadenas de texto:
                - str: Secuencia de caracteres (por ejemplo, "Hola, mundo!", 'Python es genial').
                
                Listas:
                - list: Colección ordenada y modificable de elementos (por ejemplo, [1, 2, 3], ['a', 'b', 'c']).
                
            """.trimIndent()
        }
        4 -> {
            """
                Tuplas:
                - tuple: Colección ordenada e inmutable de elementos (por ejemplo, (1, 2, 3), ('x', 'y', 'z')).
                
                Conjuntos:
                - set: Colección desordenada y no duplicada de elementos (por ejemplo, {1, 2, 3}, {'a', 'b', 'c'}).
                
                Diccionarios:
                - dict: Colección de pares clave-valor (por ejemplo, {'nombre': 'Juan', 'edad': 30}).
                
                NoneType:
                - None: Tipo especial que representa la ausencia de valor.
            """.trimIndent()
        }
        5 -> {
            """
                Estos son los tipos de datos básicos en Python. Es importante entenderlos para poder trabajar de manera efectiva con el lenguaje y manipular la información de manera adecuada. Cada tipo de dato tiene sus propias características y métodos asociados que te permiten realizar operaciones específicas con ellos.
            """.trimIndent()
        }
        6 -> {
            """
                2. Declaración de variables y reglas de nombramiento.
                
                Conversión de tipos de datos.
                
                La conversión de tipos de datos en Python te permite cambiar el tipo de una variable de un tipo a otro. Puedes realizar la conversión utilizando funciones de conversión incorporadas.
                •	Conversión a entero (int): Puedes convertir un número flotante o una cadena de dígitos en un entero utilizando la función int().
                
                Ejemplo:
                
                edad = "25"
                edad_entero = int(edad)
                print(edad_entero) # Resultado: 25

            """.trimIndent()
        }
        7 -> {
            """
                Conversión a cadena de texto (str): Puedes convertir un entero, un número flotante u otro tipo de dato en una cadena de texto utilizando la función str().
                
                Ejemplo:
                
                edad = 25
                edad_cadena = str(edad)
                print("Tengo " + edad_cadena + " años") # Resultado: Tengo 25 años
                
            """.trimIndent()
        }
        8 -> {
            """
                3. Operadores
                
                Operadores aritméticos: 
                •	Suma(+): Realiza la adición de dos valores.
                •	Resta(-): Realiza la resta de dos valores.
                •	Multiplicación(-): Realiza la multiplicación de dos valores.
                •	División(/): Realiza la división de dos valores. El resultado siempre es un número flotante.
                •	Módulo(%): Devuelve el resto de la división entre dos valores.
                •	Potencia(**): Calcula la potencia de un valor elevado a otro valor.

            """.trimIndent()
        }
        9 -> {
            """
                Operadores de asignación.
                Los operadores de asignación en Python se utilizan para asignar valores a variables.
                •	Asignación (=): Asigna el valor de la derecha a la variable de la izquierda.
                •	Asignación con suma (+=): Suma el valor de la derecha al valor actual de la variable y asigna el resultado a la variable.
                •	Asignación con resta (-=): Resta el valor de la derecha al valor actual de la variable y asigna el resultado a la variable.
                •	Asignación con multiplicación (*=): Multiplica el valor de la derecha por el valor actual de la variable y asigna el resultado a la variable.
                •	Asignación con división (/=): Divide el valor actual de la variable por el valor de la derecha y asigna el resultado a la variable.
                •	Asignación con división entera (//=): Realiza la división entera del valor actual de la variable entre el valor de la derecha y asigna el resultado a la variable.
                •	Asignación con módulo (%=): Calcula el resto de la división del valor actual de la variable entre el valor de la derecha y asigna el resultado a la variable.

            """.trimIndent()
        }

        10 -> {
            """
                Operadores de comparación.
                Los operadores de comparación en Python te permiten comparar dos valores y obtener un resultado de verdadero (True) o falso (False) según la relación entre ellos.
                •	Igualdad (==): Comprueba si dos valores son iguales.
                •	Desigualdad (!=): Comprueba si dos valores son diferentes.
                •	Mayor que (>): Comprueba si un valor es mayor que otro.
                •	Mayor o igual que (>=): Comprueba si un valor es mayor o igual que otro.
                •	Menor que (<): Comprueba si un valor es menor que otro.
                •	Menor o igual que (<=): Comprueba si un valor es menor o igual que otro.

            """.trimIndent()
        }
        11 -> {
            """
                Operadores lógicos.
                Los operadores lógicos en Python te permiten combinar expresiones y evaluar condiciones complejas.
                •	Y lógico (and): Devuelve True si ambas condiciones son verdaderas, de lo contrario, devuelve False.
                •	lógico (or): Devuelve True si al menos una de las condiciones es verdadera, de lo contrario, devuelve False.
                •	Negación lógica (not): Invierte el valor de la condición. Si la condición es verdadera, devuelve False; si es falsa, devuelve True.
            """.trimIndent()
        }
        12 -> {
            """
                4. Estructuras de control:
                
                Condicionales
                Las estructuras condicionales te permiten tomar decisiones en tu programa basadas en condiciones. En Python, se utilizan principalmente con la instrucción if, y opcionalmente con else y elif (else if).
                
                •	Instrucción if y else: Permite ejecutar un bloque de código si se cumple una condición, y otro bloque de código si la condición no se cumple.
                
                Ejemplo:
                
                temperatura = 25
                
                if temperatura > 30:
                    print("Hace calor")
                else:
                    print("No hace tanto calor")

            """.trimIndent()
        }
        13 -> {
            """
                •	Instrucción if, elif, y else: Permite evaluar varias condiciones de forma secuencial. Si una condición se cumple, se ejecuta el bloque de código correspondiente y se sale del condicional.
                
                Ejemplo:
                
                if temperatura > 40:
                    print("Hace mucho calor")
                elif temperatura < 40 and temperatura > 30:
                    print("Hace calor")
                else:
                    print("No hace mucho calor")

            """.trimIndent()
        }
        14 -> {
            """
                Bucles: while y for.
                
                Los bucles son estructuras que te permiten repetir bloques de código varias veces. En Python, los bucles más comunes son el bucle for y el bucle while.
                
                •	Bucle for: El bucle for se utiliza para recorrer una secuencia (como una lista, tupla o cadena) y ejecutar un bloque de código para cada elemento de la secuencia.
                
                Ejemplo:
                
                numeros = [1, 2, 3, 4, 5]
                for numero in numeros:
                    print(numero)

            """.trimIndent()
        }
        15 -> {
            """
                •	Bucle while: El bucle while se repite mientras una condición sea verdadera. Es importante asegurarte de que la condición cambie en algún momento para evitar un bucle infinito.
                
                Ejemplo:
                
                contador = 0
                
                while contador < 5:
                    print(contador)
                    contador+=1

            """.trimIndent()
        }
        16 -> {
            """
                Instrucciones break y continue.
                
                •	Instrucción break: La instrucción break se utiliza para interrumpir un bucle de manera prematura si se cumple cierta condición. Cuando se ejecuta break, el bucle se detiene inmediatamente, y la ejecución continúa después del bucle.
                
                Ejemplo:
                
                numeros = [1, 2, 3, 4, 5]
                
                for numero in numeros:
                    if numero == 3:
                        break
                    print(numero)


            """.trimIndent()
        }
        17 -> {
            """
                •	Instrucción continue: La instrucción continue se utiliza para saltar a la siguiente iteración del bucle, omitiendo el resto del código dentro del bucle para esa iteración en particular. Cuando se encuentra continue, el bucle avanza a la siguiente iteración sin ejecutar el código que sigue a continue.
                
                Ejemplo:
                
                numeros = [1, 2, 3, 4, 5]
                
                for numero in numeros:
                    if numero == 3:
                        break
                    print(numero)

            """.trimIndent()
        }
        18 -> {
            """
                5. Excepciones:
                
                Manejo de errores y excepciones con try-except.
                En Python, los errores que ocurren durante la ejecución del programa se llaman excepciones.
                El bloque try-except te permite manejar excepciones y evitar que el programa se detenga abruptamente cuando ocurre un error.
                
                	Sintaxis de try-except:
                 try:
                    # Codigo que puede generar una excepcion
                 except TipoDeExcepcion:
                    # Codigo para manejar la excepcion

            """.trimIndent()
        }
        19 -> {
            """
                Uso de la cláusula finally.
                La cláusula finally en Python se utiliza junto con try y except para asegurarse de que un bloque de código se ejecute, independientemente de si se produjo una excepción o no.
                •	Uso de la cláusula finally:
                	La cláusula finally se coloca después de los bloques try y except.
                	El código dentro del bloque finally se ejecuta siempre, ya sea que se haya producido una excepción o no.
                	Se utiliza para liberar recursos, cerrar archivos, conexiones de red o realizar limpieza de código, sin importar si se produjo un error o no.

                •	Sintaxis:
                try:
                    # Codigo que puede generar una excepcion
                except TipoDeExcepcion:
                    # Codigo para manejar la excepcion
                finally:
                    # Codigo que se ejecuta siempre, sin importar si hay una excpecion o no
                    
            """.trimIndent()
        }

        else -> {
            ""
        }
    }
    val module2 = when (page) {
        1 -> {
            """
                1. Colecciones de datos
                
                Listas
                
                Las listas en Python son una estructura de datos que te permite almacenar una colección ordenada de elementos.
                	Creación: Puedes crear una lista utilizando corchetes [] y separando los elementos con comas.
                
                Ejemplo:
                
                numeros = [1, 2, 3]
                colores = ["rojo", "verde", "azul"]
                mixto = [1, "dos", True]

            """.trimIndent()
        }
        2 -> {
            """
                	Acceso a elementos: Puedes acceder a los elementos de una lista utilizando índices. Los índices en Python comienzan desde 0.
                
                Ejemplo:
                
                numeros = [1, 2, 3, 4, 5]
                primer_elemento = numeros[0] # Resultado: 1
                segundo_elemento = numeros[1] # Resultado: 2    
                ultimo_elemento = numeros[-1] # indice negativo accede desde el final. Resultado: 5

            """.trimIndent()
        }
        3 -> {
            """
                Tuplas:
                
                Las tuplas en Python son estructuras de datos similares a las listas, pero con algunas diferencias clave.
                
                	Características 
                1.	Las tuplas se crean utilizando paréntesis () y separando los elementos con comas.
                2.	Son inmutables, lo que significa que una vez creadas, no se pueden modificar, agregar o eliminar elementos.
                3.	Pueden contener diferentes tipos de datos.
                
                Ejemplo:
                
                numeros = (1, 2, 3)
                colores = ("rojo", "verde", "azul")
                mixto = (1, "dos", True)

            """.trimIndent()
        }
        4 -> {
            """
                	Diferencias con las listas.
                
                1.	La principal diferencia entre tuplas y listas es la inmutabilidad. Las tuplas son inmutables, mientras que las listas son mutables. Esto significa que en las tuplas no puedes cambiar sus elementos después de crearlas, pero en las listas sí puedes modificarlas, agregar nuevos elementos o eliminar elementos existentes.
                2.	Otra diferencia es la sintaxis: las tuplas se crean con paréntesis () y las listas con corchetes [].

            """.trimIndent()
        }
        5 -> {
            """
                Diccionarios:
                
                Los diccionarios en Python son una estructura de datos que te permite almacenar pares clave-valor. Cada clave en el diccionario se asocia con un valor correspondiente.
                	Características:
                1.	Los diccionarios se crean utilizando llaves {} y separando los pares clave-valor con comas.
                2.	Cada clave debe ser única dentro del diccionario.
                3.	Los valores pueden ser de diferentes tipos de datos.
                
                Ejemplo:
                
                persona = {"nombre": "Juan", "edad": 25, "ciudad": "México"}

            """.trimIndent()
        }
        6 -> {
            """
                Operaciones en diccionarios:
                
                	Acceso a valores: Puedes acceder a los valores de un diccionario utilizando la clave correspondiente.
                
                Ejemplo:
                
                nombre = persona["nombre"]
                edad = persona["edad"]
                
                	Modificación de valores: Puedes modificar el valor asociado a una clave específica.
               
                Ejemplo:
                
                persona["edad"] = 26
                	Agregar elementos: Puedes agregar nuevos pares clave-valor al diccionario.
                
                Ejemplo:
                
                persona["ocupacion"] = "Estudiante"

            """.trimIndent()
        }
        7 -> {
            """
                 	Eliminar elementos: Puedes eliminar un par clave-valor utilizando la instrucción del.
                   
                   Ejemplo:
                    del persona["ciudad"]
                    
                	Comprobar la existencia de una clave: Puedes verificar si una clave específica existe en el diccionario utilizando la palabra clave in.
                   
                   Ejemplo:
                   
                if "edad" in persona:
                    print("La clave 'edad' existe en el diccionario.")
                    
            """.trimIndent()
        }
        8 -> {
            """
                2. Funciones
                
                	Definición de funciones:
                En Python, una función es un bloque de código que realiza una tarea específica y puede ser reutilizado en diferentes partes del programa. La definición de una función se realiza utilizando la palabra clave def, seguida del nombre de la función, paréntesis que pueden contener parámetros (opcionalmente), y dos puntos. El cuerpo de la función, es decir, las instrucciones que serán ejecutadas, se indentan debajo de la definición.
                
                	Sintaxis de definición de funciones:
                
                def nombre_funcion(parametro1, parametro2, ...):
                    # Cuerpo de la funcion
                    return resultado # Opcional: si la funcion necesita devolver una funcion.
                    
                Ejemplo de definicion de funcion
                
                def suma(a, b):
                    resultado = a+b
                    return resultado   

            """.trimIndent()
        }
        9 -> {
            """
                	Uso de funciones:
                Una vez que has definido una función, puedes llamarla desde otras partes del programa. Para llamar una función, simplemente escribimos su nombre seguido de paréntesis y los argumentos que requiera (si es que los tiene). Si la función devuelve un valor, podemos almacenarlo en una variable o utilizarlo directamente.
                
                	Ejemplo de uso de función:
                
                resultado_suma = suma(2, 3)
                print(resultado_suma)

            """.trimIndent()
        }
        10 -> {
            """
                Parámetros y argumentos.
                
                	Parámetros en funciones:
                Los parámetros en una función son las variables que se definen en la declaración de la función y que reciben valores cuando la función es llamada. Estos parámetros actúan como marcadores de posición para los datos que la función necesita para realizar su tarea.

                	Ejemplo - Función con un parámetro:
                
                def saludar(nombre):
                    print("Hola, ", nombre, "!")

            """.trimIndent()
        }
        11 -> {
            """
                3. Módulos y paquetes:
                Un módulo en Python es un archivo que contiene código reutilizable, como funciones, clases y variables, que puede ser utilizado en otros programas. La creación de módulos permite organizar el código de manera modular, lo que facilita su mantenimiento y reutilización en diferentes proyectos.
                Creación y uso de módulos.
                
                	Creación de un módulo:
                Para crear un módulo en Python, simplemente debes escribir el código que deseas incluir en el archivo y guardarlo con la extensión ".py". Cada función o clase definida en el archivo será accesible desde otros programas una vez que importemos el módulo.
                Por ejemplo, crea un archivo llamado "mi_modulo.py" con el siguiente contenido:
                
                def saludar(nombre):
                    print("Hola, ", nombre, "!")    

            """.trimIndent()
        }
        12 -> {
            """
                	Uso de un módulo:
                Para utilizar un módulo en otro programa, necesitamos importarlo. Python proporciona la instrucción import para esto. Una vez que hemos importado el módulo, podemos acceder a sus funciones y variables utilizando la notación de punto.
                Por ejemplo, crea un archivo llamado "main.py" con el siguiente contenido:
                
                # main.py

                import mi_modulo

                # Llamamos a la función saludar() del módulo
                mi_modulo.saludar("Juan")  # Resultado: Hola, Juan!

            """.trimIndent()
        }
        13 -> {
            """
                Al ejecutar el archivo "main.py", importamos el módulo "mi_modulo" que creamos previamente. Luego, podemos utilizar su funcion saludar() como si estuviera definida en el mismo archivo.
                Es importante asegurarse de que el archivo del módulo se encuentre en el mismo directorio que el programa que lo está utilizando o en un directorio que Python pueda encontrar en su ruta de búsqueda.

            """.trimIndent()
        }
        14 -> {
            """
                Organización de código en paquetes.
                
                La organización de código en paquetes es una práctica común en Python para estructurar y agrupar módulos relacionados en directorios. Los paquetes son útiles cuando tu proyecto se vuelve más grande y complejo, ya que te permiten mantener tu código ordenado y modular.
                Uso de paquetes y módulos:
                Para acceder a los módulos dentro de un paquete, puedes utilizar la instrucción import. Utiliza la notación de puntos para acceder a los módulos o subpaquetes dentro del paquete.
                
                Ejemplo:
                # En un archivo llamado "main.py"

                # Importamos el módulo "operaciones" desde el paquete "matematicas"
                import matematicas.operaciones

                # Llamamos a la función suma() del módulo "operaciones"
                resultado = matematicas.operaciones.suma(3, 5)
                print(resultado)  # Resultado: 8

                # Importamos la clase "Cuadrado" desde el subpaquete "formas" del paquete "matematicas"
                from matematicas.formas.cuadrado import Cuadrado

                # Creamos una instancia de la clase "Cuadrado" y calculamos su área
                cuadrado = Cuadrado(4)
                area = cuadrado.calcular_area()
                print(area)  # Resultado: 16

                En este ejemplo, hemos importado y utilizado el módulo "operaciones" y la clase "Cuadrado" desde el paquete "matematicas" y su subpaquete "formas", respectivamente.

            """.trimIndent()
        }
        15 -> {
            """
                4. Programación funcional:
                
                La programación funcional es un paradigma de programación que se basa en el concepto de funciones matemáticas puras y evita el cambio de estado y los datos mutables. En la programación funcional, se enfatiza en el uso de funciones como bloques de construcción fundamentales para resolver problemas.
                
                Conceptos básicos de programación funcional.

                •	Funciones como ciudadanos de primera clase: En la programación funcional, las funciones son tratadas como ciudadanos de primera clase, lo que significa que pueden ser pasadas como argumentos a otras funciones, retornadas como valores de otras funciones y almacenadas en variables.
                •	Funciones puras: Las funciones puras son aquellas que, dado el mismo conjunto de argumentos, siempre devuelven el mismo resultado y no tienen efectos secundarios en el estado del programa o en datos externos. No modifican variables globales ni tienen dependencias de estado externo.
                •	Evitar datos mutables: En lugar de cambiar datos existentes, la programación funcional enfatiza en la creación de nuevas estructuras de datos inmutables en cada operación.

            """.trimIndent()
        }
        16 -> {
            """
                Funciones lambda.
                
                Las funciones lambda en Python son funciones anónimas que se pueden definir en una sola línea. Son especialmente útiles cuando necesitas funciones pequeñas y sencillas que se usarán de forma inmediata y no requieren un nombre formal.
                •	Sintaxis de funciones lambda:
                lambda argumentos: expresión

            """.trimIndent()
        }

        else -> {
            ""
        }
    }
    val module3 = when (page) {
        1 -> {
            """
                1. Clases y Objetos:
                
                Definición de clases y objetos.
                •	Definición de Clases:
                Una clase es una plantilla o un plano que define la estructura y el comportamiento de un tipo de objeto en particular. Es una entidad abstracta que describe las características y acciones que tendrán los objetos que se creen a partir de ella. En otras palabras, una clase define qué atributos (datos) tendrá un objeto y qué métodos (funciones) podrá realizar.
                La sintaxis para definir una clase en Python es la siguiente:
                
                class NombreDeLaClase:
                    def __init__(self, parametros):
                        # Inicializacion de atributos
                        
                    def metodo1(self, parametros):
                        # Codigo del metodo 1

            """.trimIndent()
        }
        2 -> {
            """
                •	Definición de Objetos:
                
                Un objeto es una instancia o ejemplar específico de una clase. Se crea a partir de la plantilla proporcionada por la clase y representa una entidad real o conceptual en el programa. Cada objeto tiene sus propios valores de atributos y puede realizar las acciones definidas en la clase a través de sus métodos.
                Para crear un objeto a partir de una clase en Python, utilizamos la sintaxis de llamada a la clase como si fuera una función:
                
                # Creacion de un objeto a partir de una clase
                objeto = NombreDeLaClase(parametros)

            """.trimIndent()
        }
        3 -> {
            """
                Atributos y métodos de clase.
                
                •	Atributos de Clase:
                Los atributos de clase son variables que pertenecen a la clase en sí y no a las instancias u objetos creados a partir de ella. Esto significa que todos los objetos de esa clase comparten el mismo valor para el atributo de clase. Los atributos de clase se definen fuera de cualquier método de la clase y son accesibles mediante el nombre de la clase.
                
                Ejemplo de Atributo de Clase:
                class MiClase:
                    atributo_clase = 0

                    def __init__(self, valor):
                        self.valor = valor

                objeto1 = MiClase(10)
                objeto2 = MiClase(20)

                print(objeto1.valor)  # Resultado: 10
                print(objeto2.valor)  # Resultado: 20

                print(objeto1.atributo_clase)  # Resultado: 0
                print(objeto2.atributo_clase)  # Resultado: 0

                # Modificando el atributo de clase
                MiClase.atributo_clase = 100

                print(objeto1.atributo_clase)  # Resultado: 100
                print(objeto2.atributo_clase)  # Resultado: 100

                En este ejemplo, tenemos una clase llamada "MiClase" con un atributo de clase llamado "atributo_clase" y un atributo de instancia llamado "valor". Cuando creamos dos objetos "objeto1" y "objeto2" a partir de la clase, cada uno tiene su propio valor para el atributo de instancia "valor", pero ambos comparten el mismo valor para el atributo de clase "atributo_clase".

                
            """.trimIndent()
        }
        4 -> {
            """
                •	Métodos de Clase:
                
                Los métodos de clase son funciones que pertenecen a la clase en sí y no a las instancias u objetos creados a partir de ella. Estos métodos son definidos utilizando el decorador @classmethod antes de la declaración del método. Los métodos de clase toman como primer parámetro cls, que hace referencia a la propia clase.
                
                Ejemplo de Método de Clase:
                class MiClase:
                    atributo_clase = 0

                    def __init__(self, valor):
                        self.valor = valor

                    @classmethod
                    def metodo_clase(cls, x):
                        return cls.atributo_clase + x
                        
                objeto1 = MiClase(10)
                objeto2 = MiClase(20)

                print(objeto1.metodo_clase(5))  # Resultado: 5
                print(objeto2.metodo_clase(10))  # Resultado: 10

                # Modificando el atributo de clase a través del método de clase
                MiClase.atributo_clase = 100

                print(objeto1.metodo_clase(5))  # Resultado: 105
                print(objeto2.metodo_clase(10))  # Resultado: 110
                
                En este ejemplo, definimos un método de clase llamado "metodo_clase" que toma un parámetro x y devuelve la suma del atributo de clase "atributo_clase" con x. Como el método de clase puede acceder a los atributos de clase, podemos modificar el atributo de clase mediante el método de clase y esta modificación se reflejará en todas las instancias de la clase.
                
            """.trimIndent()
        }
        5 -> {
            """
                Creación de instancias de objetos.
                
                Pasos para crear instancias de objetos:
                •	Definir la clase: Primero, debes definir una clase en Python. Una clase se crea utilizando la palabra clave class, seguida del nombre de la clase y dos puntos. Dentro de la clase, se definen los atributos y métodos que tendrán los objetos creados a partir de ella.
                •	Inicializar el objeto: Al crear una instancia de la clase, se llama automáticamente al método especial __init__, que actúa como el constructor de la clase. El constructor se encarga de inicializar los atributos del objeto con los valores proporcionados durante la creación.
                •	Crear la instancia: Una vez que se ha definido la clase y se ha inicializado el objeto, puedes crear una instancia u objeto de la clase utilizando la sintaxis de llamada a la clase como si fuera una función. Los argumentos pasados durante la llamada a la clase se pasarán al constructor __init__ para inicializar los atributos del objeto.

            """.trimIndent()
        }
        6 -> {
            """
                2. Encapsulación y Modificadores de Acceso:
                
                Niveles de encapsulación (público, privado, protegido).
                En la programación orientada a objetos, los niveles de encapsulación se refieren a la visibilidad y acceso de los atributos y métodos de una clase desde fuera de la misma. Los niveles de encapsulación son una parte importante del concepto de encapsulación, que es el principio de ocultar la implementación interna de una clase y exponer solo las interfaces necesarias para interactuar con ella.
                •	Público (public): Los atributos y métodos públicos son accesibles desde cualquier parte del programa, tanto desde dentro de la clase como desde fuera de ella. En Python, por defecto, todos los atributos y métodos son públicos, a menos que se indique lo contrario.
                •	Privado (private): Los atributos y métodos privados solo son accesibles desde dentro de la clase en la que se definen. Para indicar que un atributo o método es privado, se utiliza un doble guion bajo (__) al principio del nombre.
                •	Protegido (protected): Los atributos y métodos protegidos son similares a los privados, pero también pueden ser accesibles desde las clases hijas o subclases. Para indicar que un atributo o método es protegido, se utiliza un solo guion bajo (_) al principio del nombre.

            """.trimIndent()
        }
        7 -> {
            """
                3. Herencia:
                
                Creación de clases derivadas (subclases).
                En la programación orientada a objetos, la creación de clases derivadas (también conocidas como subclases o clases hijas) es una poderosa característica que permite extender y especializar una clase base (también conocida como clase padre). Las clases derivadas heredan atributos y métodos de la clase padre y pueden agregar nuevos atributos y métodos propios o modificar los heredados.
                •	Sintaxis para crear una clase derivada:
                
                La sintaxis para crear una clase derivada en Python es la siguiente:
                
                class ClasePadre:
                    # Metodos de la clase
                
                class ClaseDerivada(ClasePadre):
                    # Metodos adicionales de la clase derivada
                
            """.trimIndent()
        }
        8 -> {
            """
                Herencia simple y múltiple.
                
                La herencia en programación orientada a objetos permite crear relaciones entre clases, donde una clase derivada (subclase) puede heredar atributos y métodos de una clase base (superclase). Existen dos tipos principales de herencia: herencia simple y herencia múltiple.
                •	Herencia Simple:
                La herencia simple es cuando una clase derivada hereda de una única clase base (superclase). En este caso, la clase derivada puede acceder a los atributos y métodos de la clase base y también puede agregar sus propios atributos y métodos. La herencia simple es comúnmente utilizada y es compatible con la mayoría de los lenguajes de programación orientados a objetos.

            """.trimIndent()
        }
        9 -> {
            """
                •	Herencia Múltiple:
                
                La herencia múltiple es cuando una clase derivada hereda de más de una clase base (superclases). Esto permite que la clase derivada obtenga atributos y métodos de múltiples fuentes. Aunque la herencia múltiple puede ser muy útil en algunos casos, también puede complicar la jerarquía de clases y aumentar la complejidad del código.

            """.trimIndent()
        }
        10 -> {
            """
                Métodos y atributos heredados.
                
                Cuando una clase derivada (subclase) hereda de una clase base (superclase), adquiere automáticamente todos los atributos y métodos de la clase base. Estos atributos y métodos heredados pueden ser utilizados directamente por la clase derivada, lo que permite reutilizar el código y extender la funcionalidad.
                
                •	Métodos Heredados:
                Los métodos heredados son aquellos métodos que se definen en la clase base y se pueden utilizar directamente desde la clase derivada sin necesidad de volver a implementarlos. Esto incluye tanto los métodos concretos (con código definido) como los métodos abstractos (sin código definido, solo la firma).

            """.trimIndent()
        }
        11 -> {
            """
                •	Atributos Heredados:
                Los atributos heredados son aquellos atributos que se definen en la clase base y se pueden utilizar directamente desde la clase derivada sin necesidad de volver a definirlos. Estos atributos son accesibles en la clase derivada como si fueran atributos propios.

            """.trimIndent()
        }
        12 -> {
            """
                Sobreescritura de métodos.
                
                La sobreescritura de métodos es una característica clave en la programación orientada a objetos que permite a una clase derivada (subclase) redefinir un método heredado de su clase base (superclase). Esto significa que la clase derivada proporciona una nueva implementación para el método que anula la implementación original de la clase base. La sobreescritura de métodos permite personalizar el comportamiento de los métodos heredados y adaptarlos a las necesidades específicas de la clase derivada.
                
                •	Sintaxis para sobreescritura de métodos:
                
                class ClasePadre:
                    def metodo(self):
                    # Implementacion del metodo en la clase base
                
                class ClaseDerivada(ClasePadre):
                    def metodo(self):
                    # Nueva implementacion del metodo en la clase derivada
                    
                •	ClaseBase: Es la clase de la cual se va a heredar el método que se desea sobre-escribir.
                •	ClaseDerivada: Es la nueva clase que hereda de la clase base y redefinirá el método.

                
            """.trimIndent()
        }
        13 -> {
            """
                4. Polimorfismo:
                
                Uso de polimorfismo para manejar objetos de diferentes clases de manera uniforme.
                El polimorfismo es un concepto importante en la programación orientada a objetos que permite que objetos de diferentes clases sean tratados de manera uniforme, es decir, que puedan ser manipulados a través de una interfaz común. Esto significa que, aunque los objetos pueden tener comportamientos distintos debido a que pertenecen a diferentes clases, pueden ser utilizados de manera similar y coexistir en una colección o estructura de datos compartida.
                El polimorfismo se basa en dos características clave de la programación orientada a objetos: herencia y sobreescritura de métodos. Gracias a la herencia, las clases pueden compartir una jerarquía común, lo que permite tratar objetos de clases derivadas como si fueran objetos de la clase base. Por otro lado, gracias a la sobreescritura de métodos, las clases derivadas pueden proporcionar implementaciones específicas para los métodos heredados, lo que permite que el comportamiento de un método sea diferente en cada clase, pero siempre siguiendo la misma interfaz.

            """.trimIndent()
        }
        14 -> {
            """
                •	Interfaces:
                
                Una interfaz en programación orientada a objetos es una colección de métodos abstractos, es decir, métodos que no tienen una implementación definida en la interfaz. Una interfaz define un conjunto de operaciones que una clase debe implementar para cumplir con el contrato de la interfaz. En Python, las interfaces se definen utilizando clases que solo contienen métodos abstractos y no tienen atributos ni implementaciones de métodos.
                Para utilizar una interfaz, una clase debe implementar todos los métodos abstractos definidos en la interfaz. Esto garantiza que la clase proporcionará las operaciones requeridas por la interfaz.
                
                Ejemplo de Interfaz en Python:
                
                from abc import ABC, abstractmethod

                class Figura(ABC):
                    @abstractmethod
                    def calcular_area(self):
                        pass

                class Cuadrado(Figura):
                    def __init__(self, lado):
                        self.lado = lado

                    def calcular_area(self):
                        return self.lado ** 2

                cuadrado = Cuadrado(5)
                print("Área del cuadrado:", cuadrado.calcular_area())  # Resultado: Área del cuadrado: 25

            """.trimIndent()
        }
        15 -> {
            """
                •	Clases Abstractas:
                
                Una clase abstracta es una clase que contiene uno o más métodos abstractos y también puede contener métodos concretos y atributos. A diferencia de una interfaz, una clase abstracta se puede heredar y extender como cualquier otra clase. Sin embargo, una clase abstracta no puede ser instanciada directamente, ya que contiene métodos abstractos sin implementación.
                Para crear una clase abstracta en Python, se utiliza el módulo abc para importar la clase ABC (Abstract Base Class) y el decorador @abstractmethod para definir los métodos abstractos.
                
                Ejemplo de Clase Abstracta en Python:
                
                from abc import ABC, abstractmethod

                class Figura(ABC):
                    def __init__(self, nombre):
                        self.nombre = nombre

                    @abstractmethod
                    def calcular_area(self):
                        pass

                class Cuadrado(Figura):
                    def __init__(self, nombre, lado):
                        super().__init__(nombre)
                        self.lado = lado

                    def calcular_area(self):
                        return self.lado ** 2

                cuadrado = Cuadrado("Mi cuadrado", 5)
                print("Nombre:", cuadrado.nombre)  # Resultado: Nombre: Mi cuadrado
                print("Área del cuadrado:", cuadrado.calcular_area())  # Resultado: Área del cuadrado: 25


            """.trimIndent()
        }
        16 -> {
            """
                5. Métodos estáticos y de clase:
                
                Creación de métodos que no requieren una instancia.
                En Python, puedes crear métodos que no requieran una instancia específica (objeto) para ser llamados. Estos métodos se denominan "métodos estáticos" o "métodos de clase". La principal diferencia entre estos métodos y los métodos regulares es que los métodos estáticos no tienen acceso al objeto o a sus atributos, ya que no están vinculados a una instancia en particular. En cambio, se definen dentro de la clase y se llaman directamente desde la clase en sí, en lugar de a través de una instancia.
                Para definir un método estático en una clase, se utiliza el decorador @staticmethod justo encima del método. Esto le indica a Python que el método es estático y no debe pasar automáticamente la referencia del objeto (self) como primer argumento.
                
                •	Sintaxis para definir un método estático:
                
                class MiClase:
                    @staticmethod
                    def metodoEstatico(parametros):
                        # Codigo del metodo estatico
                        
            """.trimIndent()
        }
        else -> {
            ""
        }
    }

    return when (_currentMState.value) {
        is Module.PYM1 -> module1
        is Module.PYM2 -> module2
        is Module.PYM3 -> module3
        else -> ""
    }
}