package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Figura figura1 = new Figura();
        Figura figura2 = new Circulo(5);
        Figura figura3 = new Rectangulo(4, 6);

        // Polimorfismo dinamico: la referencia es Figura, pero se ejecuta
        // el metodo sobrescrito segun el objeto real
        figura1.calcularArea();
        figura2.calcularArea();
        figura3.calcularArea();

        System.out.println("\n--- Recorriendo un arreglo de Figura ---");
        Figura[] figuras = {new Circulo(2), new Rectangulo(3, 7), new Circulo(1.5)};
        for (Figura f : figuras) {
            f.calcularArea();
        }
    }
}
