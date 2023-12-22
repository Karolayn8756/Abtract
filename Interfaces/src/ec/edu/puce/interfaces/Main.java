package ec.edu.puce.interfaces;

public class Main {

    public static void main(String[] args) {
        // Rectángulo
        Rectangulo r1 = new Rectangulo();
        r1.setBase(7);
        r1.setAltura(15);
        System.out.println("Área del rectángulo1: " + r1.calcularArea());

        // Círculo
        Circulo c1 = new Circulo();
        c1.setRadio(5);
        System.out.println("Área del círculo1: " + c1.calcularArea());

        // Triángulo
        Triangulo t1 = new Triangulo();
        t1.setBase(8);
        t1.setAltura(10);
        System.out.println("Área del triángulo1: " + t1.calcularArea());
    }
}
