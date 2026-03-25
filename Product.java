class Product{
    int id;
    String name;
    double price;
    int quantity;
    Product(int id,String name,double price,int quantity){
        this.id=id;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    double getTotalPrice(){
        double total=price*quantity;
        return total;
    }
    void display(){
        System.out.println("Details");
        System.out.println("ID:"+this.id);
        System.out.println("Name:"+this.name);
        System.out.println("Price:"+this.price);
        System.out.println("Quantity:"+this.quantity);
    }
    public static void main(String[] args){
        Product[] arr=new Product[3];
        Product p1=new Product(101,"cup",100.0,2);
        p1.display();
        System.out.println("Total:"+p1.getTotalPrice());
        arr[0]=p1;
        Product p2=new Product(102,"glass",200.0,2);
        p2.display();
        System.out.println("Total:"+p2.getTotalPrice());
        arr[1]=p2;
        Product p3=new Product(103,"bottle",50.0,2);
        p3.display();
        System.out.println("Total:"+p3.getTotalPrice());
        arr[2]=p3;
        double grandtotal=0.0;
        grandtotal=p1.getTotalPrice()+p2.getTotalPrice()+p3.getTotalPrice();
        System.out.println(grandtotal);
    }
}
