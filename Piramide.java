public class Piramide extends Triangulo {

    private double volumen;

    // Constructor adicional que no pide volumen
    public Piramide(String nombre, double base, double altura) {
        super(nombre, base, altura);
        this.volumen = 0.0;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    // Método personalizado usando la fórmula V = B * b
    public double calcularVolumen(double basePiramide) {
        this.volumen = basePiramide * getBase(); // getBase() es de Triángulo
        return this.volumen;
    }

    @Override
    public double getArea() {
        double a = getBase() * getAltura() / 2;
        super.setArea(a);
        return a;
    }

    @Override
    public double getPerimetro() {
        double p = 3 * getBase();
        super.setPerimetro(p);
        return p;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPiramide [volumen=" + volumen + "]";
    }
}
