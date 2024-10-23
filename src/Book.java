public class Book extends Product
{
    private int pages ;


    public Book(String name, double price, String description) {
        super(name, price, description);
    }
    @Override
    public String getDescription() {
        return "The Book have   " + pages;
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