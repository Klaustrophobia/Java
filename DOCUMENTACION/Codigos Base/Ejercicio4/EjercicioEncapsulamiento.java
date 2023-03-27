public class Persona {

    /* Atributos: Son las propiedades que definen al objeto */
    private String nombre;
    private int edad;

    /* Metodos publicos para acceder a los atributos */
    /*Setters: Permiten establecer el valor de un atributo
    fuera de la clase  */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
    
    /*Getters: Perminte acceder al valor de un atributo
    fuera de la clase*/
    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }

}
