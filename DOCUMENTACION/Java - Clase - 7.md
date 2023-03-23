## CLASES EN JAVA
    Everything in Java is associated with classes and objects, along with its attributes and methods. 
    For example: in real life, a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.

    *ATRIBUTOS: sON LAS PROPIEDADES QUE DEFINEN AL OBJETO.

    A Class is like an object constructor, or a "blueprint" for creating objects.

    Create a Class
    To create a class, use the keyword class:

    Create a class named "Main" with a variable x:

    public class Main {
    int x = 5;
    }

## OBJETOS EN JAVA
    In Java, an object is created from a class. We have already created the class named Main, so now we can use this to create objects.
    To create an object of Main, specify the class name, followed by the object name, and use the keyword new:

    *METODOS: Definen el comportamiento de un objeto.

    Example
    Create an object called "myObj" and print the value of x:

        public class Main {
        int x = 5;

        public static void main(String[] args) {
            Main myObj = new Main();
            System.out.println(myObj.x);
        }
        }

## EXPLICACION FRACCION CODIGO
    Este código es una definición de un método en lenguaje de programación Java. El método se llama "dormir" y no tiene argumentos de entrada ya que está definido con paréntesis vacíos "()" después del nombre del método.

    El modificador de acceso "public" indica que este método puede ser accedido desde cualquier lugar dentro del programa.

    La implementación del método es muy sencilla: simplemente imprime en la consola un mensaje que indica que el objeto que lo invoca está durmiendo. La variable "nombre" se asume que es una variable previamente definida en la clase que contiene este método y contiene el nombre del objeto que está durmiendo.
    
        public void dormir(){
        System.out.println(nombre+ " Esta dormida ");
    }
## BIBILIOGRAFIA
	1. [https://www.w3schools.com/java/java_classes.asp]