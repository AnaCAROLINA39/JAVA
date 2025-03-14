public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 24;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentaCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void aumentarVolume() {
        System.out.println("aumentou" + volume);
        volume++;
    }

    public void diminuirVolume() {
        System.out.println("dininuindo" + volume);
        volume--;
    }

    public void ligar() {
        ligada = true;
    }

    public void desligada() {
        ligada = false;
    }
}