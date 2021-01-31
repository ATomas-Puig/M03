package DataAnalysis;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class XMLReader {
    private String listaXML;

    public XMLReader(String listaXML) {
        this.listaXML = listaXML;
    }

    public List<Row> readXML() {
        URL url = null;
        List<Row> rows = new ArrayList<>();

        try {
            url = new URL(getListaXML());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        try {
            JAXBContext contextObj = JAXBContext.newInstance(Response.class);
            Unmarshaller unmarshallerObj = contextObj.createUnmarshaller();
            Response response = (Response) unmarshallerObj.unmarshal(url);
            rows = response.row.row;

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return rows;
    }

    public String getListaXML() {
        return listaXML;
    }

    public void setListaXML(String listaXML) {
        this.listaXML = listaXML;
    }
}
