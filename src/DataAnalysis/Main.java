package DataAnalysis;

import java.util.List;

public class Main {

    static final String talleresXML = "https://analisi.transparenciacatalunya.cat/api/views/ebyt-8dme/rows.xml";

    public static void main(String[] args) {

        XMLReader xmlReader = new XMLReader(talleresXML);
        List<Row> rows = xmlReader.readXML();
        Menu menu = new Menu(rows);
        do {
            menu.showMenu();
        } while (true);

        //new XMLReader(talleresXML);
    }
}
