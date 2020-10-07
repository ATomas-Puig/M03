package E2;

import java.util.Scanner;

public class MenuDaus {
    private Scanner input = new Scanner(System.in);
    JocDaus jocDaus;

    public MenuDaus(){
    }

    public void show(){
        menuPrincipal();
    }

    private void menuPrincipal(){
        int opcion;
        do {
            System.out.println("Elige una opción:");
            System.out.println("1. Jugar a los dados.");
            System.out.println("2. Jugar al parchís.");
            System.out.println("3. Jugar al tres en raya.");
            System.out.println("4. Salir");
            opcion = input.nextInt();
            switch (opcion){
                case 1:
                    menuDados();
                    break;
                case 2:
                    System.out.println("Lo sentimos, este juego no está disponible. Descarga el DLC en la Store.");
                    break;
                case 3:
                    System.out.println("Discúlpanos otra vez, pero este juego tampoco está disponible en la versión gratuita.");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Elige una opción válida.");
            }
        } while (opcion != 4);
    }

    private void menuDados(){
        jocDaus = new JocDaus();
        int opcion;
        do {
            System.out.println("Elige una opción:");
            System.out.println("1. Tirar los dados.");
            System.out.println("2. Volver");
            System.out.println("3. Salir");
            opcion = input.nextInt();
            switch (opcion){
                case 1:
                    jocDaus.jugar();
                    System.out.println(jocDaus);
                    break;
                case 2:
                    System.out.println("Has ganado " + jocDaus.getPuntuacion() + " veces.");
                    menuPrincipal();
                    break;
                case 3:
                    System.out.println("Has ganado " + jocDaus.getPuntuacion() + " veces.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Elige una opción válida.");
            }
        } while (opcion != 3);
    }
}