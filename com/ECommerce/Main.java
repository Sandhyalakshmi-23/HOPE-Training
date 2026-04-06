package com.ECommerce;
import com.ECommerce.Product;
import com.ECommerce.OrderService;
public class Main {
    public static void main(String[] args){
        User u=new User("Testuser","Chennai");
        Product p=new Product("Mouse",800);
        Order o=new Order(u,p,4);
        OrderService os=new OrderService();
        service.placeorder(o);

    }
}
