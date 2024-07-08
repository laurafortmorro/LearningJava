public class ViajeEnCoche {

    public static void main(String[] args) {
        Coche coche = new Coche();
        Padre padre = new Padre(coche);
        Hija hija = new Hija(coche);

        Thread padreThread = new Thread(padre);
        Thread hijoThread = new Thread(hija);

        System.out.println("Se inicia el viaje, quedan " + coche.getKilometros() + "km para llegar");

        padreThread.start();
        hijoThread.start();
    }
}