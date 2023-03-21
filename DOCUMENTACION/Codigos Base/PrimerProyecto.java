public class PrimerProyecto {

    public static void main (String[] args){
        String nombre = "Alastor";
        String apellido = "Bon boulash";
        int edad = 50;

        // El signo + se utiliza como concatenador entre las variables definidas anteriormente
        System.out.println("Hola mi nombre es "+nombre+" "+apellido+" y tengo "+edad+" a;os de edad");

        // La siguiente linea de codigo lo que va a definir es la longitud del String generado
        String phrase = "I like turtle";
        int longitud = phrase.length(); //Almacenar la longitud del String
        System.out.println("La longitud de la cadena es : "+longitud);

        String subCadena = phrase.substring(1,10); //Este permite de donde inicie y donde termine el String
        System.out.println(subCadena);

        // El siguiente metodo va a convertir en mayusculas y minusculas todo el String
        String mayusculas = phrase.toUpperCase(); //Transforma el string todo en mayusculas
        String minusculas = phrase.toLowerCase(); //Transforma el string todo en minusculas
        System.out.println(mayusculas);
        System.out.println(minusculas);
    }
}