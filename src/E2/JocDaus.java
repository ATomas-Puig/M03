package E2;

public class JocDaus {
    private Dau dau1;
    private Dau dau2;
    private Dau dau3;
    private int partidasGanadas = 0;
    private int partidasPerdidas = 0;
    private int totalPartidas = 0;

    public JocDaus() {
        dau1 = new Dau();
        dau2 = new Dau();
        dau3 = new Dau();
    }

    public void jugar (){
        int d1 = dau1.tirar();
        int d2 = dau2.tirar();
        int d3= dau3.tirar();
        if ((d1 == d2) && (d2 == d3)){
            this.partidasGanadas++;
            this.totalPartidas++;
        } else {
            this.partidasPerdidas++;
            this.totalPartidas++;
        }
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }
    public int getPartidasPerdidas() {
        return partidasPerdidas;
    }
    public int getTotalPartidas() {
        return totalPartidas;
    }

    @Override
    public String toString() {
        return "Tirada: " + "Dado 1 -> " + dau1 + ", Dado 2 -> " + dau2 + ", Dado 3 -> " + dau3 + ".";
    }
}
