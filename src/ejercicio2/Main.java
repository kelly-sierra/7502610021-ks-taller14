package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona estudiante = new Estudiante();
        Persona profesor = new Profesor();

        persona.presentarse();
        estudiante.presentarse();
        profesor.presentarse();

        System.out.println("\n--- Usando un arreglo de Persona ---");
        Persona[] personas = {persona, estudiante, profesor};
        for (Persona p : personas) {
            p.presentarse();
        }
    }
}
