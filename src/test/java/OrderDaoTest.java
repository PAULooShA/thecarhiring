import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import dataaccess.impl.OrderDao;
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
    public static void deleteTestXmlData() {
        //	 write code to clean up test results from FS

    }

    @Test
    public void testAdd() {
        System.out.println("Start 'save' test for Order");
        final Order newOrder = saveNewOrder();
        Assert.assertNotNull(orderDao.get(newOrder.getId()));
    }

    @Test
    public void testDelete() {
        System.out.println("Start 'delete' test for Order");
        final Order newOrder = saveNewOrder();
        orderDao.delete(newOrder.getId());
        Assert.assertNull(orderDao.get(newOrder.getId()));
    }

    @Test
    public void testGetAll() {
        System.out.println("Start 'getAll' test for Order");
        final int initialRowsCount = orderDao.getAll().size();
        saveNewOrder();
        Assert.assertEquals(orderDao.getAll().size(), initialRowsCount + 1);
    }

    private Order saveNewOrder() {
        final Order newOrder = new Order();
        newOrder.setIsCanceled(false);
        orderDao.saveNew(newOrder);
        return newOrder;
    }
}