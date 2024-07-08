class TableroAjedrez {
    private String estado = "Tablero inicial.";

    public synchronized void realizarMovimiento(String jugador, String casilla, boolean haCapturado) {
        estado = jugador + " movió a " + casilla + (haCapturado ? " capturando una pieza." : ".");
        System.out.println(estado);
    }
}