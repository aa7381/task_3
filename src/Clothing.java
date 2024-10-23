public class Clothing extends Product{
    private String brand;

    public Clothing(String name, double price, String description) {
        super(name, price, description);
    }


    @Override
    public String getDescription() {
        return "This clothing is of " + brand;
    }

    public void price ()
    {
        System.out.println("price: "+  super.getPrice());
    }
    public void name ()
    {
        System.out.println("name: "+  super.getName());
    }
}
