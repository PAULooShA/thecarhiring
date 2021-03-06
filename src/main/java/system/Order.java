package system;

import datamodel.AbstractModel;
import datamodel.UserProfile;

import java.util.Date;
import java.util.List;

public class Order extends AbstractModel {
    protected Car car;
    protected Client client;
    protected Boolean isPaid;
    protected Administrator admin;
    protected Boolean isCanceled;
    protected int repairprice;
    protected Date startdate;
    protected Date retdate;


    public Order(Car car, Client client, Administrator admin, Boolean isCanceled, Date startdate, Date retdate, int repairprice)
    {
        this.car = car;
        this.client = client;
        this.admin = admin;
        this.isCanceled = isCanceled;
        this.startdate = startdate;
        this.retdate = retdate;
        this.repairprice = repairprice;
    }

    public Order(){}

    private List<UserProfile> userList;

    public List<UserProfile> getUserList() {
        return userList;
    }

    public void setUserList(List<UserProfile> userList) {
        this.userList = userList;
    }

    public int getRepairprice(){return repairprice;}

    public void setRepairprice(int repairprice){this.repairprice = repairprice;}

    public Car getCar(){
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Client getClient(){
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Administrator getAdmin()
    {
        return admin;
    }

    public void setAdmin(Administrator admin)
    {
        this.admin = admin;
    }

    public Boolean getIsCanceled() {
        return isCanceled;
    }

    public void setIsCanceled(Boolean isCanceled)
    {
        this.isCanceled = isCanceled;
    }

    public Date getStartdate(){return startdate;}
    public void setStartdate(Date startdate)
    {
        this.startdate = startdate;
    }
    public Date getRetdate(){return retdate;}
    public void setRetdate(Date retdate)
    {
        this.retdate = retdate;
    }
}
