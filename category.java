package com.company;

import java.util.ArrayList;

public class category {
    String name;

    public ArrayList<Product> products;

    public void Category() {
        this.products = new ArrayList<>();
    }

    public void Category(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void Category(String name, ArrayList<Product> products) {
        this.name = name;
        this.products = products;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deleteProduct(Product product){
        products.remove(product);
    }

    public void addProduct(Product product){
        products.add(product);
    }

}
