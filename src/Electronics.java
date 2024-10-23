public class Electronics extends Product
{
    private String charge ;


    public Electronics(String name, double price, String description) {
        super(name, price, description);
    }
    @Override
    public String getDescription() {
        return "This Electronics is  " + charge;
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
