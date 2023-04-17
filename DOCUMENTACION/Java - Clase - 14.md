## Intrucciones en JAVA
    IF, SWITCH

## Operadores logicos en Java


## Bibliografias
1. https://www.aprenderaprogramar.com/index.php?option=com_content&view=article&id=466:operadores-logicos-en-java-igual-distinto-and-or-not-mayor-menor-cortocircuito-cu00634b&catid=68&Itemid=188

package estructuras;

import java.util.Scanner;

public class Estructuras {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        
        System.out.println("Ingrese el dato 1: ");
        
        int a = dato.nextInt();
        
        System.out.println("Ingrese el dato 2: ");

        int b = dato.nextInt();
        
        System.out.println("Los datos ingresados son: " +a+ " El segundo dato ingresado es:" +b);
        
        if (a >= 65){
        System.out.println("Aprobo");
        }else{
        System.out.println("Reprobo");
        }if(a > 100){
        System.out.println("La nota ingresada es imposible de evaluar porque va mas del 100%");
        }
      
        if (b >= 65){
        System.out.println("Aprobo");
        }else{
        System.out.println("Reprobo");
        }if(b > 100){
        System.out.println("La nota ingresada es imposible de evaluar porque va mas del 100%");
        }
    }
    
}
