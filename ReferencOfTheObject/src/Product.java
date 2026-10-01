public class Product
{
    private String name;
    private String brand;
    private int price;

    public Product(String Name, String Brand, int Price)
    {
        this.name=Name;
        this.brand=Brand;
        this.price=Price;
    }
    public void showDetails()
    {
        System.out.println("Product name: "+name);
        System.out.println("Product brand: "+brand);
        System.out.println("Product price: "+price);

    }

}
