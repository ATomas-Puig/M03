package DataAnalysis;

import java.util.Comparator;

public class ComparatorDataAlta implements Comparator<Row> {
    @Override
    public int compare(Row row1, Row row2) {
        if (row1.getData_alta().before(row2.getData_alta())) return -1;
        else if (row1.getData_alta().after(row2.getData_alta())) return 1;
        else return 0;
    }
}
