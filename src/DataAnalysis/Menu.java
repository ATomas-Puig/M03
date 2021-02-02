package DataAnalysis;

import java.util.*;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    private List<Row> rows;

    public Menu(List<Row> rows) {
        this.rows = rows;
    }

    public void showMenu() {
        System.out.println("+-----------------------------------");
        System.out.println("|   Red de talleres de Catalunya   |");
        System.out.println("|          Menú principal          |");
        System.out.println("+----------------------------------+");
        System.out.println();
        System.out.println("<1> Mostrar todos los talleres registrados en Catalunya");
        System.out.println("<2> Buscar talleres por provincia");
        System.out.println("<3> Buscar talleres por municipio");
        System.out.println("<4> Buscar talleres por código postal");
        System.out.println("<5> Buscar talleres por nombre");
        System.out.println("<6> Mostrar el número total de talleres registrados en Catalunya");
        System.out.println("<7> Obtener el número de talleres por provincia");
        System.out.println("<8> Obtener el número de talleres por municipio");
        System.out.println("<9> Obtener el número de talleres por código postal");
        System.out.println("<10> Mostrar los 20 talleres más antiguos de Catalunya");
        System.out.println("<11> Buscar los 10 talleres más antiguos por provincia");
        System.out.println("<12> Buscar los 10 talleres más antiguos por municipio");
        System.out.println("<13> Buscar los 10 talleres más antiguos por código postal");
        System.out.println("<14> Mostrar sólo los talleres dados de baja");
        System.out.println("<15> Mostrar sólo los talleres dados de alta");
        System.out.println("<0> Salir");
        String opcion = scanner.nextLine();

        switch (opcion) {
            case "1":
                showAllWorkshops();
                break;
            case "2":
                searchWorkshopsByProvince();
                break;
            case "3":
                searchWorkshopsByCity();
                break;
            case "4":
                searchWorkshopsByPostalCode();
                break;
            case "5":
                searchWorkshopsByName();
            case "6":
                totalWorkshopsCount();
                break;
            case "7":
                countWorkshopsByProvince();
                break;
            case "8":
                countWorkshopsByCity();
                break;
            case "9":
                countWorkshopsByPostalCode();
                break;
            case "10":
                sortWorkshopsByYear();
                break;
            case "11":
                sortWorkshopsByYearAndProvince();
                break;
            case "12":
                sortWorkshopsByYearAndCity();
                break;
            case "13":
                sortWorkshopsByYearAndPostalCode();
                break;
            case "14":
                showDeregisteredWorkshops();
                break;
            case "15":
                showRegisteredWorkshops();
                break;
            case "0":
                System.exit(0);
                break;
            default:
                System.out.println("Elige una opción correcta:");
        }
    }

    private void showAllWorkshops() {
        rows.stream().sorted((row, t1) -> row.getProvincia().compareTo(t1.getProvincia())).forEach(System.out::println);
    }

    private void searchWorkshopsByProvince() {
        System.out.println("Introduzca la provincia:");
        String provincia = scanner.nextLine();
        rows.stream().filter(row -> row.getProvincia().equalsIgnoreCase(provincia)).forEach(System.out::println);
    }

    private void searchWorkshopsByCity() {
        System.out.println("Introduzca el municipio:");
        String municipio = scanner.nextLine();
        rows.stream().filter(row -> row.getMunicipi().equalsIgnoreCase(municipio)).distinct().forEach(System.out::println);
    }

    private void searchWorkshopsByPostalCode() {
        System.out.println("Introduzca el código postal:");
        int codigoPostal = scanner.nextInt();
        rows.stream().filter(row -> row.getCodi_postal() == codigoPostal).forEach(System.out::println);
    }

    private void searchWorkshopsByName() {
        System.out.println("Introduzca el nombre del taller:");
        String nombreTaller = scanner.nextLine();
        rows.stream().filter(row -> row.getR_tol().equalsIgnoreCase(nombreTaller)).forEach(System.out::println);
    }

    private void totalWorkshopsCount() {
        System.out.println("Existen " + rows.stream().count() + " talleres en Catalunya.");
    }

    private void countWorkshopsByProvince() {
        System.out.println("Introduzca la provincia:");
        String provincia = scanner.nextLine();
        System.out.println("Existen " + rows.stream().filter(row -> row.getProvincia().equalsIgnoreCase(provincia)).count() + " talleres en la provincia de " + provincia);
    }

    private void countWorkshopsByCity() {
        System.out.println("Introduzca el municipio:");
        String municipio = scanner.nextLine();
        System.out.println("Existen " + rows.stream().filter(row -> row.getMunicipi().equalsIgnoreCase(municipio)).count() + " talleres en " + municipio);
    }

    private void countWorkshopsByPostalCode() {
        System.out.println("Introduzca el código postal:");
        String postalCode = scanner.nextLine();
        System.out.println("Existen " + rows.stream().filter(row -> row.getCodi_postal() == Integer.parseInt(postalCode)).count() + " talleres en el código postal " + postalCode);
    }

    private void sortWorkshopsByYear() {
        rows.stream().sorted(new ComparatorDataAlta()).limit(20).forEach(System.out::println);
    }

    private void sortWorkshopsByYearAndProvince() {
        System.out.println("Introduzca la provincia:");
        String province = scanner.nextLine();
        rows.stream().filter(row -> row.getProvincia().equalsIgnoreCase(province)).sorted(new ComparatorDataAlta()).limit(10).forEach(System.out::println);
        //.sorted((row, t1) -> row.getData_alta().compareTo(t1.getData_alta()))

        //int date = scanner.nextInt();
        //Date date1 = new GregorianCalendar(date, Calendar.JANUARY, 01).getTime();
        //rows.stream().filter(row -> row.getData_alta().before(date1)).sorted((row, t1) -> t1.getData_alta().compareTo(row.data_alta)).forEach(System.out::println);
        //System.out.println("Existen " + rows.stream().filter(row -> row.getProvincia().equalsIgnoreCase(provincia)).count() + " talleres en " + provincia);
    }

    private void sortWorkshopsByYearAndCity() {
        System.out.println("Introduzca el municipio:");
        String city = scanner.nextLine();
        rows.stream().filter(row -> row.getMunicipi().equalsIgnoreCase(city)).sorted(new ComparatorDataAlta()).limit(10).forEach(System.out::println);
    }

    private void sortWorkshopsByYearAndPostalCode() {
        System.out.println("Introduzca el código postal:");
        String postalCode = scanner.nextLine();
        rows.stream().filter(row -> row.getCodi_postal() == Integer.parseInt(postalCode)).sorted(new ComparatorDataAlta()).limit(10).forEach(System.out::println);
    }

    private void showDeregisteredWorkshops() {
        rows.stream().filter(row -> row.getEstat().equalsIgnoreCase("baixa")).sorted((row, t1) -> row.getProvincia().compareTo(t1.getProvincia())).forEach(System.out::println);
    }

    private void showRegisteredWorkshops() {
        rows.stream().filter(row -> row.getEstat().equalsIgnoreCase("alta")).sorted((row, t1) -> row.getProvincia().compareTo(t1.getProvincia())).forEach(System.out::println);
    }
}