class JugadorAjedrez implements Runnable {
    private String nombre;
    private TableroAjedrez tablero;

    public JugadorAjedrez(String nombre, TableroAjedrez tablero) {
        this.nombre = nombre;
        this.tablero = tablero;
    }
    private String generarCasillaAleatoria() {
        char columna = (char) ('A' + (int) (Math.random() * 8));
        int fila = 1 + (int) (Math.random() * 8);
        return String.valueOf(columna) + fila;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            String casilla = generarCasillaAleatoria();
            boolean haCapturado = Math.random() < 0.3;
            tablero.realizarMovimiento(nombre, casilla, haCapturado);
            try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        System.out.println(nombre + " ha completado sus movimientos.");
    }

}