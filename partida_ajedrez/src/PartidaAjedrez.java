public class PartidaAjedrez {

    public static void main(String[] args) {
        TableroAjedrez tablero = new TableroAjedrez();
        Thread jugadorBlanco = new Thread(new JugadorAjedrez("Blanco", tablero));
        Thread jugadorNegro = new Thread(new JugadorAjedrez("Negro", tablero));
        jugadorBlanco.start();
        jugadorNegro.start();
    }
}