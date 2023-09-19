package com.jjgn.app.devlearn.data.course

import com.jjgn.app.devlearn.data.course.module.Module
import kotlinx.coroutines.flow.MutableStateFlow

// Curso Java
fun jvCourse(page: Int, _currentMState: MutableStateFlow<Module>): String {
    val module1 = when (page) {
        1 -> {
            """
                ¡Bienvenido al emocionante mundo de la programación en Java!
                En este curso aprenderás sobre la programación más popular , Java es un lenguaje muy valorado porque los programas java se pueden ejecutar en diversas plataformas con sistemas operativos como Windows, Mac OS, Linux o Solaris.

            """.trimIndent()
        }

        2 -> {
            """
                Variables
                
                Empecemos con las variables. Una variable se utiliza para almacenar valores, realizar cálculos, modificar los valores almacenados, mostrarlos por la consola, almacenarlos en disco, enviarlos por la red, etc. Una variable almacena un único valor.
                En Java, una variable se define por un nombre, un tipo y el rango de valores que puede almacenar.
                Por ejemplo, para declarar una variable en Java se indica el tipo y su nombre
                
                Int mesNacimiento;
                
                En este ejemplo se indica que la variable es de tipo entero(int) y su nombre es mesNacimiento.

                
            """.trimIndent()
        }

        3 -> {
            """
                Para almacenar un valor en una variable se utiliza el operador de asignación y a continuación se indica el valor, por ejemplo 2.
                
                mesNacimiento= 2;
                
                Apartir de ese momento la variable mesNacimiento almacena el valor 2 y cualquier referencia a ella utiliza este valor.Por ejemplo,si se imprime el valor de la variable por la consola, muestra el valor 2.

                Apartir de ese momento la variable mesNacimiento almacena el valor 2 y cualquier referencia a ella utiliza este valor.Por ejemplo,si se imprime el valor de la variable por la consola, muestra el valor 2.
                System.out.print(mesNacimiento);

            """.trimIndent()
        }

        4 -> {
            """
                Java permite declarar e inicializar una variable en una sola sentencia.
                int diaNacimiento=20;
                int mesNacimiento=3;
                En este ejemplo se declaran las variables diaNacimiento con el valor 20 y mesNacimiento con valor 3.

            """.trimIndent()
        }

        5 -> {
            """
                Si se declara una constante,entonces se debe utilizar el delimitador final y es necesario indicar su valor.En la siguiente declaración se define el valor de la constante pi de tipo double para almacenar un número real.
                
                final double PI= 3. 1415926536;
 
            """.trimIndent()
        }

        6 -> {
            """
                Tipos de datos basicos
                
                Algunos de los tipos de datos básicos en Java son:
                
                Caracteres.El tipo Char permite representar cualquier carácter Unicode.
                Booleano.Se utiliza para representar los valores lógicos verdadero y falso.
                Sólo tiene tabla resume los tipos primitivos de Java.
                Tipo y descripción
                Byte: Entero con signo
                Short: Entero con signo
                Int: Entero con signo
                Long: Entero con signo
                Float: Real de precisión simple
                Double: Real de precisión double
                Char: Carácteres Unicode
                Boolean: Valores lógicos 

            """.trimIndent()
        }

        7 -> {
            """
                Conversión de tipos
                
                Muchas veces es necesario realizar conversiones de tipos cuando se evalúa una expresión aritmética.Por ejemplo, si después de realizar el cálculo de conversión de grados Fahrenheit a centígrados se quiere almacenar el resultado en la variable de tipo entero temperatura, es necesario hacer una conversión de tipos
            """.trimIndent()
        }

        8 -> {
            """
                La fórmula en Java,utilizando las variables centígrados y Fahrenheit de tipo double. 
                
                Centígrados=((Fahrenheit -32.0) * 5.0)) / 9.0;
                
                Antes de asignar el valor resultante a la variable temperatura, que almacena un valor entero, es necesario convertir el valor de tipo double de la variable centígrados a int.
                
                int temperatura = (int) centígrados;

            """.trimIndent()
        }

        9 -> {
            """
                Operadores 
               
                En Java cada tipo puede realizar determinados operadores para realizar operaciones o cálculos.
                Números enteros.
                Al realizar una operación entre dos números enteros,el resultado siempre es un número entero con los números enteros se pueden realizar operaciones unarias,aditivas,multiplicativas,de incremento y decremento, relaciones,de igualdad y de asignación.

            """.trimIndent()
        }

        10 -> {
            """
                Números reales
                 
                Con los números reales se aplican los mismo operadores que con los números enteros. Si se realizan operaciones unarias, aditivas o multiplicativas,el resultado es un número real.Tambien se pueden aplicar los operadores relacionales para comparar dos números reales.

            """.trimIndent()
        }

        11 -> {
            """
                Booleanos
                
                Los operadores que se aplican a los valores lógicos son:negación, y lógico, o lógico.

            """.trimIndent()
        }

        12 -> {
            """
                Estructuras de control 
                
                En este programa se pueden identificar los siguientes elementos del lenguaje Java: comentarios, definiciónes de método y sentencias.
                
                Las estructuras de control fundamentales en Java son los siguientes:
                
                1. Estructura if
                La estructura if se denomina estructura de selección única porque ejecuta un bloque de sentencias solo cuando se cumple la condición del if.Si la condición es verdadera se ejecuta el bloque de sentencias.Si la condición es falsa,el flujo del programa continua en la sentencia inmediatamente posterior al if.
                
                Una sentencia if tiene la siguiente sintaxis:
                
                    if (condición)   {
                        bloque-de-sentencias
                    }

            """.trimIndent()
        }

        13 -> {
            """
                2. Estructura if else
                
                La estructura if-else se denomina de selección doble porque selecciona entre dos bloques de sentencias mutuamente excluyentes. Si se cumple la condición, se ejecuta el bloque de sentencias asociados al if.Si la condición no se cumple, entonces se ejecuta el bloque de sentencias asociado al else.

            """.trimIndent()
        }

        14 -> {
            """
                Una sentencia if-else tiene la siguiente sintaxis:
                
                     if (condición)  {
                         bloque-de-sentencias-ir
                     {
                     else  {
                          bloque-de-sentencias-else
                     }

            """.trimIndent()
        }

        15 -> {
            """
                3. Estructura if else if
                
                La estructura if-else-if se puede aplicar en los mismo casos en que se utiliza un if-else anidado. Esta estructura permite escribir de forma abreviada las condiciones de un if-else anidado.
                Una sentencia if-else-if tiene la siguiente sintaxis:
                
                if (condición-1) {
                    bloque-de-sentencias-condicion-1-1
                } else if (condición-2) {
                   bloque-de-sentencias-condicion-2-2
                } else  {
                     bloque-de-sentencias-else
                }

            """.trimIndent()
        }

        16 -> {
            """
                4. Estructura switch 
                
                La estructura switch es una estructura de selección múltiple que permite seleccionar un bloque de sentencias entre varios casos. En cierto modo, es parecido a una estructura de if-else anidados. La diferencia está en que la selección del bloque de sentencias depende de la evaluación de una expresión que se compara por igualdad con cada uno de los casos. La estructura switch consta de una expresión y una serie de etiquetas case y una opción default.La sentencia break indica el final de la ejecución del switch.
                
                Una sentencia switch tiene la siguiente sintaxis:
                
                switch (expresión) {
                    case valor-1:
                        bloque-de-sentencias-1;
                        break;
                    case valor-2:
                        bloque-de-sentencias-2;
                        break;
                    case valor-3:
                        bloque-de-sentencias-3;
                        break;
                    case valor-4:
                        bloque-de-sentencias-4;
                        break;
                    case valor-5:
                        bloque-de-sentencias-5;
                            break;
                    default: 
                        bloque-de-sentencias-default;
                        break;
                }
                
                Estos son algunas de las estructuras de control básicas en Java. 
            """.trimIndent()
        }

        else -> {
            ""
        }
    }
    val module2 = when (page) {
        1 -> {
            """
                Introducción a Listas:
                
                Qué son las listas (ArrayList): Las listas en Java son una estructura de datos que nos permite almacenar y manipular una colección ordenada de elementos. Se basan en la clase ArrayList del paquete java.util.

            """.trimIndent()
        }

        2 -> {
            """
                Ventajas de usar listas para almacenar datos: 
                
                Las listas ofrecen varias ventajas, como la capacidad de redimensionarse dinámicamente, lo que significa que pueden crecer o reducirse según la cantidad de elementos que contienen. Además, proporcionan métodos y operaciones que facilitan la gestión de los elementos.
            """.trimIndent()
        }

        3 -> {
            """
                import java.util.ArrayList;

                public class ListExample {
                    public static void main(String[] args) {
                        // Crear una lista de números enteros
                        ArrayList<Integer> numeros = new ArrayList<>();

                        // Agregar elementos a la lista
                        numeros.add(10);
                        numeros.add(20);
                        numeros.add(30);

                        // Acceder a elementos por índice

                        int segundoElemento = numeros.get(1);
                        System.out.println("Segundo elemento: " + segundoElemento);
                    }
                }

            """.trimIndent()
        }

        4 -> {
            """
                Declaración y creación de listas:
                
                Importancia de especificar el tipo de elementos: Al declarar una lista, debemos indicar el tipo de elementos que contendrá entre los corchetes angulares (<>). Por ejemplo, ArrayList<String> crea una lista que almacena objetos de tipo String.
                Inicialización de una lista vacía y con elementos: Podemos inicializar una lista vacía simplemente creándola con el operador new, o podemos crear una lista ya con elementos usando Arrays.asList() o agregando elementos individualmente con add().

            """.trimIndent()
        }

        5 -> {
            """
                Ejemplo:
                
                import java.util.ArrayList;
                import java.util.Arrays;
                
                public class InitializationExample {
                    public static void main(String[] args) {
                        // Crear una lista vacía de cadenas
                        ArrayList<String> nombres = new ArrayList<>();
                        // Crear una lista con elementos usando Arrays.asList()
                        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3));
                        // Agregar elementos individualmente
                        nombres.add("Juan");
                        nombres.add("María");
                    }

                }

            """.trimIndent()
        }

        6 -> {
            """
                Operaciones básicas con listas:
                
                Agregar elementos: add(): Para añadir elementos a una lista, usamos el método add(elemento) de la clase ArrayList. Podemos agregar elementos al final de la lista.
                Acceder a elementos por índice: get(): Para obtener un elemento específico de la lista, utilizamos get(indice), donde indice representa la posición del elemento que queremos recuperar.

            """.trimIndent()
        }

        7 -> {
            """
                Modificar elementos: set(): Para cambiar el valor de un elemento en la lista, empleamos set(indice, nuevoElemento).
                Eliminar elementos: remove(): Podemos eliminar elementos de la lista usando remove(indice) para eliminar por posición o remove(elemento) para eliminar por valor.
                
                Ejemplo:
                
                import java.util.ArrayList;
                
                public class OperationsExample {
                    public static void main(String[] args) {
                        ArrayList<String> colores = new ArrayList<>();
                        // Agregar elementos a la lista
                        colores.add("Rojo");
                        colores.add("Verde");
                        colores.add("Azul");
                        // Acceder a elementos por índice
                        String primerColor = colores.get(0);
                        System.out.println("Primer color: " + primerColor);
                        // Modificar elementos
                        colores.set(1, "Amarillo");
                        // Eliminar elemento por índice
                        colores.remove(2);

                        System.out.println("Lista después de eliminar: " + colores);
                    }
                }

            """.trimIndent()
        }

        8 -> {
            """
                Recorrido de listas:
                
                Uso de bucles for-each: Para recorrer los elementos de una lista, podemos emplear el bucle for-each, también conocido como bucle mejorado, que simplifica el proceso.
                Iteradores para recorrer y eliminar elementos: Los iteradores son objetos que permiten recorrer una lista y realizar operaciones como agregar o eliminar elementos de manera segura durante el recorrido.

            """.trimIndent()
        }

        else -> {
            ""
        }
    }
    val module3 = when (page) {
        1 -> {
            """
                Clases
                
                Una clase es una plantilla que define la estructura y el comportamiento de los objetos. Los objetos son instancias de una clase. Por ejemplo, si tienes una clase llamada "Coche", cada coche real sería un objeto de esa clase.
                
                // Ejemplo de una clase "Coche"
                class Coche {
                    String marca;
                    String modelo;
                    int año;

                    void acelerar() {
                        System.out.println("El coche está acelerando.");
                    }
                }
            """.trimIndent()
        }

        2 -> {
            """
                Objetos: 
                
                Son las instancias creadas a partir de una clase. Los objetos tienen sus propios atributos y comportamientos definidos por la clase.
                
                // Crear un objeto "coche1" de la clase "Coche"
                Coche coche1 = new Coche();

                coche1.marca = "Toyota";
                coche1.modelo = "Corolla";
                coche1.año = 2022;

                coche1.acelerar(); // Salida: "El coche está acelerando."
            """.trimIndent()
        }

        3 -> {
            """
                Encapsulación: 
                
                Es el mecanismo que permite ocultar los detalles internos de una clase y exponer solo la interfaz necesaria para interactuar con ella.
                
                class CuentaBancaria {
                    private double saldo;

                    public double getSaldo() {
                        return saldo;
                    }

                    public void depositar(double cantidad) {
                        saldo += cantidad;
                    }

                    public void retirar(double cantidad) {
                        if (cantidad <= saldo) {
                            saldo -= cantidad;
                        } else {
                            System.out.println("Saldo insuficiente.");
                        }
                    }
                }
            """.trimIndent()
        }

        4 -> {
            """
               Herencia: Es un concepto que permite crear una nueva clase (subclase) basada en una clase existente (superclase), heredando sus atributos y métodos.
                
                // Superclase
                class Animal {
                    void hacerSonido() {
                        System.out.println("Haciendo un sonido...");
                    }
                }

                // Subclase
                class Perro extends Animal {
                    void hacerSonido() {
                        System.out.println("El perro ladra.");
                    }
                } 
            """.trimIndent()
        }

        5 -> {
            """
                Polimorfismo: 
                
                Es la capacidad de un objeto para tomar diferentes formas y comportarse de manera distinta según el contexto.
                
                Animal miAnimal = new Animal();
                miAnimal.hacerSonido(); // Salida: "Haciendo un sonido..."

                Animal miPerro = new Perro();
                miPerro.hacerSonido(); // Salida: "El perro ladra."

            """.trimIndent()
        }

        6 -> {
            """
                Abstracción: 
                
                Es el proceso de identificar las características esenciales de un objeto y definir solo los detalles relevantes para el problema que estamos resolviendo.
                La POO ofrece una poderosa forma de modelar el mundo real en programas, permitiendo una mayor organización, reutilización de código y facilitando el desarrollo de aplicaciones más mantenibles y escalables.
                  
                // Ejemplo de una clase "Coche"
                class Coche {
                    String marca;
                    String modelo;
                    int año;

                        void acelerar() {
                                System.out.println("El coche está acelerando.");
                        }
                } 
            """.trimIndent()
        }

        7 -> {
            """
               Interfaz
               
               En Java, una interfaz es una colección de métodos abstractos (sin implementación) y constantes que proporcionan una forma de definir un contrato que una clase debe cumplir. Una clase puede implementar múltiples interfaces, lo que permite lograr una mayor flexibilidad y un enfoque basado en la composición en lugar de la herencia. Aquí tienes un ejemplo para ilustrar cómo se utilizan las interfaces en Java:
               Supongamos que queremos modelar diferentes tipos de formas geométricas, como círculos y rectángulos. Para eso, podemos definir una interfaz llamada "Forma" con algunos métodos abstractos que todas las formas deben implementar:
               
               // Definición de la interfaz "Forma"
               interface Forma {
                   double calcularArea();
                   double calcularPerimetro();
               }
               Luego, podemos implementar esta interfaz en las clases para cada tipo de forma:
               // Clase "Circulo" implementando la interfaz "Forma"
               class Circulo implements Forma {
                   private double radio;

                   public Circulo(double radio) {
                       this.radio = radio;
                   }

                   public double calcularArea() {
                       return Math.PI * radio * radio;
                   }

                   public double calcularPerimetro() {
                       return 2 * Math.PI * radio;
                   }
               }
               
               // Clase "Rectangulo" implementando la interfaz "Forma"
               class Rectangulo implements Forma {
                   private double lado1;
                   private double lado2;

                   public Rectangulo(double lado1, double lado2) {
                       this.lado1 = lado1;
                       this.lado2 = lado2;
                   }

                   public double calcularArea() {
                       return lado1 * lado2;
                   }

                   public double calcularPerimetro() {
                       return 2 * (lado1 + lado2);
                   }
               }
            """.trimIndent()
        }

        8 -> {
            """
                Ahora podemos crear objetos de diferentes formas y tratarlos como objetos de tipo "Forma", lo que nos brinda flexibilidad en nuestro diseño:

                public static void main(String[] args) {
                    Forma forma1 = new Circulo(5);
                    Forma forma2 = new Rectangulo(4, 6);

                    System.out.println("Área de forma1: " + forma1.calcularArea());
                    System.out.println("Perímetro de forma1: " + forma1.calcularPerimetro());

                    System.out.println("Área de forma2: " + forma2.calcularArea());
                    System.out.println("Perímetro de forma2: " + forma2.calcularPerimetro());
                }
                
                La implementación de la interfaz "Forma" en las clases "Circulo" y "Rectangulo" permite que podamos tratar ambos objetos como objetos de tipo "Forma". Esto hace que nuestro código sea más flexible, ya que podemos agregar fácilmente nuevas formas en el futuro simplemente implementando la interfaz "Forma" en una nueva clase sin afectar el resto del código.
            """.trimIndent()
        }

        9 -> {
            """
                Manejo de excepciones en POO:
                
                El manejo de excepciones en POO es similar al manejo en cualquier otro contexto. Cuando una excepción ocurre en un método, puede ser capturada y gestionada utilizando bloques try-catch. Si no se maneja la excepción en el método donde ocurrió, la excepción puede propagarse hacia arriba en la pila de llamadas hasta que se capture o se maneje adecuadamente.
                
                class Calculadora {
                    int dividir(int dividendo, int divisor) {
                        if (divisor == 0) {
                            throw new ArithmeticException("División por cero no permitida.");
                        }
                        return dividendo / divisor;
                    }
                }

                public static void main(String[] args) {
                    Calculadora Thurow = new Calculadora();
                    try {
                        int resultado = z(10, 0);
                        System.out.println("Resultado: " + resultado);
                    } catch (ArithmeticException e) {
                        System.out.println("Excepción capturada: " + e.getMessage());
                    }
                }
            """.trimIndent()
        }

        else -> {
            ""
        }
    }

    return when (_currentMState.value) {
        is Module.JVM1 -> module1
        is Module.JVM2 -> module2
        is Module.JVM3 -> module3
        else -> ""
    }
}