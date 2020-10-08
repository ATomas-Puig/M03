package E2;

import java.util.Random;

public class Dau {
    private int valor;
    private Random randomizer = new Random();

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int tirar(){
        setValor(randomizer.nextInt(6) + 1);
        return valor;
    }

    @Override
    public String toString() {
        return "valor: " + getValor();
    }
}
