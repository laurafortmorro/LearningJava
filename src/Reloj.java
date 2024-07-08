public class Reloj {
    private int horas= 0;
    private int minutos=0;
    private int segundos=0;

    public void avanzarManecilla(TipoManecilla tipoManecilla) {
        switch (tipoManecilla) {
            case HORAS:
                if (minutos == 4 && segundos == 9 ) {  // Si minutos llega a 0, incrementar los minutos
                    horas= (horas+1)%12;
                    System.out.println("Son las "+horas+" en punto");
                }
                break;
            case MINUTOS:
                if (segundos == 9) {  // Si segundos llega a 0, incrementar los minutos
                minutos= (minutos+1)%5;
                    System.out.println("Ha pasado "+minutos+" minutos desde el inicio");
            }
                break;
            case SEGUNDOS:
                segundos = (segundos + 1) % 10;
                System.out.printf("%02d\n", segundos);
                break;
        }


    }
}
