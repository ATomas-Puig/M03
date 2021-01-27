package DataAnalysis;

import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    private List<Row> rows;

    public Menu(List<Row> rows) {
        this.rows = rows;
    }

    public void showMenu(){
        System.out.println("+-----------------------------------");
        System.out.println("|   Red de talleres de Catalunya   |");
        System.out.println("|          Menú principal          |");
        System.out.println("+----------------------------------+");
        System.out.println();
        System.out.println("<1> Buscar talleres por provincia");
        System.out.println("<2> Buscar talleres por municipio");
        System.out.println("<3> Buscar talleres por código postal");
        System.out.println("<4> Obtener el número de talleres por provincia");
        System.out.println("<5> Buscar los talleres más antiguos por provincia");
        String opcion = scanner.nextLine();

        switch (opcion){
            case "1":
                searchWorkshopByProvince();
        }
    }

    private void searchWorkshopByProvince() {
        System.out.println("Introduzca la provincia.");
    }


}
