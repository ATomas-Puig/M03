package DataAnalysis;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    static final String talleresXML = "https://analisi.transparenciacatalunya.cat/api/views/ebyt-8dme/rows.xml";

    public static void main(String[] args) {
        readXML();

        //TODO dividir el código en clases: una para parsear, otra para mostrar los datos, otra de menú, etcétera.
    }

    private static void readXML() {
        URL url = null;
        try {
            url = new URL(talleresXML);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        try {
            JAXBContext contextObj = JAXBContext.newInstance(Response.class);
            Unmarshaller unmarshallerObj = contextObj.createUnmarshaller();
            Response response = (Response) unmarshallerObj.unmarshal(url);
            System.out.println(response.row.row.get(1));
            //response.row.row.forEach(System.out::println);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
