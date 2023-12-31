import com.tlalim.supermarket.superm.*;

public class MainSupermarket {

public static void main(String[] args)
{
Supermarket sup = 
	new Supermarket("Magnit","Rehovot,Herzel 5");

Product p1 = 
      new Product("Apples", 101, 1.99, "per pound");
Product p2 = 
	new Product("Milk", 102, 2.49, "per liter");
Product p3 = 
	new Product("Bread", 103, 2.99, "per loaf");
Product p4 = 
	new Product("Eggs", 104, 1.49, "per dozen");
Product p5 = 
	new Product("Cereal", 105, 3.99, "per box");
Product p6 = 
	new Product("Chicken", 106, 5.99, "per pound");
Product p7 = 
	new Product("Toothpaste", 107, 2.99, "per tube");
sup.addProduct(p1, 50);
sup.addProduct(p2, 20);
sup.addProduct(p3, 25);
sup.addProduct(p4, 15);
sup.addProduct(p5, 12);
sup.addProduct(p6, 30);
sup.addProduct(p7, 23);
	     
Product p8 = new Product("Cereal", 105, 3.99, "per box");
sup.addProduct(p8, 15);

sup.removeProduct(106, 10);
sup.displayProducts();

sup.removeProduct(105);
sup.removeProduct(101,50);

sup.findProduct(106);
sup.printZeroStock();
System.out.println("Total cost of products: " + sup.getTotalCost());

}

}
/*
       Product
       --------
       name(String)
       code(int)
       price(double)
       unit(String)
              
       Supermarket
       -------------
       name(String)
       address(String)
       TreeMap<Product,Integer> products
       =================================
       addProduct(Product pr,int quantity)
       displayAllProducts()
       removeProduct(code , int quantity)
       removeProduct(code)











       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       


*/