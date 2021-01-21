package DataAnalysis;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import java.util.Date;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Row {

    public String n_m_registre_taller;
    public String nom_titular;
    public String r_tol;
    public String adre_a_taller;
    public int codi_postal;
    public String municipi;
    public int municipi_codi_idescat;
    public String provincia;
    public int tel_fon;
    public String estat;
    public Date data_alta;
    public String _id;
    public String _uuid;
    public int _position;
    public String _address;
    public String text;
    public Date data_baixa;
    public List<Row> row;
}
