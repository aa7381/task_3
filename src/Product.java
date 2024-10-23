

public class Product
{
     String name ;
      double price ;
      String description;
    public Product(String name ,double price , String description)
    {
        this.name = name ;
        this.price = price ;
        this.description = description ;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
//public String toString() {
 //   return "Product Name: " + name + ", Price: " + price + ", Description: " + description;
//}