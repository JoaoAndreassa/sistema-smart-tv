public class SmartTv {
    final usuario usuario = new usuario();
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentar() {
        volume++;
    }

    public void diminui() {
        volume--;
    }

    public void canalMais() {
        canal++;
    }

    public void canalMenos() {
        canal--;
    }

}
