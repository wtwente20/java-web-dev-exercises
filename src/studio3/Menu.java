package studio3;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItems> menuItems = new ArrayList<>();

    public Menu(Date date, ArrayList<MenuItems> items) {
        this.lastUpdated = date;
        this.menuItems = items;
    }


    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void addNewItems(ArrayList<MenuItems> menuItems) {
        this.menuItems = menuItems;
    }
}
