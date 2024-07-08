public class Hora {
    public static void main(String[] args) {
        //creación de la instancia de la clase compartida entre los hilos
        Reloj reloj= new Reloj();

        //Crear los hilos que simularán el avance de cada de las manecillas
        Thread mHoras= new Thread(new AvanceManecilla(reloj, TipoManecilla.HORAS));
        Thread mMinutos= new Thread(new AvanceManecilla(reloj, TipoManecilla.MINUTOS));
        Thread mSegundos= new Thread(new AvanceManecilla(reloj, TipoManecilla.SEGUNDOS));

        //Iniciar los hilos
        mSegundos.start();
        mMinutos.start();
        mHoras.start();

    }
}
