package DataAnalysis;

public class Main {

    static final String talleresXML = "https://analisi.transparenciacatalunya.cat/api/views/ebyt-8dme/rows.xml";

    public static void main(String[] args) {

        XMLReader xmlReader = new XMLReader(talleresXML);
        Menu menu = new Menu(xmlReader.readXML());
        do {
            menu.showMenu();
        } while (true);

        //new XMLReader(talleresXML);

        //TODO dividir el código en clases: una para parsear, otra para mostrar los datos, otra de menú, etcétera.
    }
}
