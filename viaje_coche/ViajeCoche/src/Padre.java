class Padre implements Runnable {
    private final Coche coche;

    public Padre(Coche coche) {
        this.coche = coche;
    }

    @Override
    public void run() {
        while (coche.getKilometros() > 0) {
            coche.avanzar();
            System.out.println(coche.getKilometros() + "km");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Se termina el viaje, se ha llegado al destino");
    }
}

