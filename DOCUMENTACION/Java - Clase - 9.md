## Herencia
    Es la capacidad de crear una nueva clase basada en una clase existente.
    heredando sus caracteristicas y agregando nuevas.
    Para hacer uso de la herencia en una clase lo definimos de la siguiente maneraP
        
        public class Clase1 extends Clase2

## Constructor
    El método constructor es un metodo especial para crear e inicializar un objeto 
    creado a partir de una clase.
    Ejemplo:
            class Square extends Polygon {
                constructor(length) {

            // Aquí, llama al constructor de la clase padre con sus longitudes
            // contemplando la anchura y la altura del Polígono

                super(length, length);

            // Nota: En las clases derivadas, super() se debe llamar primero
            // Se puede utilizar "this". Dejando esto causará un error de
            //referencia.

                this.name = 'Square';
            }

        get area() {
            return this.height * this.width;
            }

        set area(value) {
            this.area = value;
            }
        }

## BIBLIOGRAFIA
1. [https://developer.mozilla.org/es/docs/Web/JavaScript/Reference/Classes/constructor]

