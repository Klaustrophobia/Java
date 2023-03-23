import java.util.Scanner;
import Ejercicio3.Persona;


public class Ejercicio3{

    public static void main(String [] args){

        // Crear una instancia
        Persona persona1 = new Persona();

        // Acceder a los atributos de la clase persona
        persona1.nombre = "Moonlight";
        persona1.edad = 33;
        persona1.altura = 1.90;
        persona1.peso = 80;


        //Acceder a los metodos de la clase persona
        persona1.caminar();
        persona1.comer("Sopa de mono");
        persona1.dormir();

    }
}