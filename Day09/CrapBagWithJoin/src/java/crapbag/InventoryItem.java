/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crapbag;

public class InventoryItem {
    private int id;
    private String description;
    private double price;
    private String distributorName;
    
    public InventoryItem(int id, String desc, double price) {
        this.id = id;
        this.description = desc;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return String.format("%d: %s -- %f, sold by %s", id, description, price, distributorName);
    }

    public String getDistributorName() {
        return distributorName;
    }

    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
