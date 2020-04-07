package com.company;

public class Product {
    String name;
    int price;
    int productCode;
    int numOfItems;

    {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.numOfItems = numOfItems;
    }

    public Product(String name, int price, int productCode, int numOfItems) {
    }

    String name() {return this.name;}
    int price() {return this.price;}
    int getProductCode() {return this.productCode;}
    int getNumOfItems() {return this.numOfItems;}
}
