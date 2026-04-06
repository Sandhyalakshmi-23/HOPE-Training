package com.ECommerce;

public class Product {
    String name;
    int stock;
    double price;
    Product(String name,int stock,double price){
        System.out.println("Name:"+name);
        System.out.println("Stock:"+stock);
        System.out.println("Price:"+price);
    }
}
