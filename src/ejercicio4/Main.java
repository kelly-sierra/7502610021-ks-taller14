package ejercicio4;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Coche();
        vehiculo.mover(); // Muestra el mensaje del coche

        vehiculo = new Bicicleta();
        vehiculo.mover(); // Muestra el mensaje de la bicicleta

        System.out.println("\n--- Usando un arreglo de Vehiculo ---");
        Vehiculo[] vehiculos = {new Vehiculo(), new Coche(), new Bicicleta()};
        for (Vehiculo v : vehiculos) {
            v.mover();
        }
    }
}
