package E2;

public class JocDaus {
    private Dau dau1;
    private Dau dau2;
    private Dau dau3;
    private int puntuacion = 0;

    public JocDaus() {
        dau1 = new Dau();
        dau2 = new Dau();
        dau3 = new Dau();
    }

    public int jugar (){
        int d1 = dau1.tirar();
        int d2 = dau2.tirar();
        int d3= dau3.tirar();
        if ((d1 == d2) && (d2 == d3)){
            this.puntuacion++;
        }
        return this.puntuacion;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    @Override
    public String toString() {
        return "E2.JocDaus{" +
                "dau1=" + dau1 +
                ", dau2=" + dau2 +
                ", dau3=" + dau3 +
                '}';
    }
}
