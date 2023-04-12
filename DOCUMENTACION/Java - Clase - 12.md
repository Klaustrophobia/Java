## Interfaces
    Es un conjunto de declaraciones de metodos abstractos (Sin definicion) 
    con propiedad constantes.

    Estos metodos definen un tipo de conducta que sera implementado 
    por una clase.

    Las interfaces se definen de formas similares a las clases
       
        public interface Cantante {
            public void cantar (String Letra);
        }

    Para una clase implemente los metodos de una interfaz se hace uso de la 
    palabra reservada "Implements".
        
        public class Persona implements Cantante {
            public void cantar (String Letra){
                return String Letra
            }
        }  
    
    OBS: EN JAVA NO EXISTE LA HERENCIA MULTIPLE 

## Diferencia entre interfaces y clase abstracta
    A diferencia de las clases abstractas, las interfaces no pueden hacer nada 
    por si solas.

    Es practicamente un conjunto en el que las clases que la implementar, estan 
    obligados a definir el comportamiento de todos los metodos abstractos.

    Una clase hija, puede hacer uso de n cantidad de interfaces que necesite.

