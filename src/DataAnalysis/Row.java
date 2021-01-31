package DataAnalysis;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import java.util.Comparator;
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

    @Override
    public String toString() {
        return  "-----------   Datos del taller   -----------" + "\n" +
                "Número de registro: " + n_m_registre_taller + "\n" +
                "Nombre del titular: " + nom_titular + "\n" +
                "Rótulo: " + r_tol + "\n" +
                "Dirección: " + adre_a_taller + "\n" +
                "Código postal: " + codi_postal + "\n" +
                "Municipio: " + municipi + "\n" +
                "Código Idescat del municipio: " + municipi_codi_idescat + "\n" +
                "Provincia: " + provincia + "\n" +
                "Teléfono: " + tel_fon + "\n" +
                "Estado: " + estat + "\n" +
                "Fecha de alta: " + data_alta + "\n" +
                "Fecha de baja: " + data_baixa + "\n";
    }


}
