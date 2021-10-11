import java.util.*;
import java.util.stream.Collectors;

class Product5
{
    int id;
    String name;
    float price;

    public Product5(int id,String name,float price)
    {
        this.id=id;
        this.name=name;
        this.price=price;
    }
}
public class JavaStreamExample5
{
    public static void main(String args[])
    {
        List<Product> productsList=new ArrayList<>();
        productsList.add(new Product(1,"hp",25000f));
        productsList.add(new Product(2, "dell", 30000f));
        productsList.add(new Product(3, "lenovo", 28000f));
        productsList.add(new Product(4, "sony", 28000f));
        productsList.add(new Product(5, "apple", 90000f));

        Map<Integer,String> productPriceMap= productsList.stream()
                .collect(Collectors.toMap(p -> p.id,p->p.name));
        System.out.println(productPriceMap);

    }
}
