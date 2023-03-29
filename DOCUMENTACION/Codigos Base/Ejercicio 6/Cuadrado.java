
package abstraccion;


public class Cuadrado extends FiguraGeometrica{
    private double lado;
    
    //Constructor
    public Cuadrado(double lado){
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    //USAR EL METODO DE LA CLASE PADRE
    @Override
    public double calcularArea(){
        double area = lado*lado;
        return area;
    }
}
