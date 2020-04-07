package com.company;

import jdk.jfr.Category;

import java.util.ArrayList;

import static org.graalvm.compiler.options.OptionType.User;


public class Main {

    public static void main(String[] args) {
        Category category1 = new Category();
        Category category2 = new Category("blahblah");
        Category category3 = new Category("bla", new ArrayList<>());

        category1.addProduct(new Product("1",5, 999, 9));
        category2.addProduct(new Product("2",5, 999,9));
        category3.addProduct(new Product("3",5, 999,9));


        busket busket1 = new busket();
        busket busket2 = new busket(new User("aaa@gmail.com"));
        busket busket3 = new busket(new User("ooo@gmail.com"),new Product[5]);

        Product product1 = new Product("name",5, 7777, 0);
        Product product2 = new Product("name2",5, 6666,9);

        busket2.addProduct(product1);
        busket3.addProduct(product1);
        busket3.addProduct(product2);

        busket2.deleteProduct(product2);

        busket3.buy();
    }