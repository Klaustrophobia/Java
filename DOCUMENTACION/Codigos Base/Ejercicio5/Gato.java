package herencia;

public class Gato extends Animal {
    // Otorgar atributos
    private String raza;

    // Se crea el metodo constructor de la clase que otorga atributos de la clase padre
    public Gato(String nombre, String raza){
        super(nombre);
        this.raza = raza;
    }

     public void setRaza(String raza){
        this.raza = raza;
    }

    public void getRaza(String raza){
        return this.raza;
    }
    
}