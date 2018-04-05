package dataaccess.impl;

import dataaccess.impl.OrderDao;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


import system.Administrator;
import system.Car;
import system.Client;
import system.Order;
import junit.framework.Assert;

public class OrderDaoTest {
    private static final String TEST_XML_FOLDER = "testXmlFolder";
    private static OrderDao orderDao;

    @BeforeClass
    public static void createDao() {
        orderDao = new OrderDao(TEST_XML_FOLDER);
    }

    @AfterClass

    @Test
    public Order saveNew() {
        final Order newOrder = new Order();
        newOrder.setClient(new Client());
        newOrder.setCar(new Car());
        newOrder.setAdmin(new Administrator("admin"));
        newOrder.setRepairprice(0);
        newOrder.setIsCanceled(false);
        orderDao.saveNew(newOrder);
        return newOrder;
    }

    @Test
    public void getAll() {
        System.out.println("Start 'getAll' test for Circle");
        final int initialRowsCount = orderDao.getAll().size();
        saveNew();
        Assert.assertEquals(orderDao.getAll().size(), initialRowsCount + 1);
    }

    @Test
    public void delete() {
        System.out.println("Start 'delete' test for Circle");
        final Order newOrder = saveNew();
        orderDao.delete(newOrder.getId());
        Assert.assertNull(orderDao.get(newOrder.getId()));
    }
}