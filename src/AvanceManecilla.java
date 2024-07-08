public class AvanceManecilla implements Runnable{
    private Reloj reloj;
    private TipoManecilla tipoManecilla;

    public AvanceManecilla(Reloj reloj, TipoManecilla tipoManecilla){
        this.reloj= reloj;
        this.tipoManecilla= tipoManecilla;
    }


    @Override
    public void run() {
        while(true){
            try{
                Thread.sleep(1000);
                reloj.avanzarManecilla(tipoManecilla);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
