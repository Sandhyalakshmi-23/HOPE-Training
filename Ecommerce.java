class Product{
    String name;
    int stock;
    double price;
    Product(String name,int stock,double price){
        System.out.println("Name:"+name);
        System.out.println("Stock:"+stock);
        System.out.println("Price:"+price);
    }
}
class User{
    String address;
    User(String name,string address){
        this.address=address;
        super(name);
        System.out.println("User created");
    }
}
class Order{
    int quantity;

}
class OrderService{
    void Placeorder(Order order) throws OutofstockException,PaymentFailedException, OrderProcessingException{
        if(Order.Product.Stock<=0){
            throw new OutofstockException("out of stock!!");
        }if(Math.random()<0.4){
            throw new PaymentFailedException("oops..payment failed!!");
        }if(Math.random()<0.2){
            throw new OrderProcessingException("Order processing failed!!");
        }
    }
}
class Ecommerce{
    pubic static void main(String[] args){
        Product p=new Product("mouse",5,200.0);
        User u=new User("test","abc","chennai");
        Order o=new Order(p,u,3);
        OrderService os=new orderService();
        os.Placeorder(o);

    }
}