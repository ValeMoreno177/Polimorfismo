public class Triangulo extends FiguraGeometrica{

    private double base;
    private double altura;

    public Triangulo(String nombre, double base, double altura){
        super(nombre);
        this.altura = altura;
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Polimorfismo dinamico - sobre-es ritura de metodos 
    @Override
    public double getArea(){
        double a = this.base * this.altura / 2;
        super.setArea(a);
        return a;
    }

    @Override
    public double getPerimetro(){
        double p = 3 * this.base;
        return p;
    }

    //Polimorfismo dinamico - sobre-escritura de métodos
    //El método que se sobre-escribe en el toString de FiguraGeometrica
    @Override
    public String toString() {
        return super.toString() +"Triangulo [base=" + base + ", altura=" + altura + "]";
    }

    
}
