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
        System.out.println("--- Red de talleres de Catalunya ---");
        System.out.println("");
    }
}
