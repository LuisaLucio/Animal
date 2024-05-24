package pruebaanimal;

/**
 *
 * @author LuisaLucio
 */
public class PruebaAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Creación de instancias de animales
        Animal miPerro = new Perro();
        Animal miCanguro = new Canguro();
        Animal miSerpiente = new Serpiente();
        Animal miMurcielago = new Murcielago();
        

        // Movimiento de los animales
        miPerro.moverse();
        miCanguro.moverse();
        miSerpiente.moverse();
        miMurcielago.moverse();
    }
}
