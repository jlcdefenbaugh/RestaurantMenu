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

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public Date getDateAdded() {
        return dateAdded;
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


    @Override
    public String toString() {
        return name + '\n' +
                description + '\n' +
                category.toUpperCase() + " | $" + price;
    }




}
