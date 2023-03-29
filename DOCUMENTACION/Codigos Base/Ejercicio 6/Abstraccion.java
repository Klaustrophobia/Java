
package abstraccion;

public class Abstraccion {

    public static void main(String[] args) {
        
        //Crear una instancia 
        Cuadrado c1 = new Cuadrado(3.5);
        
        double area = c1.calcularArea();
        System.out.println("El area del cuadrado es: " +area);
    }
    
}
