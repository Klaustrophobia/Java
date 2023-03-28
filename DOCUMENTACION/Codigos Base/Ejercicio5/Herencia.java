package herencia;

public class Herencia{

    public static void main (String[] args){
        //Crear un objeto
        Gato gato1 = new Gato("Kitty","siames");

        System.out.println("El nombre del gato 1 es: " +gato1.getNombre()+ "y su raza es: "+gato1.getRaza());
    }
}