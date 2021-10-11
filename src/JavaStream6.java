import java.util.*;
import java.util.stream.Collectors;

class Product6
{
    int id;
    String name;
    float price;

    public Product6(int id,String name,float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

public int getId()
{

    return id;

}
public String getName()
{
    return name;
}
public float getPrice()
    {
        return price;
    }
}

public class JavaStream6
{
    public static void main(String args[])
    {
        List<Product6> productsList=new ArrayList<>();
        productsList.add(new Product6(1,"hp",25000f));
        productsList.add(new Product6(2, "dell", 30000f));
        productsList.add(new Product6(3, "lenovo", 28000f));
        productsList.add(new Product6(4, "sony", 28000f));
        productsList.add(new Product6(5, "apple", 90000f));

        List<Float> productPriceList=productsList.stream()
                .filter(p -> p.price >30000)
                .map(Product6::getPrice)
                .collect(Collectors.toList());
        System.out.println(productPriceList);
    }
}
