package SupermarketData;

import java.io.Serializable;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Sameer
 */
public class SalesClerk extends Employee implements Serializable{
    private String location;
    private String boss;

    public SalesClerk(String newfName,String newlName,char gender,String regDOB)
    {
        super(newfName,newlName,gender,regDOB);
    }
    public String getLocation()
    {
        return location;
    }
    public String getBoss()
    {
        return boss;
    }
    public void setLocation(String newLocation)
    {
        location = newLocation;
    }
    public void setBoss(String newBoss)
    {
        boss = newBoss;
    }
}
