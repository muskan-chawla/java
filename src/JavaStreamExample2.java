import java.util.*;
import java.util.stream.Collectors;

class Product1
{
    int id;
    String name;
    float price;

    public Product1(int id,String name,float price)
    {
        this.id=id;
        this.name=name;
        this.price=price;
    }
}
public class JavaStreamExample2
{
    public static void main(String args[])
    {
        List<Product> productsList=new ArrayList<>();
        productsList.add(new Product(1,"hp",25000f));
        productsList.add(new Product(2,"dell",30000f));
        productsList.add(new Product(3,"lenovo",28000f));
        productsList.add(new Product(4,"sony",28000f));
        productsList.add(new Product(5,"apple",90000f));

         productsList.stream()
                .filter(product-> product.price==30000)
                .forEach(product ->System.out.println(product.name));

    }
}
