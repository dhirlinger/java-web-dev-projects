package org.launchcode;

import java.time.LocalDate;
import java.util.Objects;


public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    //private LocalDate dateAdded;
    private boolean isNew;

    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = true;
        //this.dateAdded = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String isNew() {
        if (isNew) {
            return "NEW";
        }
        else {return ""; }
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString(){
        return "\n" + getName() + "\n" + getCategory() + "\n" +
                getDescription() + "\n" + getPrice() + " " + isNew();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(getName(), menuItem.getName()) && Objects.equals(getCategory(), menuItem.getCategory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCategory());
    }

    /*public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }*/
}
