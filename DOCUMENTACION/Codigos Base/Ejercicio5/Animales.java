Package herencia;

public class Animal {
    private String nombre;

    // Constructor
    public Animal (String nombre){
        this.nombre = nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void getNombre(String nombre){
        return this.nombre;
    }

    public void hacerSonido(){
        System.out.println("Sonido de animal xd")
    }

}