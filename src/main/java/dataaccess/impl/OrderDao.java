package dataaccess.impl;

import java.io.*;
import java.util.List;

import dataaccess.AbstractDao;
import system.Order;
import table.OrderTable;
import system.Order;

public class OrderDao extends AbstractDao<OrderTable, Order> implements Serializable{

    public OrderDao(final String rootFolderPath) {
        super(rootFolderPath);
    }

    @Override
    public void saveNew(Order newOrder) {
        // set ID
        newOrder.setId(getNextId());
        // get existing data
        final OrderTable orderTable = deserializeFromXml();
        // add new row
        orderTable.getRows().add(newOrder);
        // save data
        serializeToXml(orderTable);
        //
    }

    @Override
    public Order get(Long id) {
        // get existing data
        final OrderTable orderTable = deserializeFromXml();
        // find by ID
        for (final Order row : orderTable.getRows()) {
            if (row.getId().equals(id)) {
                return row;
            }
        }
        return null;
    }

    @Override
    public List<Order> getAll() {
        // get existing data
        final OrderTable orderTable = deserializeFromXml();
        return orderTable.getRows();
    }

    @Override
    public void delete(Long id) {
        // get existing data
        final OrderTable orderTable = deserializeFromXml();
        // find by ID
        Order toBeDeleted = null;
        for (final Order row : orderTable.getRows()) {
            if (row.getId().equals(id)) {
                // found!!!
                toBeDeleted = row;
                break;
            }
        }
        // remove from list
        orderTable.getRows().remove(toBeDeleted);
        // save updated table
        serializeToXml(orderTable);
    }

    @Override
    protected Class<OrderTable> getTableClass() {
        return OrderTable.class;
    }

}
