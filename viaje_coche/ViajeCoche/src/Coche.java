class Coche {
    private int kilometros = 10;

    public synchronized int getKilometros() {
        return kilometros;
    }
    public synchronized void avanzar() {
        if (kilometros > 0) {
            kilometros--;
        }
    }
}
