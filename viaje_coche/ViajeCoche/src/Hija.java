class Hija implements Runnable {
    private Coche coche;

    public Hija(Coche coche) {
        this.coche = coche;
    }

    @Override
    public void run() {
        while (coche.getKilometros() > 0) {
            synchronized (coche) {
                if (coche.getKilometros() % 2 == 0) {
                    System.out.println("Hija: ¿cuánto falta?");
                    System.out.println("Padre: quedan " + coche.getKilometros() + "km");
                }
            }

            try {
                Thread.sleep(2000); // Esperar 1 segundo antes de preguntar de nuevo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}