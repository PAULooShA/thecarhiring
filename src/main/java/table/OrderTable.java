package table;

import java.util.ArrayList;
import java.util.List;

import system.Order;

public class OrderTable extends AbstractTable<Order> {

    private List<Order> rows;

    @Override
    public List<Order> getRows() {
        if (rows == null) {
            rows = new ArrayList<Order>();
        }
        return rows;
    }

    @Override
    public void setRows(List<Order> rows) {
        this.rows = rows;
    }
}
