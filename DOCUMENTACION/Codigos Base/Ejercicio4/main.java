package ejercicio4;
import ejercicio4.Persona;

public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Crear una instancia
    Persona persona1 = new Persona();
    Persona persona2 = new Persona();
      
    // Acceder a los atributos de la clase persona
    persona1.setNombre("Sea Fairy");
    persona1.setEdad(22);
    
    //Acceder a los atributos de persona
    String nombre = persona1.getNombre();
    int edad = persona1.getEdad();
    
    System.out.println("El nombre de la persona 1 es: " +nombre);
    System.out.println("La edad de la persona 1 es :" +edad);
    
    persona2.setNombre("Moonlight");
    persona2.setEdad(22);
    
     //Acceder a los atributos de persona
     String nombre2 = persona2.getNombre();
     int edad2 = persona2.getEdad();
    
    System.out.println("El nombre de la persona 2 es: " +nombre2);
    System.out.println("La edad de la persona 2 es :" +edad2);
    
    }
    
}
