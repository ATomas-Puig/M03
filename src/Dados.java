import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Dados {
    public static void main(String[] args) {
        Random randomizer = new Random();
        Scanner input = new Scanner(System.in);
        int contadorDe2 = 0;
        int contadorDe3 = 0;
        int contadorDe4 = 0;
        int contadorDe5 = 0;
        int contadorDe6 = 0;
        int contadorDe7 = 0;
        int contadorDe8 = 0;
        int contadorDe9 = 0;
        int contadorDe10 = 0;
        int contadorDe11 = 0;
        int contadorDe12 = 0;
        int numeroDeVeces = 0;
        int dado1 = 0;
        int dado2 = 0;
        int sumaDados = 0;

        System.out.println("Indica el número de veces que quieres tirar los dados:");
        numeroDeVeces = input.nextInt();

        for (int i = 0; i < numeroDeVeces; i++) {

            dado1 = randomizer.nextInt(6) + 1;
            dado2 = randomizer.nextInt(6) + 1;
            sumaDados = dado1 + dado2;

            switch (sumaDados) {
                case 2:
                    contadorDe2++;
                    break;
                case 3:
                    contadorDe3++;
                    break;
                case 4:
                    contadorDe4++;
                    break;
                case 5:
                    contadorDe5++;
                    break;
                case 6:
                    contadorDe6++;
                    break;
                case 7:
                    contadorDe7++;
                    break;
                case 8:
                    contadorDe8++;
                    break;
                case 9:
                    contadorDe9++;
                    break;
                case 10:
                    contadorDe10++;
                    break;
                case 11:
                    contadorDe11++;
                    break;
                case 12:
                    contadorDe12++;
                    break;
                default:
                    System.out.println("Fuera de rango. " + sumaDados + " " + dado1 + " " + dado2);
            }
        }
        System.out.println("Éste es el resultado de todas las tiradas:");
        System.out.println("2 --> " + contadorDe2);
        System.out.println("3 --> " + contadorDe3);
        System.out.println("4 --> " + contadorDe4);
        System.out.println("5 --> " + contadorDe5);
        System.out.println("6 --> " + contadorDe6);
        System.out.println("7 --> " + contadorDe7);
        System.out.println("8 --> " + contadorDe8);
        System.out.println("9 --> " + contadorDe9);
        System.out.println("10 --> " + contadorDe10);
        System.out.println("11 --> " + contadorDe11);
        System.out.println("12 --> " + contadorDe12);
    }
}
