public class TestingPolimorfismo {

    public static void main(String[] args) {
        FiguraGeometrica unaFigura = new FiguraGeometrica("Hexagono");
        unaFigura.setArea(48.5);
        unaFigura.setPerimetro(32.9);
        System.err.println();
        System.out.println("Datos de una figura:" + unaFigura);
        System.err.println();

        //Ejemplo de uso de sobrecarga:
        //como programadores decidimos en tiempo de edicion cual constructor usar
        FiguraGeometrica otraFigura = new FiguraGeometrica("Pentagono", 25.12);
        //Ejemplo de uso sobre escritura:
        //Al momneto de correr, Java decide cual metodo toString debe usar
        System.out.println("Datos de otraFigura:" + otraFigura.toString());

        Triangulo triangulo1 = new Triangulo("Triangulo", 10.2, 15.8);
        System.out.println("Datos del triguango 1: " + triangulo1.toString());
        System.out.println("Area triangulo1: " + triangulo1.getArea());
        double perimetro = triangulo1.getPerimetro();
        triangulo1.setPerimetro(perimetro);
        System.out.println("Datos del triguango 1: " + triangulo1.toString());


        Piramide piramide1 = new Piramide("Pirámide", 6.0, 10.0); // base triángulo = 6.0, altura = 10.0
        System.out.println("Datos de la pirámide: " + piramide1.toString());
        // Volumen personalizado: V = B * b
        double volumen = piramide1.calcularVolumen(8.0); // 8.0 = base de la pirámide
        System.out.println("Volumen personalizado (B * b): " + volumen);

        // Perímetro
        double perimetro1 = piramide1.getPerimetro();
        piramide1.setPerimetro(perimetro1);
        System.out.println("Perimetro de la piramide (3 * base): " + perimetro1);

        // Área (del triángulo base)
        double areaPiramide = piramide1.getArea();
        piramide1.setArea(areaPiramide);
        System.out.println("Área de la pirámide (base * altura / 2): " + areaPiramide);

        System.out.println("Datos de la pirámide: " + piramide1.toString());

    
    }
   

}
