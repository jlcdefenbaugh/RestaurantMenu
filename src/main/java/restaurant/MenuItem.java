package restaurant;

import java.util.Date;

public class MenuItem {

    private String name;
    private double price;
    private String description;
    private String category;
    private Date dateAdded;

    public MenuItem(String n, double p, String d, String c) {
        this.name = n;
        this.price = p;
        this.description = d;
        this.category = c;
        this.dateAdded = new Date();
    }

    public void setName(String name) { this.name = name;}

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
