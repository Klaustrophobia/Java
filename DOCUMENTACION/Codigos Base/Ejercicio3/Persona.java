public class Persona {

    /* Atributos: Son las propiedades que definen al objeto */
    public String nombre;
    public int edad;
    public double altura;
    public double peso;

    
    // Metodos: Definen el comportamiento de un objeto
    public void comer(String comida){
        System.out.println(nombre+ " Estoy comiendo " +comida);
    }
    /*
    Detalles en Markdown Clase Java 7
    */
    public void dormir(){
        System.out.println(nombre+ " Esta dormida ");
    }

    public void caminar(){
        System.out.println(nombre+ " Esta caminando ");
    }

}


