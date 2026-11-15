package ejercicio3;

public class Main {
    public static void main(String[] args) {
        // ---------- PARTE 1: Error de compilacion ----------
        Animal miAnimal = new Perro();
        miAnimal.hacerSonido(); // Correcto: existe en Animal

        // miAnimal.correr();
        // ERROR DE COMPILACION (descomentar para verlo):
        // "cannot find symbol: method correr()"
        // La referencia es de tipo Animal y Animal no tiene el metodo correr(),
        // aunque el objeto real sea un Perro. El compilador solo revisa el tipo
        // de la referencia, no el del objeto.

        // Solucion: hacer un casting hacia Perro (o usar una referencia Perro)
        ((Perro) miAnimal).correr();

        // ---------- PARTE 2: Mala practica sin error ----------
        Animal miGato = new Gato();
        miGato.hacerSonido(); // Muestra: El animal hace un sonido.

        // Por que es mala practica:
        // 1. Gato sobrescribe hacerSonido() sin cambiar nada: es codigo redundante.
        // 2. Si no se necesita un comportamiento distinto, no hay razon para
        //    sobrescribir; basta con heredar el metodo.
        // 3. Confunde al lector, que cree que Gato tiene un comportamiento propio.
        // 4. Aumenta el mantenimiento sin aportar ningun beneficio.
    }
}
