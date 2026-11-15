package ejercicio3;

// Parte 2: Gato sobrescribe hacerSonido pero NO cambia el comportamiento.
// Compila y funciona, pero es una mala practica.
public class Gato extends Animal {
    @Override
    public void hacerSonido() {
        super.hacerSonido(); // Solo repite lo que ya hace la clase base
    }
}
