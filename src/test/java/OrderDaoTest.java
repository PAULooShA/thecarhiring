import dataaccess.impl.OrderDao;
import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import system.Administrator;
import system.Car;
import system.Client;
import system.Order;

public class OrderDaoTest {

    private static final String TEST_XML_FOLDER = "testXmlFolder";
    private static OrderDao orderDao;

    @BeforeClass
    public static void createDao() {
        orderDao = new OrderDao(TEST_XML_FOLDER);
    }


    @AfterClass
    public static void deleteTestXmlData() {

    }

    @Test
    public void testAdd() {
        System.out.println("Start 'save' test for Circle");
        final Order newOrder = saveNewOrder();
        Assert.assertNotNull(orderDao.get(newOrder.getId()));
    }

    @Test
    public void testDelete() {
        System.out.println("Start 'delete' test for Circle");
        final Order newOrder = saveNewOrder();
        orderDao.delete(newOrder.getId());
        Assert.assertNull(orderDao.get(newOrder.getId()));
    }

    @Test
    public void testGetAll() {
        System.out.println("Start 'getAll' test for Circle");
        final int initialRowsCount = orderDao.getAll().size();
        saveNewOrder();
        Assert.assertEquals(orderDao.getAll().size(), initialRowsCount + 1);
    }

    private Order saveNewOrder() {
        final Order newOrder = new Order();
        newOrder.setCar(new Car());
        newOrder.setClient(new Client());
        newOrder.setRepairprice(10);
        orderDao.saveNew(newOrder);
        return newOrder;
    }
}